package MetroMadrid;
/**
 * 
 * @author adilemdobras
 *
 */
public class Acciones {
	private String movimiento;
	private String movimientopuertas;
	/**
	 * 
	 * @param movimiento, define el movimiento del tren [parado o movimiento]
	 * @param movimientopuertas, define el movimiento de las puertas [abriendose, cerrandose]
	 */
	public Acciones(String movimiento, String movimientopuertas) {
		super();
		this.movimiento = movimiento;

		this.movimientopuertas = movimientopuertas;
	}
	public String getMovimiento() {
		return movimiento;
	}
	/**
	 * 
	 * @param movimiento, Cambia el movimiento del tren
	 */
	public void setMovimiento(String movimiento) {
		this.movimiento = movimiento;
	}
    /**
     * 
     * @return Obtiene el movimiento de las puertas
     */
	public String getMovimientopuertas() {
		System.out.println("puertas: " + movimientopuertas);
		return movimientopuertas;
	}
    /**
     * 
     * @param movimientopuertas Cambia el movimiento de las puertas
     */
	public void setMovimientopuertas(String movimientopuertas) {
		this.movimientopuertas = movimientopuertas;
	}
    /**
     * Aqui imprimo las acciones que se van formando
     */
	public void imprimirAcciones() {
		System.out.println("ESTADO DE TREN: " + movimiento + "\nMOVIMIENTO DE PUERTAS: " + movimientopuertas);
	}

}
