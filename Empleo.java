package MetroMadrid;
/**
 * 
 * @author adilemdobras
 *
 */
public class Empleo {
	private String tipoempleos;

	public Empleo(String tipoempleos) {
		this.tipoempleos = tipoempleos;
	}
/**
 * 
 * @return Tipo de empleos en existencia: conductor, asistente, etc.
 */
	public String getTipompleos() {
		return tipoempleos;
	}
/**
 * 
 * @param trabajador Pinta por consola la info. de los trabajadores
 */
	public void getInformaciontrabajador(Trabajador trabajador) {
		System.out.println("\n*INFORMACION DE TRABAJADORES: (\ud83e\udd35) \n");
		System.out.println("\u27A3Nombre: " + trabajador.getNombre() + "\n\u27A3Apellido: " + trabajador.getApellido()
				+ "\n\u27A3Dni: " + trabajador.getDni() + "\n\u27A3Tipo de empleo: " + tipoempleos);

	}
/*
 * Cambio de empleo
 */
	public void setTipoempleos(String tipoempleos) {
		this.tipoempleos = tipoempleos;
	}

}
