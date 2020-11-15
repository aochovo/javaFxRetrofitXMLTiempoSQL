/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 *
 * @author alex
 */
public class AccesoXMLMunicipio {
    
 
    
    public static void pedirMunicipios()
    {
        //http://ovc.catastro.meh.es/ovcservweb/ovcswlocalizacionrc/ovccallejero.asmx/ConsultaMunicipio?Provincia=Madrid&Municipio=
         String base="http://ovc.catastro.meh.es/ovcservweb/ovcswlocalizacionrc/ovccallejero.asmx/";
        
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(base).addConverterFactory(SimpleXmlConverterFactory.create())
            .build();
        PeticionInterfaceMunicipio servicio=retrofit.create(PeticionInterfaceMunicipio.class);
        String provincia="Toledo";
        Call<RaizMunicipio> llamada=servicio.pedirMunicipio();
        llamada.enqueue(new Callback<RaizMunicipio>() {
                 @Override
                 public void onResponse(Call<RaizMunicipio> call, Response<RaizMunicipio> rspns) {
                    RaizMunicipio municipios=rspns.body();
                     List<Municipio> lista_provincias=municipios.getMunicipiero();
                     for (Municipio municipio : lista_provincias) {
                         Codigo_Municipio co_municipio=municipio.getCodigo_muni();
                         System.out.println("Código municipio: "+co_municipio.getCm()+" | "+"Nombre: "+municipio.getNombre_municipio());
                     }
                 }

                 @Override
                 public void onFailure(Call<RaizMunicipio> call, Throwable thrwbl) {
                     System.out.println("ERROR: "+thrwbl.getMessage());
                 }
    });

    }
}
     

