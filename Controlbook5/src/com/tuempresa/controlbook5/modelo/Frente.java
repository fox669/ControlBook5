package com.tuempresa.controlbook5.modelo;
 
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;
 
@Entity
public class Frente {
 
    @Id
    @Hidden 
    @GeneratedValue(generator="system-uuid") 
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    private String oid;
 
    @Column(length=50)
    private String descripcion;

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
 
}