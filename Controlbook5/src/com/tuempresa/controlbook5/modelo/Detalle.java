package com.tuempresa.controlbook5.modelo;
 
import javax.persistence.*;
 
@Embeddable
public class Detalle {
 
    private int cantidad;
    private String unidad;
 
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    private Material material;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
 
}