package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entityAux.Grado;

@Entity
@Table(name = "estudiante")
public class Estudiante implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Persona persona;
	private Grado grado;
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

	public Estudiante(Integer id, Persona persona, Grado grado, String papa, String cedulaPapa, String profesionPapa,
			String telefonoPapa, String direccionPapa, String mama, String cedulaMama, String profesionMama,
			String telefonoMama, String direccionMama, String representante, String cedulaRepresentante,
			String telefonoRepresentante, String direccionRepresentante, String emailRepresentante,
			String escuelaProcede, String observaciones, String folio, Boolean activo, Date fechaRegistro) {
		super();
		this.id = id;
		this.persona = persona;
		this.grado = grado;
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

	@Enumerated(EnumType.STRING)
	@Column(name = "gradoid", nullable = false)
	public Grado getGrado() {
		return this.grado;
	}

	@Length(min = 3, message = "EL NOMBRE DEL PADRE DEBE TENER MINIMO 3 LETRAS")
	@Column(name = "papa", nullable = false)
	public String getPapa() {
		return papa;
	}

	@Pattern(regexp = "[0-9]{10}+|[0-9]{13}+", message = "LA CÉDULA DEL PADRE ACEPTA DE 10 A 13 DÍGITOS NUMÉRICOS")
	@Column(nullable = false, length = 13)
	public String getCedulaPapa() {
		return cedulaPapa;
	}

	@Column(name = "profesionpapa")
	public String getProfesionPapa() {
		return profesionPapa;
	}

	@Column(name = "telefonopapa", nullable = false)
	public String getTelefonoPapa() {
		return telefonoPapa;
	}

	@Column(name = "direccionpapa")
	public String getDireccionPapa() {
		return direccionPapa;
	}

	@Length(min = 3, message = "EL NOMBRE DE LA MADRE DEBE TENER MINIMO 3 LETRAS")
	@Column(name = "mama", nullable = false)
	public String getMama() {
		return mama;
	}

	@Pattern(regexp = "[0-9]{10}+|[0-9]{13}+", message = "LA CÉDULA DE LA MADRE ACEPTA DE 10 A 13 DÍGITOS NUMÉRICOS")
	@Column(nullable = false, length = 13)
	public String getCedulaMama() {
		return cedulaMama;
	}

	@Column(name = "profesionmama")
	public String getProfesionMama() {
		return profesionMama;
	}

	@Column(name = "telefonomama", nullable = false)
	public String getTelefonoMama() {
		return telefonoMama;
	}

	@Column(name = "direccionmama")
	public String getDireccionMama() {
		return direccionMama;
	}

	@Length(min = 3, message = "EL NOMBRE DEL REPRESENTANTE DEBE TENER MINIMO 3 LETRAS")
	@Column(name = "representante", nullable = false)
	public String getRepresentante() {
		return representante;
	}

	@Pattern(regexp = "[0-9]{10}+|[0-9]{13}+", message = "LA CÉDULA DEL REPRESENTANTE ACEPTA DE 10 A 13 DÍGITOS NUMÉRICOS")
	@Column(nullable = false, length = 13)
	public String getCedulaRepresentante() {
		return cedulaRepresentante;
	}

	@Column(name = "telefonoRepresentante")
	public String getTelefonoRepresentante() {
		return telefonoRepresentante;
	}

	@Column(name = "direccionrepresentante")
	public String getDireccionRepresentante() {
		return direccionRepresentante;
	}

	@Email(message = "INGRESE UN EMAIL VALIDO")
	public String getEmailRepresentante() {
		return emailRepresentante;
	}

	@Column(name = "escuelaprocede")
	public String getEscuelaProcede() {
		return escuelaProcede;
	}

	public String getObservaciones() {
		return observaciones;
	}

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

	public Integer setId(Integer id) {
		return this.id = id;
	}

	public Persona setPersona(Persona persona) {
		return this.persona = persona;
	}

	public Grado setGrado(Grado grado) {
		return this.grado = grado;
	}

	public String setPapa(String papa) {
		return this.papa = papa;
	}

	public String setCedulaPapa(String cedulaPapa) {
		return this.cedulaPapa = cedulaPapa;
	}

	public String setProfesionPapa(String profesionPapa) {
		return this.profesionPapa = profesionPapa;
	}

	public String setTelefonoPapa(String telefonoPapa) {
		return this.telefonoPapa = telefonoPapa;
	}

	public String setDireccionPapa() {
		return this.direccionPapa;
	}

	public String setMama() {
		return mama;
	}

	public String setCedulaMama() {
		return this.cedulaMama;
	}

	public String setProfesionMama() {
		return this.profesionMama;
	}

	public String setTelefonoMama() {
		return this.telefonoMama;
	}

	public String setDireccionMama() {
		return this.direccionMama;
	}

	public String setRepresentante() {
		return this.representante;
	}

	public String setCedulaRepresentante() {
		return this.cedulaRepresentante;
	}

	public String setTelefonoRepresentante() {
		return this.telefonoRepresentante;
	}

	public String setDireccionRepresentante(String direccionRepresentante) {
		return this.direccionRepresentante = direccionRepresentante;
	}

	public String setEmailRepresentante(String emailRepresentante) {
		return this.emailRepresentante = emailRepresentante;
	}

	public String setEscuelaProcede(String escuelaProcede) {
		return this.escuelaProcede = escuelaProcede;
	}

	public String setObservaciones(String observaciones) {
		return this.observaciones = observaciones;
	}

	public String setFolio(String folio) {
		return this.folio = folio;
	}

	public Boolean setActivo(Boolean activo) {
		return this.activo = activo;
	}

	public Date setFechaRegistro(Date fechaRegistro) {
		return this.fechaRegistro = fechaRegistro;
	}

}