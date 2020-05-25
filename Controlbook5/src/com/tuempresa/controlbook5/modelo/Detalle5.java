package com.tuempresa.controlbook5.modelo;
 
import javax.persistence.*;
 
@Embeddable
public class Detalle5 {
 
    private int inicio, fin;
    
 
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    private Retraso retraso;


	public int getInicio() {
		return inicio;
	}


	public void setInicio(int inicio) {
		this.inicio = inicio;
	}


	public int getFin() {
		return fin;
	}


	public void setFin(int fin) {
		this.fin = fin;
	}


	public Retraso getRetraso() {
		return retraso;
	}


	public void setRetraso(Retraso retraso) {
		this.retraso = retraso;
	}	


}