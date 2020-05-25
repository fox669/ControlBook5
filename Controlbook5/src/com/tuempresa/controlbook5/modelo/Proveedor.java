package com.tuempresa.controlbook5.modelo;
 
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;
import java.util.*;
 
@Entity
public class Proveedor {
 
    @Id @GeneratedValue(generator="system-uuid") @Hidden
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length=32)
    private String oid;
 
    @Column(length=50) @Required
    private String nombre;
    
    @OneToMany(mappedBy="proveedor")
    @ListProperties("numero, descripcion, precio")
    private Collection<Material> materials;

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Material> getMaterials() {
		return materials;
	}

	public void setMaterials(Collection<Material> materials) {
		this.materials = materials;
	}
 
}