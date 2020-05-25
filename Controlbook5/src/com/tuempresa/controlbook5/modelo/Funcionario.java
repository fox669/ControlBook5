package com.tuempresa.controlbook5.modelo;
 
import javax.persistence.*;
import org.openxava.annotations.*;
 
@Entity  
@View(name="Simple", 
	members="numero, nombre" 
)
public class Funcionario {
 
    @Id  
    @Column(length=6)  
    private int numero;
 
    @Column(length=50) 
    @Required  
    private String nombre;
    
    @Embedded 
    private Datos datos; 
 
    public Datos getDatos() {
        if (datos == null) datos = new Datos(); 
        return datos;
    }
 
    public void setDatos(Datos datos) {
        this.datos = datos;
    }
 
    public int getNumero() {
        return numero;
    }
 
    public void setNumero(int numero) {
        this.numero = numero;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
}