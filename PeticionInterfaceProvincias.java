/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 *
 * @author alex
 */
public interface PeticionInterfaceProvincias {
    @GET("ConsultaProvincia")
    Call<RaizProvincia> pedirProvincia();
}
