package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity.Persona;

@Controller
@Scope("session")
public class listadoEstudiante {

	@Autowired
	private EstudianteService estudianteService;

	private List<Persona> listaPersonasEstudiantes;

	public listadoEstudiante() {
	}

	@PostConstruct
	public void init() {
		listaPersonasEstudiantes = new ArrayList<>();
		listaPersonasEstudiantes = estudianteService.obtenerTodosPorBusqueda(criterioBusquedaCliente.toUpperCase(),
				criterioBusquedaCiudad);
	}

	public List<Persona> getListaPersonasEstudiantes() {
		return listaPersonasEstudiantes;
	}

	public void setListaPersonasEstudiantes(List<Persona> listaPersonasEstudiantes) {
		this.listaPersonasEstudiantes = listaPersonasEstudiantes;
	}

}
