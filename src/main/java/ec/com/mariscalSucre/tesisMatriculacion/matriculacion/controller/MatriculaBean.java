package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity.Estudiante;
import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity.Matricula;
import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity.MatriculaPK;
import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.service.MatriculaService;

@Controller
@Scope("session")
public class MatriculaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private MatriculaService matriculaService;

	private List<Matricula> listaMatriculas;

	private Matricula matricula;

	public MatriculaBean() {
	}

	@PostConstruct
	public void init() {
		listaMatriculas = new ArrayList<>();
		listaMatriculas = matriculaService.obtener();
	}

	public void cargarInsertar() {
		limpiarObjetos();
	}

	public void limpiarObjetos() {
		matricula = new Matricula();
		matricula.setEstudiante(new Estudiante());
		matricula.setId(new MatriculaPK());
	}

	public List<Matricula> getListaMatriculas() {
		return listaMatriculas;
	}

	public void setListaMatriculas(List<Matricula> listaMatriculas) {
		this.listaMatriculas = listaMatriculas;
	}

}
