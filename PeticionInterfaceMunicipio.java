/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 *
 * @author alex
 */
public interface PeticionInterfaceMunicipio {
    @GET("ConsultaMunicipio?Provincia=Madrid&Municipio=")
    Call<RaizMunicipio> pedirMunicipio();
    //@Path("user") String user
}