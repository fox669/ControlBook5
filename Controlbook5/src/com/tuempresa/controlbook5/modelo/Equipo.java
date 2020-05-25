package com.tuempresa.controlbook5.modelo;
 
import java.math.*;

import javax.persistence.*;
import org.openxava.annotations.*;
 
/**
 * @author fabian
 *
 */
@Entity
public class Equipo {
 
    @Id @Column(length=9)
    private int numero;
 
    @Column(length=50) @Required
    private String descripcion;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList
    private Proveedor proveedor;
    
   
    
    @Stereotype("ARCHIVO") 
    private String archivo; 
     
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

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
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