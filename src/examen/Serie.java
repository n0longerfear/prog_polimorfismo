package examen;

public class Serie extends Articulo {
	private int numero_de_temporadas;
	private String genero;
	private String creador;
	private static final int num_temporadas_def = 3;

	// Constructor por defecto
	public Serie() {
		this.numero_de_temporadas = num_temporadas_def;
	}

	public Serie(String titulo, String creador) {
		super.titulo=titulo;
		this.creador = creador;
		this.genero = "";
	}

	public Serie(String titulo, String creador, String genero, int numero_de_temporadas) {
		this.titulo=titulo;
		this.numero_de_temporadas = num_temporadas_def;
		this.creador = creador;
		this.genero = "";

	}


	// getters y setters
	public int getNumero_de_temporadas() {
		return numero_de_temporadas;
	}

	public void setNumero_de_temporadas(int numero_de_temporadas) {
		this.numero_de_temporadas = numero_de_temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public static int getNumTemporadasDef() {
		return num_temporadas_def;
	}
	
	//metodos
	@Override
	public int compararArticulos(int n1, int n2) {
//		super.getMayor();
//		super.getMenor();
//		super.getIgual();
		
		if (n1 > n2) {
			return super.getMayor();
		}else if(n1<n2) {
			return super.getMenor();
		}else {
			return super.getIgual();
		}
	}
	public void alquilar() {
		System.out.println("Serie los Simpsons devuelta!");
	}
	public void devolver() {
		this.setAlquilado(false);
	}
	public String toString() {
		String res  = "SERIE: Id: " + super.id + " Título: " + this.titulo + " Num temporadas: " + 
					  this.numero_de_temporadas + " Género: " + this.genero + " Creador: " + 
					  this.creador + " Alquilado:" + super.estaAlquilado();
		return res;
		
	}
}
