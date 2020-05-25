package com.tuempresa.controlbook5.modelo;
 
import java.math.*;

import javax.persistence.*;
import org.openxava.annotations.*;
 
/**
 * @author fabian
 *
 */
@Entity
public class Personal {
 
    @Id @Column(length=9)
    private int numero;
 
    @Column(length=50) @Required
    private String cargo;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList
    private Frente frente;   
   
     
   
     
    public int getNumero() {
		return numero;
	}




	public void setNumero(int numero) {
		this.numero = numero;
	}




	public String getCargo() {
		return cargo;
	}




	public void setCargo(String cargo) {
		this.cargo = cargo;
	}




	public Frente getFrente() {
		return frente;
	}




	public void setFrente(Frente frente) {
		this.frente = frente;
	}




	public String getObservaciones() {
		return observaciones;
	}




	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}




	@Stereotype("TEXTO_GRANDE") 
    private String observaciones;

	
   
 
}