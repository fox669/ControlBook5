package com.macos.controlbook.calculadores;

import javax.persistence.*;
import org.openxava.calculators.*;
import org.openxava.jpa.*;
 
public class CalculadorSiguienteNumeroParaAnyo
    implements ICalculator { 
 
    private int anyo; 
 
    public Object calculate() throws Exception { 
        Query query = XPersistence.getManager() 
            .createQuery("select max(f.numero) from Reporte f where f.anyo = :anyo");
                                                              
        query.setParameter("anyo", anyo); 
        Integer ultimoNumero = (Integer) query.getSingleResult();
        return ultimoNumero == null ? 1 : ultimoNumero + 1; 
                                           
    }
 
    public int getAnyo() {
        return anyo;
    }
 
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
 
}