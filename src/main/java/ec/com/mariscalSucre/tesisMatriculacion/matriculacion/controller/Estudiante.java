package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.controller;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("session")
public class Estudiante {

	public Estudiante() {
	}

	@PostConstruct
	public void init() {
	}

}
