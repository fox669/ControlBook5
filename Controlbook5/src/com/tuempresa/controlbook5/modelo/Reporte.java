package com.tuempresa.controlbook5.modelo; 
 
import java.time.*;
import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;
import org.openxava.calculators.*;
import com.macos.controlbook.calculadores.*;
 
@Entity
@View(members= 
	"anyo, numero, fecha;" + 
	"funcionario;" + 
	"detalles;" +
	"avance;" +
	"equipo;"+
	"personal;"+
	"retraso;"+
	"observaciones"
)
public class Reporte {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@Hidden
	@GenericGenerator(name="system-uuid", strategy="uuid")
	@Column(length=32)
	private String oid;
 
    @Column(length = 4)
    @DefaultValueCalculator(CurrentYearCalculator.class) 
    private int anyo;
 
    public Collection<Detalle4> getPersonal() {
		return personal;
	}

	public void setPersonal(Collection<Detalle4> personal) {
		this.personal = personal;
	}

	@Column(length = 6)
    @DefaultValueCalculator(value=CalculadorSiguienteNumeroParaAnyo.class,
    	properties=@PropertyValue(name="anyo")                                
    )
    private int numero;
 
    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class) 
    private LocalDate fecha;
    
    @ManyToOne(fetch=FetchType.LAZY, optional=false) 
    @ReferenceView("Simple") 
    private Funcionario funcionario;
    
    @ElementCollection
    @ListProperties("material.numero, material.descripcion, cantidad , unidad")
    private Collection<Detalle> detalles;
    
    @ElementCollection
    @ListProperties("avance.numero, avance.descripcion, inicio , fin")
    private Collection<Detalle2> avance;
    
    @ElementCollection
    @ListProperties("equipo.numero, equipo.descripcion,  cantidad, horasLaboradas, horasDisponibles,horasFuera,localizacion")
    private Collection<Detalle3> equipo;
    
    @ElementCollection
    @ListProperties("personal.numero, personal.cargo,  cantidad, horasLaboradas, horasDisponibles")
    private Collection<Detalle4> personal;
    
    @ElementCollection
    @ListProperties("retraso.numero, retraso.descripcion, inicio, fin")
    private Collection<Detalle5> retraso;
    
 
    public Collection<Detalle5> getRetraso() {
		return retraso;
	}

	public void setRetraso(Collection<Detalle5> retraso) {
		this.retraso = retraso;
	}

	@Stereotype("MEMO")
    private String observaciones;

	public Collection<Detalle3> getEquipo() {
		return equipo;
	}

	public void setEquipo(Collection<Detalle3> equipo) {
		this.equipo = equipo;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Collection<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(Collection<Detalle> detalles) {
		this.detalles = detalles;
	}

	public Collection<Detalle2> getAvance() {
		return avance;
	}

	public void setAvance(Collection<Detalle2> avance) {
		this.avance = avance;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	
 
}