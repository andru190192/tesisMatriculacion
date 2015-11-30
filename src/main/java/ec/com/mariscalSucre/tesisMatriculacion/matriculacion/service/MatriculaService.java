package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity.Matricula;

public interface MatriculaService {

	@Transactional(readOnly = true)
	public List<Matricula> obtener();

}