package MetroMadrid;
/**
 * 
 * @author adilemdobras
 *
 */
public class Pruebas {
	// idea: simulador de tren
	public static void main(String[] args) {

		Empleo empleo = new Empleo("Conductor");
		// nombre-apellido-dni-empleo
		Trabajador trabajadores = new Trabajador("Adilem", "Dobras", "ARGD43FM", empleo);
		Empleo empleo1 = new Empleo("asistente");
		Trabajador trabajadores1 = new Trabajador("Andrea", "Pérez", "ARGD88FZ", empleo1);
		Trabajador trabajadores2 = new Trabajador("Jorge", "Gonzales", "ARYY5FZ", empleo1);
		

		// Estacion:
		Estacion estaciones = new Estacion("Villaverde Alto", "escaleras");
		// Lineas: informacion
		// Cantidad de lineas,color,longitud (km)
		Lineas lineas = new Lineas(3, "amarillo", 1023.45, estaciones);
		// agregamos las estaciones
		lineas.getEstaciones().add(new Estacion("San Cristobal", "elevador"));
		lineas.getEstaciones().add(new Estacion("Villaverde Bajo-Cruce", "elevador"));
		lineas.getEstaciones().add(new Estacion("Ciudad de los Angeles", "escaleras"));
		lineas.getEstaciones().add(new Estacion("San Fermín Orcasur", "elevador"));
		lineas.getEstaciones().add(new Estacion("Hospital 12 de Octubre", "escaleras"));
		lineas.getEstaciones().add(new Estacion("Almendrales", "escaleras"));
		Estacion Legazpi = new Estacion("Legazpi", "escaleras");
		lineas.getEstaciones().add(Legazpi);
		lineas.getEstaciones().add(new Estacion("Delicias", "escaleras"));
		lineas.getEstaciones().add(new Estacion("Palos de la frontera", "elevador"));
		lineas.getEstaciones().add(new Estacion("Embajadores", "elevador"));
		lineas.getEstaciones().add(new Estacion("Callao", "elevador"));
		lineas.getEstaciones().add(new Estacion("Lavapies", "escaleras"));
		lineas.getEstaciones().add(new Estacion("Sol", "elevador"));
		lineas.getEstaciones().add(new Estacion("Plaza de españa", "elevador"));
		lineas.getEstaciones().add(new Estacion("Ventura Rodriguez", "elevador"));
		Estacion Arguelles = new Estacion("Arguelles", "escaleras");
		lineas.getEstaciones().add(Arguelles);
		Estacion Moncloa = new Estacion("Moncloa", "elevador");
		lineas.getEstaciones().add(Moncloa);
		Estacion estaciones1 = new Estacion("San Bernardo", "elevador");
		Lineas lineas4 = new Lineas(4, "naranja", 1025.45, estaciones1);
		lineas4.getEstaciones().add(Arguelles);
		// lineas4.getEstaciones().add(new Estacion("San Bernardo", "elevador"));
		lineas4.getEstaciones().add(new Estacion("Bilbao", "elevador"));
		lineas4.getEstaciones().add(new Estacion("Alonso Martines", "escaleras"));
		lineas4.getEstaciones().add(new Estacion("Colón", "elevador"));
		lineas4.getEstaciones().add(new Estacion("Serrano", "elevador"));
		lineas4.getEstaciones().add(new Estacion("Velázques", "elevador"));
		lineas4.getEstaciones().add(new Estacion("Goya", "escaleras"));
		lineas4.getEstaciones().add(new Estacion("Lista", "escaleras"));
		Estacion diego = new Estacion("Diego de Leon", "elevador");
		lineas4.getEstaciones().add(diego);
		Estacion america = new Estacion("Avenida de América", "elevador");
		lineas4.getEstaciones().add(america);
		lineas4.getEstaciones().add(new Estacion("Prosperidad", "escaleras"));
		lineas4.getEstaciones().add(new Estacion("Alfonso XIII", "escaleras"));
		lineas4.getEstaciones().add(new Estacion("Avenida de la Paz", "elevador"));
		lineas4.getEstaciones().add(new Estacion("Arturo Soria", "escaleras"));
		lineas4.getEstaciones().add(new Estacion("Esperanza", "escaleras"));
		lineas4.getEstaciones().add(new Estacion("Canillas", "elevador"));
		lineas4.getEstaciones().add(new Estacion("Mar de Cristal", "escaleras"));
		lineas4.getEstaciones().add(new Estacion("San Lorenzo", "elevador"));
		lineas4.getEstaciones().add(new Estacion("Parque de Santa María", "escaleras"));
		lineas4.getEstaciones().add(new Estacion("Hortaleza", "escaleras"));
		lineas4.getEstaciones().add(new Estacion("Manoteras", "escaleras"));
		lineas4.getEstaciones().add(new Estacion("Pinar de Chamartin", "escaleras"));
		// vagones: informacion
		// placa y modelo
		Vagon vagon = new Vagon(54839, 2007);
		// Locomotora: informacion
		// cantidad de lts - placa
		Locomotora locomotora = new Locomotora(0, 34740);
		// Conductor
		Conductor conductor = new Conductor(true);
		// vagones: informacion
		// placa y modelo
		Vagon vagon4 = new Vagon(54839, 2007);
		// Locomotora: informacion
		// cantidad de lts - placa
		Locomotora locomotora4 = new Locomotora(0, 34740);
		// Conductor
		Conductor conductor4 = new Conductor(true);
		// Metro: informacion
		Metro metro = new Metro("[ Linea 3: Villaverde Alto-Alameda Ozuna ]", vagon, "", lineas, locomotora, conductor,
				"ligero");
		Metro metro4 = new Metro("[ Linea 4: Arguelles-Pinar de Chamartín ]", vagon4, "", lineas4, locomotora4,
				conductor4, "ligero");
		metro.getimpresionInformacionLineas();
		empleo.getInformaciontrabajador(trabajadores);
		empleo1.getInformaciontrabajador(trabajadores1);
		empleo1.getInformaciontrabajador(trabajadores2);

		metro.Parada("Villaverde Alto", "Ciudad de los Angeles");
		metro4.getimpresionInformacionLineas();
		empleo.getInformaciontrabajador(trabajadores);
		empleo1.getInformaciontrabajador(trabajadores1);
		empleo1.getInformaciontrabajador(trabajadores2);
		metro4.Parada("San Bernardo", "Alfonso XIII");
	}

}
