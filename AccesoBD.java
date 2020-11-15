/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alex
 */
class AccesoBD {
       private static Connection conexion = null;
	private static Statement stmt = null;
    public static void conectar() {

		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/espanita", "root", "");
			stmt =conexion.createStatement();
                        System.out.println("Acierto");
		} catch (SQLException ex) {
			System.out.println(ex);
                        System.out.println("Error-------");
		}
	}

    static boolean sacarNumeroProvincias() {
            Boolean n = null;
        String sql="SELECT COUNT(*) as cuenta FROM provincia;";
        int nprovincias=0;
	ResultSet rs=null;
		try {
                    rs=stmt.executeQuery(sql);
                    while(rs.next())
                        {
                            nprovincias=rs.getInt("cuenta");
			 
                        }
                        if (nprovincias!=52) {
                        n=false;
                    }else{
                        n=true;    
                        }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
    }

    static void introducirProvincias(RaizProvincia a) {     
       try {
           conexion.setAutoCommit(false);
           List<Provincia> lista_provincias=a.getProvinciero();
        for (Provincia p : lista_provincias) {
           String query="INSERT INTO provincias(codigo,nombre) VALUES('"+p.getCodigo()+"','"+p.getNombre()+"');";
           stmt.executeUpdate(query);
           conexion.commit();
        }
        } catch (SQLException ex) {
           Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    }

    /*static ArrayList<String> recogerDatosProvincias() {
        
        ArrayList<String> lista_provincias=new ArrayList<String>();
		
		String sql="SELECT * FROM provincias;";
		try {
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				String nombre_pro=rs.getString("nombre");			
				lista_provincias.add(nombre_pro);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista_provincias;
    }*/
    
}

