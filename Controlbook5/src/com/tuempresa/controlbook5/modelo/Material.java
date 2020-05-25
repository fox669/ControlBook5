package com.tuempresa.controlbook5.modelo;
 
import java.math.*;

import javax.persistence.*;
import org.openxava.annotations.*;
 
/**
 * @author fabian
 *
 */
@Entity
public class Material {
 
    @Id @Column(length=9)
    private int numero;
 
    @Column(length=50) @Required
    private String descripcion;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList
    private Proveedor proveedor;
    
    @ManyToOne( 
        fetch=FetchType.LAZY, 
        optional=true) 
    @DescriptionsList 
    private CategoriaMaterial categoriaMaterial; 
    
    @Stereotype("DINERO") 
    private BigDecimal precio; 
     
    @Stereotype("GALERIA_IMAGENES") 
    @Column(length=32) 
    private String fotos;
     
    @Stereotype("TEXTO_GRANDE") 
    private String observaciones;

    
 
    public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
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
	public CategoriaMaterial getCategoriaMaterial() {
		return categoriaMaterial;
	}
	public void setCategoria(CategoriaMaterial categoriaMaterial) {
		this.categoriaMaterial = categoriaMaterial;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
 
}