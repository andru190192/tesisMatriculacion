package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.dao.MatriculaDao;
import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity.Matricula;

@Service
public class MatriculaServiceImpl implements MatriculaService, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private MatriculaDao matriculaDao;

	public List<Matricula> obtener() {
		List<Matricula> lista = matriculaDao
				.obtenerPorHql("select m from Matricula m", new Object[] {});
		return lista;
	}

}