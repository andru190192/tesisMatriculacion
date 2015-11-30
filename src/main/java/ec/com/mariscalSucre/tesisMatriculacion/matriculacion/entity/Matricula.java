package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entityAux.Grado;

@Entity
@Table(name = "matricula")
public class Matricula implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MatriculaPK id;

	@OneToOne
	@JoinColumn(name = "estudianteid", nullable = false)
	private Estudiante estudiante;

	@Enumerated(EnumType.STRING)
	@Column(name = "gradoid", nullable = false)
	private Grado grado;

	private Timestamp fecha;

	private Boolean activo;

	public Matricula(MatriculaPK id, Estudiante estudiante, Grado grado, Timestamp fecha, Boolean activo) {
		this.id = id;
		this.estudiante = estudiante;
		this.grado = grado;
		this.fecha = fecha;
		this.setActivo(activo);
	}

	public MatriculaPK getId() {
		return id;
	}

	public void setId(MatriculaPK id) {
		this.id = id;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public Matricula() {
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

}