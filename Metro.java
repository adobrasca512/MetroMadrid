package MetroMadrid;

public class Metro {

	private String cabecera;
	private Vagon vagones;
	private String equipo;
	private Lineas tipolinea;
	private String tipolineas;
	private Locomotora locomotora;
	private Acciones acciones;
	private Conductor conductor;

	public Metro(String cabecera, Vagon vagones, String equipo, Lineas tipolinea, Locomotora locomotora,
			Conductor conductor, String tipolineas) {

		this.cabecera = cabecera;
		this.vagones = vagones;
		this.equipo = equipo;
		this.locomotora = locomotora;
		this.tipolinea = tipolinea;
		this.tipolineas = tipolineas;
		this.acciones = new Acciones("detenido", "abiertas");
	}

	public String getTipolineas() {
		return tipolineas;
	}

	public void setTipolineas(String tipolineas) {
		this.tipolineas = tipolineas;
	}

	public Acciones getAcciones() {
		return acciones;
	}

	public void setAcciones(Acciones acciones) {
		this.acciones = acciones;
	}

	/**
	 * 
	 * @return La cabecera del metro
	 */
	public String getCabecera() {
		return cabecera;
	}

	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}

	/**
	 * 
	 * @return crea valores de los vagones
	 */
	public Vagon getVagones() {
		return vagones;
	}

	public void setVagones(Vagon vagones) {
		this.vagones = vagones;
	}

	/**
	 * 
	 * @return esto lo puse adicional por si se queria incluir los equipos
	 *         especiales como tv, etc.
	 */
	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public void Parada(String inicio, String finales) {

		int i = encontrado(inicio);
		System.out.println("\n*PARADAS DE TREN: (\uD83D\uDEA6) \n");
		System.out.println("\t" + cabecera + "\t");
		while (i <= encontrado(finales)) {

			System.out.println("\u2756 \u2756 \u2756 \u2756 \u2756 \u2756 \u2756 \u2756 \u2756 \u2756 \u2756 \u2756");
			System.out.println("\uD83D\uDE89   " + tipolinea.getEstaciones().get(i).getNombreestacion() + "\nACCESOS:  "
					+ tipolinea.getEstaciones().get(i).getAccesos());
			setAcciones(new Acciones("detenido", "abiertas"));
			acciones.imprimirAcciones();
			setAcciones(new Acciones("movimiento", "cerradas"));
			acciones.imprimirAcciones();

			i++;
		}

	}

	/**
	 * 
	 * @param finales
	 * @return Funcion auxiliar para las paradas.
	 */
	public int encontrado(String finales) {
		int encontrado = -1;
		int i = 0;
		while ((encontrado == -1) && i < tipolinea.getEstaciones().size()) {
			if (tipolinea.getEstaciones().get(i).getNombreestacion().equals(finales)) {
				encontrado = i;// donde esta el elemento que se encontro
			}

			i++;
		}

		return encontrado;

	}

	/**
	 * Cambia las lineas
	 * 
	 * @param tipolinea
	 */
	public void setTipolinea(Lineas tipolinea) {
		this.tipolinea = tipolinea;
	}

	/**
	 * 
	 * @param vagon Adquiere la cantidad de vagones dentro del tren
	 * @return
	 */
	public int getCantidadvagones(Vagon vagon) {
		int cantidad = vagon.getCantidadvagones();
		if (tipolineas.contains("normal")) {
			cantidad = 10;
			System.out.println();
		} else if (tipolineas.contains("ligero")) {
			cantidad = 3;

		}
		System.out.println(" Cantidad de vagones: " + cantidad);
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		return cantidad;
	}

	/**
	 * 
	 * @param locomotora, adquiere la cantidad de locomotoras dentro del tren
	 * @return
	 */
	public int getCantidadlocomotora(Locomotora locomotora) {
		int cantidadlocomotora = locomotora.getCantidadlocomotora();
		if (tipolineas.contains("normal")) {
			cantidadlocomotora = 0;
		} else if (tipolineas.contains("ligero")) {
			cantidadlocomotora = 2;
		}
		System.out.println(" Cantidad de locomotoras: " + cantidadlocomotora);
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		return cantidadlocomotora;
	}

	/**
	 * Se imprime la informacion de las lineas y todo lo correspondiente al metro
	 */
	public void getimpresionInformacionLineas() {
		tipolinea.imprimirInfoLineas();
		System.out.println(" Tipo de Linea (normal o ligero): " + tipolineas
				+ "\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		getCantidadvagones(vagones);
		getCantidadlocomotora(locomotora);
		locomotora.getMatriculalocomotora();
		vagones.getCantidadpasajerosypuertas();
	}
}
