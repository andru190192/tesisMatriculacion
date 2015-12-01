package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.service;

import static ec.com.mariscalSucre.tesisMatriculacion.utils.UtilsAplicacion.presentaMensaje;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.dao.MatriculaDao;
import ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entity.Matricula;

@Service
public class MatriculaServiceImpl implements MatriculaService, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private MatriculaDao matriculaDao;

//	@Autowired
//	private MatriculaService matriculaService;

	public List<Matricula> obtener() {
		List<Matricula> lista = matriculaDao.obtenerPorHql("select m from Matricula m", new Object[] {});
		return lista;
	}

	public Matricula insertarActualizar(Matricula matricula) {
		boolean retorno = false;
//		if (matricula.getId() == null)
//			retorno = matriculaService.insertar(matricula);
//		else
//			retorno = matriculaService.actualizar(matricula);

		if (retorno)
			presentaMensaje(FacesMessage.SEVERITY_INFO, "ESTUDIANTE INSERTADO", "cerrar", true);
		return matricula;
	}

//	public boolean comprobarIndices(Integer periodoid, Integer estudianteid) {
//		List<Matricula> lista = matriculaDao.obtenerPorHql(
//				"select m from Matricula m where m.id.periodo.id=?1 and m.estudiante.id=?2",
//				new Object[] { periodoid, estudianteid });
//		if (lista.isEmpty())
//			return false;
//		else
//			return true;
//	}

//	public boolean insertar(Matricula matricula) {
//		boolean retorno = false;
//
//		if (matricula.getId().getPeriodo().getId() == null || matricula.getId().getPeriodo().getId() == 0)
//			presentaMensaje(FacesMessage.SEVERITY_INFO, "ESCOJA UN PERIODO");
//
//		else if (matriculaService.comprobarIndices(matricula.getId().getPeriodo().getId(),
//				matricula.getEstudiante().getId()))
//			presentaMensaje(FacesMessage.SEVERITY_INFO,
//					"EL ESTUDIANTE YA ESTA MATRICULADO EN EL PERIODO LECTIVO ESCOGIDO", "cerrar", false);
//		else {
//			matricula.setActivo(true);
//			matricula.setFecha(new Timestamp(new Date().getTime()));
//			matriculaDao.insertar(matricula);
//			retorno = true;
//		}
//		return retorno;
//	}
//
//	public boolean actualizar(Matricula matricula) {
//		boolean retorno = false;
//
//		if (matricula.getId().getPeriodo().getId() == null || matricula.getId().getPeriodo().getId() == 0)
//			presentaMensaje(FacesMessage.SEVERITY_INFO, "ESCOJA UNA PERIODO");
//		else if (matriculaService.comprobarIndices(matricula.getId().getPeriodo().getId(),
//				matricula.getEstudiante().getId()))
//			presentaMensaje(FacesMessage.SEVERITY_INFO,
//					"EL ESTUDIANTE YA ESTA MATRICULADO EN EL PERIODO LECTIVO ESCOGIDO", "cerrar", false);
//		else {
//			matricula.setActivo(true);
//			matriculaDao.actualizar(matricula);
//			retorno = true;
//		}
//		return retorno;
//	}

}