package MetroMadrid;

public class Locomotora {
	private int cantidadlocomotora;
	private int matriculalocomotora;
/**
 * 
 * @param cantidadlocomotora cantidad de locomotoras en el tren
 * @param matriculalocomotora matricula de la locomotora
 */
	public Locomotora(int cantidadlocomotora, int matriculalocomotora) {
		super();
		this.cantidadlocomotora = cantidadlocomotora;
		this.matriculalocomotora = matriculalocomotora;
	}

	public int getCantidadlocomotora() {
		return cantidadlocomotora;
	}

	public int getMatriculalocomotora() {
		System.out.println(" Matricula Locomotora: " +matriculalocomotora);
		System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		return matriculalocomotora;
	}

	public void setMatriculalocomotora(int matriculalocomotora) {
		this.matriculalocomotora = matriculalocomotora;
	}

	public void setCantidadlocomotora(int cantidadlocomotora) {
		this.cantidadlocomotora = cantidadlocomotora;
	}

}
