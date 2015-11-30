package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Embeddable
public class MatriculaPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@SequenceGenerator(allocationSize = 1, name = "MATRICULA_MATRICULAID_GENERATOR", sequenceName = "MATRICULA_MATRICULAID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MATRICULA_MATRICULAID_GENERATOR")
	@Column(name = "matriculaid", nullable = false)
	private Integer matricula;

	@OneToOne
	@JoinColumn(name = "periodoid", nullable = false)
	private Periodo periodo;

	public MatriculaPK() {
	}

	public MatriculaPK(Integer matricula, Periodo periodo) {
		this.matricula = matricula;
		this.periodo = periodo;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
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