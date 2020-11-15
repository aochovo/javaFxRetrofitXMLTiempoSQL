/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author alex
 */
@Root(name="consulta_municipiero", strict =false)
public class RaizMunicipio {
    
    @ElementList
    private List<Municipio> municipiero;

    public List<Municipio> getMunicipiero() {
        return municipiero;
    }

    public void setMunicipiero(List<Municipio> municipiero) {
        this.municipiero = municipiero;
    }

    @Override
    public String toString() {
        return "RaizMunicipio{" + "municipiero=" + municipiero + '}';
    }
    
    
}
