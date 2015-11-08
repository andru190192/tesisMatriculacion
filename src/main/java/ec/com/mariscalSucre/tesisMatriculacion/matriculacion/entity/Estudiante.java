package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "estudiante")
public class Estudiante implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Persona persona;
	private String papa;
	private String cedulaPapa;
	private String profesionPapa;
	private String telefonoPapa;
	private String direccionPapa;
	private String mama;
	private String cedulaMama;
	private String profesionMama;
	private String telefonoMama;
	private String direccionMama;
	private String representante;
	private String cedulaRepresentante;
	private String telefonoRepresentante;
	private String direccionRepresentante;
	private String emailRepresentante;
	private String escuelaProcede;
	private String observaciones;
	private String folio;
	private Boolean activo;
	private Date fechaRegistro;

	public Estudiante() {
	}

	public Estudiante(Integer id, Persona persona, String papa, String cedulaPapa, String profesionPapa,
			String telefonoPapa, String direccionPapa, String mama, String cedulaMama, String profesionMama,
			String telefonoMama, String direccionMama, String representante, String cedulaRepresentante,
			String telefonoRepresentante, String direccionRepresentante, String emailRepresentante,
			String escuelaProcede, String observaciones, String folio, Boolean activo, Date fechaRegistro) {
		super();
		this.id = id;
		this.persona = persona;
		this.papa = papa;
		this.cedulaPapa = cedulaPapa;
		this.profesionPapa = profesionPapa;
		this.telefonoPapa = telefonoPapa;
		this.direccionPapa = direccionPapa;
		this.mama = mama;
		this.cedulaMama = cedulaMama;
		this.profesionMama = profesionMama;
		this.telefonoMama = telefonoMama;
		this.direccionMama = direccionMama;
		this.representante = representante;
		this.cedulaRepresentante = cedulaRepresentante;
		this.telefonoRepresentante = telefonoRepresentante;
		this.direccionRepresentante = direccionRepresentante;
		this.emailRepresentante = emailRepresentante;
		this.escuelaProcede = escuelaProcede;
		this.observaciones = observaciones;
		this.folio = folio;
		this.activo = activo;
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	private Integer id;
	private Persona persona;
	private String papa;
	private String cedulaPapa;
	private String profesionPapa;
	private String telefonoPapa;
	private String direccionPapa;
	private String mama;
	private String cedulaMama;
	private String profesionMama;
	private String telefonoMama;
	private String direccionMama;
	private String representante;
	private String cedulaRepresentante;
	private String telefonoRepresentante;
	private String direccionRepresentante;
	private String emailRepresentante;
	private String escuelaProcede;
	private String observaciones;
	private String folio;
	private Boolean activo;
	private Date fechaRegistro;

	@Id
	@SequenceGenerator(allocationSize = 1, name = "ESTUDIANTE_ESTUDIANTEID_GENERATOR", sequenceName = "ESTUDIANTE_ESTUDIANTEID_SEQ")
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ESTUDIANTE_ESTUDIANTEID_GENERATOR")
	@Column(name = "estudianteid", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	@OneToOne
	@JoinColumn(name = "personaid", nullable = false)
	public Persona getPersona() {
		return this.persona;
	}

	@Length(min = 3, message = "EL NOMBRE DEL PADRE DEBE TENER MINIMO 3 LETRAS")
	@Column(name = "papa", nullable = false)
	public String getPapa() {
		return papa;
	}

	public String getCedulaPapa() {
		return cedulaPapa;
	}

	public String getProfesionPapa() {
		return profesionPapa;
	}

	public String getTelefonoPapa() {
		return telefonoPapa;
	}

	public String getDireccionPapa() {
		return direccionPapa;
	}

	public String getMama() {
		return mama;
	}

	public String getCedulaMama() {
		return cedulaMama;
	}

	public String getProfesionMama() {
		return profesionMama;
	}

	public String getTelefonoMama() {
		return telefonoMama;
	}

	public String getDireccionMama() {
		return direccionMama;
	}

	public String getRepresentante() {
		return representante;
	}

	public String getCedulaRepresentante() {
		return cedulaRepresentante;
	}

	public String getTelefonoRepresentante() {
		return telefonoRepresentante;
	}

	public String getDireccionRepresentante() {
		return direccionRepresentante;
	}

	public String getEmailRepresentante() {
		return emailRepresentante;
	}

	@Column()
	public String getEscuelaProcede() {
		return escuelaProcede;
	}

	public String getObservaciones() {
		return observaciones;
	}

	@Column(length = 5)
	public String getFolio() {
		return this.folio;
	}

	@Column(nullable = false)
	public Boolean getActivo() {
		return this.activo;
	}

	@Column(name = "fecharegistro")
	public Date getFechaRegistro() {
		return fechaRegistro;
	}

}