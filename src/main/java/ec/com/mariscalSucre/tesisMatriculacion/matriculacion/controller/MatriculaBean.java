package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity.Estudiante;
import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity.Matricula;
import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity.MatriculaPK;
import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity.Persona;
import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entityAux.PersonaCedulaNombre;
import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.service.EstudianteService;
import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.service.MatriculaService;

@Controller
@Scope("session")
public class MatriculaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private MatriculaService matriculaService;

	@Autowired
	private EstudianteService estudianteService;

	private List<Matricula> listaMatriculas;

	private Matricula matricula;

	private String estudianteMatricula;

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

	public List<String> obtenerEstudianteMatriculaPorBusqueda(
			String criterioEstudianteBusqueda) {
		List<String> lista = estudianteService
				.obtenerListaEstudiantesAutoComplete(criterioEstudianteBusqueda);
		if (lista.size() == 1) {
			estudianteMatricula = (lista.get(0));
			cargarEstudianteMatricula();
		}
		return lista;
	}

	public void cargarEstudianteMatricula() {
		matricula.setEstudiante((estudianteService.cargarEstudiante(estudianteMatricula));
	}

	public void cargarEstudiante(Persona persona) {
		Persona p = estudianteService.obtenerPorPersonaId(persona.getId());
		matricula.setEstudiante(p.getEstudiante());
		factura.setClienteFactura(p.getCliente());
		cliente = p.getCliente().getId().toString().concat("-")
				.concat(p.getCedula()).concat("-").concat(p.getApellido())
				.concat(" ").concat(p.getNombre());
		clienteFactura = cliente;
		if (listaLocales.size() == 1) {
			Local local = listaLocales.get(0);
			establecimiento = local
					.getNombre()
					.concat("(")
					.concat(local
							.getCodigoEstablecimiento()
							.concat(")")
							.concat(" - PUNTO EMISIÓN(")
							.concat(String.format("%03d",
									local.getPuntoEmisionFactura()).concat(")")));

			
	}

	public List<Matricula> getListaMatriculas() {
		return listaMatriculas;
	}

	public void setListaMatriculas(List<Matricula> listaMatriculas) {
		this.listaMatriculas = listaMatriculas;
	}

	public String getEstudianteMatricula() {
		return estudianteMatricula;
	}

	public void setEstudianteMatricula(String estudianteMatricula) {
		this.estudianteMatricula = estudianteMatricula;
	}

}
