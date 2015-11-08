package ec.com.mariscalSucre.tesisMatriculacion.seguridad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "rolmenu")
public class RolMenu implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Menu menu;
	private Rol rol;

	public RolMenu() {
	}

	public RolMenu(Integer id, Menu menu, Rol rol) {
		this.id = id;
		this.menu = menu;
		this.rol = rol;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RolMenu other = (RolMenu) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Id
	@SequenceGenerator(allocationSize = 1, name = "ROLMENU_ROLMENUID_GENERATOR", sequenceName = "ROLMENU_ROLMENUID_SEQ")
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROLMENU_ROLMENUID_GENERATOR")
	@Column(name = "rolmenuid", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	@ManyToOne
	@JoinColumn(name = "menuid", nullable = false)
	public Menu getMenu() {
		return this.menu;
	}

	@ManyToOne
	@JoinColumn(name = "rolid", nullable = false)
	public Rol getRol() {
		return this.rol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}
