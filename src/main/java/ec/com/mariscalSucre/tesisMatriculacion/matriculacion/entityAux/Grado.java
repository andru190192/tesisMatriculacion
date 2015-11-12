package ec.com.mariscalSucre.tesisMatriculacion.matriculacion.entityAux;

public enum Grado {

	INI("00", "INICIAL"), PRI("01", "PRIMERO"), SEG("02", "SEGUNDO"), TER("03", "TERCERO"), CUA("04",
			"CUARTO"), QUI("05", "QUINTO"), SEX("06", "SEXTO"), SEP("07", "SEPTIMO"), OCT("08", "OCTAVO"), NOV("09",
					"NOVENO"), DEC("10", "DECIMO");

	private final String id;
	private final String nombre;

	private Grado(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public static Grado obtenerPorId(String id) {
		for (Grado a : Grado.values())
			if (a.getId().compareTo(id) == 0)
				return a;
		return null;
	}

	public static Grado obtenerPorNombre(String nombre) {
		for (Grado a : Grado.values())
			if (a.getId().compareTo(nombre) == 0)
				return a;
		return null;
	}
}