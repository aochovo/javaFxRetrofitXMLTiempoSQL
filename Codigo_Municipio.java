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
@Root(name="consulta_municipiero", strict =false)
class Codigo_Municipio {
    @Element(name = "cp")
    private String cp;
    @Element(name = "cm")
    private String cm;

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCm() {
        return cm;
    }

    public void setCm(String cm) {
        this.cm = cm;
    }

    @Override
    public String toString() {
        return "Codigo_Municipio{" + "cp=" + cp + ", cm=" + cm + '}';
    }  
}
