/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author alex
 */
@Root(name="consulta_provinciero", strict =false)
class Provincia {
   
    @Element(name = "cpine")
    private String codigo;
    @Element(name = "np")
    private String nombre;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Provinciero{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    } 
}
