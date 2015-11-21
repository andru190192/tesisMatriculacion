package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Embeddable
public class MatriculaPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@SequenceGenerator(allocationSize = 1, name = "MATRICULA_MATRICULAID_GENERATOR", sequenceName = "MATRICULA_MATRICULAID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MATRICULA_MATRICULAID_GENERATOR")
	@Column(name = "matriculaid", unique = true, nullable = false)
	private Integer matricula;

	@Column(name = "periodoid", unique = true, nullable = false, length = 10)
	private String periodo;

	public MatriculaPK() {
	}

	public MatriculaPK(Integer matricula, String periodo) {
		this.matricula = matricula;
		this.periodo = periodo;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MatriculaPK)) {
			return false;
		}
		MatriculaPK castOther = (MatriculaPK) other;
		return this.matricula.equals(castOther.matricula) && this.periodo.equals(castOther.periodo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.matricula.hashCode();
		hash = hash * prime + this.periodo.hashCode();

		return hash;
	}

}