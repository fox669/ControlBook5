package com.tuempresa.controlbook5.modelo;
 
import javax.persistence.*;
 
@Embeddable
public class Detalle3 {
 
    private int cantidad, horasLaboradas, horasDisponibles,horasFuera;
    private String localizacion;
    
 
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    private Equipo equipo;


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public int getHorasLaboradas() {
		return horasLaboradas;
	}


	public void setHorasLaboradas(int horasLaboradas) {
		this.horasLaboradas = horasLaboradas;
	}


	public int getHorasDisponibles() {
		return horasDisponibles;
	}


	public void setHorasDisponibles(int horasDisponibles) {
		this.horasDisponibles = horasDisponibles;
	}


	public int getHorasFuera() {
		return horasFuera;
	}


	public void setHorasFuera(int horasFuera) {
		this.horasFuera = horasFuera;
	}


	public String getLocalizacion() {
		return localizacion;
	}


	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}


	public Equipo getEquipo() {
		return equipo;
	}


	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}





	

}