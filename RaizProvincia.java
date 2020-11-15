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
@Root(name="consulta_provinciero", strict =false)
public class RaizProvincia {
    @ElementList
    private List<Provincia> provinciero;

    public List<Provincia> getProvinciero() {
        return provinciero;
    }

    public void setProvinciero(List<Provincia> provinciero) {
        this.provinciero = provinciero;
    }

    @Override
    public String toString() {
        return "RaizProvincia{" + "provinciero=" + provinciero + '}';
    }
    
    
}
