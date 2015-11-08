package ec.com.mariscalSucre.tesisMatriculacion.utils.service;

import java.util.List;
import java.util.Map;

public interface ReporteService {

	public <T> void generarReportePDF(List<T> listaReporte, Map<String, Object> parametros, String nombreReporte);

	public <T> void generarReportePDFSencillo(List<T> listaReporte, Map<String, Object> parametros,
			String nombreReporte);

	public <T> void generarReporteXLS(List<T> listaReporte, Map<String, Object> parametros, String nombreReporte);

	public <T> void generarReporteXLSSencillo(List<T> listaReporte, Map<String, Object> parametros,
			String nombreReporte);

}
