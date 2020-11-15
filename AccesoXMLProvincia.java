/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import java.util.ArrayList;
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
public class AccesoXMLProvincia {



    
    public static void pedirProvicias()
    {
         //http://ovc.catastro.meh.es/ovcservweb/ovcswlocalizacionrc/ovccallejero.asmx/ConsultaProvincia
         String base="http://ovc.catastro.meh.es/ovcservweb/ovcswlocalizacionrc/ovccallejero.asmx/";
        
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(base).addConverterFactory(SimpleXmlConverterFactory.create())
            .build();
        PeticionInterfaceProvincias servicio=retrofit.create(PeticionInterfaceProvincias.class);
        Call<RaizProvincia> llamada=servicio.pedirProvincia();
        llamada.enqueue(new Callback<RaizProvincia>() {
                 @Override
                 public void onResponse(Call<RaizProvincia> call, Response<RaizProvincia> rspns) {
                     RaizProvincia provincias=rspns.body();
                     List<Provincia> lista_provincias=provincias.getProvinciero();
                     //ClasePrincipal.devolverProvincias(provincias);
                     for (Provincia provincia : lista_provincias) {
                         System.out.println("Código provincia: "+provincia.getCodigo()+" | "+"Nombre: "+provincia.getNombre());
                     }
                 }

                 @Override
                 public void onFailure(Call<RaizProvincia> call, Throwable thrwbl) {
                     System.out.println("ERROR: "+thrwbl.getLocalizedMessage());
                 }
    });

  
}
}

