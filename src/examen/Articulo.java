package examen;

public abstract class Articulo {
	protected int id;
	protected String titulo;
	private boolean alquilado;
	private static final int mayor = 1;
	private static final int menor = -1;
	private static final int igual = 0;
	public static int numeroArticulos;

	// constructores de la clase
	public Articulo() {
		this.id = numeroArticulos++;
		this.setAlquilado(false);
	}

	protected Articulo(String titulo) {
		this();
		this.titulo = titulo;
	}

	// metodos de la clase
	public void alquilar() {
		this.setAlquilado(true);
	}

	public void devolver() {
		this.setAlquilado(false);
	}

	public boolean estaAlquilado() {
		if (this.setAlquilado(true)) {
			System.out.println("El articulo está alquilado");
			return true;
		}
		return false;

	}

	// metodo abstracto de la clase
	public abstract int compararArticulos(int n1, int n2);

	public boolean isAlquilado() {
		return alquilado;
	}

	public boolean setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
		return alquilado;
	}

	public static int getMayor() {
		return mayor;
	}

	public static int getMenor() {
		return menor;
	}

	public static int getIgual() {
		return igual;
	}

}
