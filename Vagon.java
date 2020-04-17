package MetroMadrid;

public class Vagon {
	private int matricula_vagon;
	private int modelo;
	private int cantidadvagones;
	private int cantidadpasajeros;
	private int cantidadpuertas;
    private Metro metro;
	/**
	 * 
	 * @param matricula_vagon Matricula del vagon
	 * @param modelo          Modelo del vagon: 2000,2007,2008
	 */
	public Vagon(int matricula_vagon, int modelo) {
		super();
		this.matricula_vagon = matricula_vagon;
		this.modelo = modelo;
		this.cantidadvagones = cantidadvagones;
		this.cantidadpasajeros = cantidadpasajeros;
		this.cantidadpuertas = cantidadpuertas;
	}

	/**
	 * 
	 * @return Implementar la matricula del vagon
	 */
	public int getMatricula_vagon() {
		return matricula_vagon;
	}

	/**
	 * 
	 * @param matricula_vagon Cambiar la matricula del vagon
	 */
	public void setMatricula_vagon(int matricula_vagon) {
		this.matricula_vagon = matricula_vagon;
	}

	/**
	 * 
	 * @return Implementar modelo del vagón
	 */
	public int getModelo() {
		return modelo;
	}

	/**
	 * 
	 * @param modelo Cambiar el modelo del vagón
	 */
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	/**
	 * Funcion que considera la cantidad de pasajeros y puertas dependiendo del
	 * modelo
	 */

	public void getCantidadpasajerosypuertas() {
		
		// esto sera dependiente de que sea tren

		if (modelo == 2000) {
			this.cantidadpasajeros = 20;
			this.cantidadpuertas = 4;
		} else if (modelo == 2007) {
			this.cantidadpasajeros = 28;
			this.cantidadpuertas = 4;// este me lo invente yo
		} else if (modelo == 2008) {
			if(metro.getTipolineas().equals("ligero")) {
				this.cantidadpuertas=4;
				this.cantidadpasajeros = 50;
			}
			else {
				this.cantidadpuertas = 6;
				this.cantidadpasajeros = 50; // este me lo invente yo	
			}
			
		}
		System.out.println(" La cantidad de pasajeros disponible por vagon es: " + this.cantidadpasajeros
				+ "\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-" + "\n La cantidad de puertas por vagon es: "
				+ cantidadpuertas + "\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

	}

	public int getCantidadvagones() {
		return cantidadvagones;
	}

	public void setCantidadvagones(int cantidadvagones) {
		this.cantidadvagones = cantidadvagones;
	}

}
