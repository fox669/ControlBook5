package com.tuempresa.controlbook5.modelo;
 
import javax.persistence.*;
 
@Embeddable
public class Detalle4 {
 
    private int cantidad, horasLaboradas, horasDisponibles,horasFuera;
    
    
 
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    private Personal personal;



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



	public Personal getPersonal() {
		return personal;
	}



	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

}