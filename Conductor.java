package MetroMadrid;
/**
 * 
 * @author adilemdobras
 *
 */
public class Conductor {

	private boolean encendidotren;
/**
 * 
 * @param encendidotren, muestra si el tren esta encendido o apagado
 */
	public Conductor(boolean encendidotren) {
		super();
		this.encendidotren = encendidotren;
	}
/**
 * 
 * @param empleo, verificaba si existia el conductor y sino no devolvia ninguna estacion
 * @return
 */
	// Iba a implementar esta funcion, pero crei que el diseño debia ser simple, solo de prueba
	
	public boolean getConductorexiste(Empleo empleo) {
		boolean conductorexist = false;
		if (empleo.getTipompleos().equalsIgnoreCase("conductor")) {
			conductorexist = true;
		}

		else {
			conductorexist = false;
		}
		return conductorexist;

	}
	/**
	 * 
	 * @return si esta encendido el tren
	 */
public boolean isEncendidotren() {
	return encendidotren;
}
/**
 * 
 * @param encendidotren cambia a el tren a apagado
 */
public void setEncendidotren(boolean encendidotren) {
	this.encendidotren = encendidotren;
}

}
