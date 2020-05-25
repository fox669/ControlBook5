package com.tuempresa.controlbook5.modelo;
 
import javax.persistence.*;
 
@Embeddable 
public class Datos {
 
    @Column(length = 30) 
    private String direccion;
 
    @Column(length = 5)
    private int macosId;
 
    @Column(length = 20)
    private String eMail;
 
    @Column(length = 30)
    private int telefono;

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getMacosId() {
		return macosId;
	}

	public void setMacosId(int macosId) {
		this.macosId = macosId;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
 
}