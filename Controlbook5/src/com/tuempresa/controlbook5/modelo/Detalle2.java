package com.tuempresa.controlbook5.modelo;
 
import javax.persistence.*;
 
@Embeddable
public class Detalle2 {
 
    private int inicio, fin;
    
 
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    private Avance avance;


	public int getInicio() {
		return inicio;
	}


	public void setInicio(int inicio) {
		this.inicio = inicio;
	}


	public Avance getAvance() {
		return avance;
	}


	public void setAvance(Avance avance) {
		this.avance = avance;
	}


	public int getFin() {
		return fin;
	}


	public void setFin(int fin) {
		this.fin = fin;
	}


}