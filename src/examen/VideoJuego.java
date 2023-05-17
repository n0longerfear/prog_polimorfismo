package examen;

public class VideoJuego extends Articulo {
	protected int horasEstimadas;
	protected String genero;
	protected String campañia;
	protected static final int horas_estimadas_def = 100;

	// Constructor por defecto
	public VideoJuego() {
		super();
	}

	public VideoJuego(int horasEstimadas, String titulo) {
		super();
		this.horasEstimadas = horasEstimadas;
		super.titulo = titulo;
	}

	public VideoJuego(int horasEstimadas, String genero, String campañia, String titulo, int id) {
		super();
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.campañia = campañia;
		super.titulo = titulo;
		super.id = id;
	}

	@Override
	public int compararArticulos(int n1, int n2) {
		if (n1 > n2) {
			return super.getMayor();
		} else if (n1 < n2) {
			return super.getMenor();
		} else {
			return super.getIgual();
		}

	}

	public void alquilar() {
		this.setAlquilado(true);
		System.out.println("El video juego " + super.titulo + " ha sido alquilado");
	}

	public void devolver() {
		this.setAlquilado(false);
		System.out.println("El video juego " + super.titulo + " ha sido devuelto");
	}

	@Override
	public String toString() {
		String res="VideoJuego [horasEstimadas=" + horasEstimadas + ", genero=" + genero + ", campañia=" + campañia
				+ ", id=" + id + ", titulo=" + titulo + "Alquilado "+super.estaAlquilado();
		return res;
	}

	

}
