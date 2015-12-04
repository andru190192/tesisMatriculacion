package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "parametro")
public class Parametro implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String ruc;
	private String razonSocial;
	private String rector;
	private String cedulaRector;
	private String secretaria;
	private String cedulaScretaria;
	private String direccion;
	private String email;
	private TipoServidor tipoServidor;
	private String passEmail;

	public Parametro() {
	}

	public Parametro(Integer id, String ruc, String razonSocial, String rector, String cedulaRector, String secretaria,
			String cedulaScretaria, String direccion, String email, TipoServidor tipoServidor, String passEmail) {
		this.id = id;
		this.ruc = ruc;
		this.razonSocial = razonSocial;
		this.setRector(rector);
		this.setCedulaRector(cedulaRector);
		this.setSecretaria(secretaria);
		this.setCedulaScretaria(cedulaScretaria);
		this.direccion = direccion;
		this.email = email;
		this.tipoServidor = tipoServidor;
		this.passEmail = passEmail;
	}

	@Id
	@SequenceGenerator(allocationSize = 1, name = "PARAMETRO_PARAMETEROID_GENERATOR", sequenceName = "PARAMETRO_PARAMETEROID_SEQ")
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PARAMETRO_PARAMETEROID_GENERATOR")
	@Column(name = "parametroid", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	@Column(nullable = false, length = 13)
	public String getRuc() {
		return this.ruc;
	}

	@Column(name = "razonsocial", nullable = false)
	public String getRazonSocial() {
		return razonSocial;
	}

	@Column(name = "cedularector", nullable = false)
	public String getCedulaRector() {
		return cedulaRector;
	}

	@Column(name = "secretaria", nullable = false)
	public String getSecretaria() {
		return secretaria;
	}

	@Column(name = "cedulasecretaria", nullable = false)
	public String getCedulaScretaria() {
		return cedulaScretaria;
	}

	@Column(nullable = false, length = 100)
	public String getDireccion() {
		return this.direccion;
	}

	@Column(name = "email", length = 50)
	public String getEmail() {
		return email;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "tiposervidoremail")
	public TipoServidor getTipoServidor() {
		return tipoServidor;
	}

	@Column(name = "passemail", length = 15)
	public String getPassEmail() {
		return passEmail;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPassEmail(String passEmail) {
		this.passEmail = passEmail;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public void setTipoServidor(TipoServidor tipoServidor) {
		this.tipoServidor = tipoServidor;
	}

	public String getRector() {
		return rector;
	}

	public void setRector(String rector) {
		this.rector = rector;
	}

	public void setCedulaRector(String cedulaRector) {
		this.cedulaRector = cedulaRector;
	}

	public void setSecretaria(String secretaria) {
		this.secretaria = secretaria;
	}

	public void setCedulaScretaria(String cedulaScretaria) {
		this.cedulaScretaria = cedulaScretaria;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parametro other = (Parametro) obj;
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

}