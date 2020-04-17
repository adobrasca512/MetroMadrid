package MetroMadrid;
import java.util.*;
import java.util.Iterator;
import java.util.Vector;
/**
 * 
 * @author adilemdobras
 *
 */
public class Lineas {
	private int nlineas;
	private String color;
	private double longlinea;
	private ArrayList<Estacion> estaciones;
/**
 * 
 * @param nlineas, numero de lineas en el metro
 * @param color , color de la linea
 * @param longlinea , longitud que recorre la linea (km)
 * @param nombreestacion, nombre de la estacion
 */
	public Lineas(int nlineas, String color, double longlinea, Estacion nombreestacion) {
		super();
		this.nlineas = nlineas;
		this.color = color;
		this.longlinea = longlinea;

		estaciones = new ArrayList<Estacion>();
		estaciones.add(nombreestacion);

	}
/**
 * 
 * @return devuelve la cantidad de lineas que recorre el tren
 */
	public int getNlineas() {
		return nlineas;
	}
/**
 * 
 * @param nlineas Cambia la cantidad de lineas que recorre el tren
 */
	public void setNlineas(int nlineas) {
		this.nlineas = nlineas;
	}
/**
 * 
 * @return Adquiere el color de la linea
 */
	public String getColor() {
		return color;
	}
/**
 * 
 * @param color, Cambia el color de la linea
 */
	public void setColor(String color) {
		this.color = color;
	}
/**
 * 
 * @return, Consigue la longitud de la linea 
 */
	public double getLonglinea() {
		return longlinea;
	}
/**
 * 
 * @param longlinea, Cambia el tamaño de la linea, en cierto caso de que se vayan a añadir estaciones.
 */
	public void setLonglinea(double longlinea) {
		this.longlinea = longlinea;
	}
/**
 * 
 * @return Consigue la cantidad de estaciones, y almacena las que ya estan contenidas dentro de otra linea
 */
	public ArrayList<Estacion> getEstaciones() {

		return estaciones;
	}
/**
 * 
 * @param estaciones, Cambia alguna de las estaciones
 */
	public void setEstaciones(ArrayList<Estacion> estaciones) {
		this.estaciones = estaciones;
	}
	/**
	 * Imprime la informacion de las lineas
	 */
	public void imprimirInfoLineas() {
		System.out.println("*INFORMACION DEL TREN: (\uD83D\uDE87) " + "\n");
		System.out.println(" Linea: " + nlineas);
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		System.out.println(" Color de linea: " + color + "." + "\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-"
				+ "\n Longitud de linea: " + longlinea + " km."
				+ "\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

	}

}
