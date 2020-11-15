/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import java.awt.Label;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

/**
 *
 * @author alex
 */
public class ClasePrincipal extends Application {
    
   public static void main(String[] args) {
       
       launch(args);
        
    }

    static void devolverProvincias(RaizProvincia provincias) {
        AccesoBD.introducirProvincias(provincias);
    }

   
   
   
   
    @Override
    public void start(Stage stage) throws Exception {
       AccesoBD.conectar();
       //boolean aux=AccesoBD.sacarNumeroProvincias();
       //if(aux==false)
       //{
           AccesoXMLProvincia.pedirProvicias();
       //    aux=AccesoBD.sacarNumeroProvincias();
       //}
       //else{
       //    System.out.println("Finalizado"); 
       //}
       
       AccesoXMLMunicipio.pedirMunicipios();
    }
    }
    


   

