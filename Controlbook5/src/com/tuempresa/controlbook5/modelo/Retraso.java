package com.tuempresa.controlbook5.modelo;

import java.math.*;

import javax.persistence.*;
import org.openxava.annotations.*;
 
/**
 * @author fabian
 *
 */
@Entity
public class Retraso {
 
    @Id @Column(length=9)
    private int numero;
 
    @Column(length=50) @Required
    private String descripcion;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList
    private Funcionario funcionario;
    
    @ManyToOne( 
        fetch=FetchType.LAZY, 
        optional=true) 
    @DescriptionsList 
    private Frente frente; 
    
         
    @Stereotype("GALERIA_IMAGENES") 
    @Column(length=32) 
    private String fotos;
     
    @Stereotype("TEXTO_GRANDE") 
    private String observaciones;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Frente getFrente() {
		return frente;
	}

	public void setFrente(Frente frente) {
		this.frente = frente;
	}

	public String getFotos() {
		return fotos;
	}

	public void setFotos(String fotos) {
		this.fotos = fotos;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}    
    
	

	}
 
