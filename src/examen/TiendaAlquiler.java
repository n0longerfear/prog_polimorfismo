package examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiendaAlquiler ex {
	private static final int TODOS = 1;
	private static final int ALQUILADOS = 2;
	private static final int DISPONIBLES = 3;

	private static List<Articulo> articulos = new ArrayList<>();
	private static List<Serie> seriesAlquiladas = new ArrayList<>();
	private static List<VideoJuego> videojuegosAlquilados = new ArrayList<>();

	public static void main(String[] args) {
		// Creación de los objetos
		Serie juegoDeTronos = new Serie("Juego de Tronos","George R. R. Martin","Miedo",4);
		VideoJuego assasinCreed2 = new VideoJuego(0,"Muerte","DC comics","Asasin Creeds",1);
		Serie losSimpsons = new Serie("Los Simpsons", "Suso","humor",23);
		Serie padreDeFamilia = new Serie("Padre de familia","Seth MacFarlane","Humor",44);
		VideoJuego godOfWar3 = new VideoJuego(2,"Muerte","comics","Call of Duty",1);
		

		// Agregar los objetos a la lista de artículos
		articulos.add(juegoDeTronos);
		articulos.add(assasinCreed2);
		articulos.add(losSimpsons);
		articulos.add(padreDeFamilia);
		articulos.add(godOfWar3);

		Scanner scanner = new Scanner(System.in);

		int opcion;
		do {
			mostrarMenu();
			opcion = leerOpcionValida(1, 6, scanner);

			switch (opcion) {
			case 1:
				alquilarArticulo(scanner);
				break;
			case 2:
				devolverArticulo(scanner);
				break;
			case 3:
				mostrarArticulos(articulos, TODOS);
				break;
			case 4:
				mostrarArticulos(articulos, DISPONIBLES);
				break;
			case 5:
				mostrarArticulos(articulos, ALQUILADOS);
				break;
			}
		} while (opcion != 6);

		calcularGanancias();
		mostrarMayorSerieAlquilada();
		mostrarMayorVideoJuegoAlquilado();
	}

	private static int leerOpcionValida(int i, int j, Scanner scanner) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void mostrarMenu() {
		System.out
				.println("\n\t\tElige la opción del menú." + "\n\t\t1) Alquilar Artículo" + "\n\t\t2) Devolver Artículo"
						+ "\n\t\t3) Listar Todos los Artículos" + "\n\t\t4) Listar Artículos Disponibles"
						+ "\n\t\t5) Listar Artículos Alquilados" + "\n\t\t6) Finalizar");
	}

	private static void alquilarArticulo(Scanner scanner) {
		System.out.println("Ingrese el ID del artículo que desea alquilar: ");
		int id = leerOpcionValida(1, 2000, scanner);

		Articulo articulo = buscarArticuloPorId(id);
		if (articulo != null) {
			if (!articulo.estaAlquilado()) {
				articulo.alquilar();

				if (articulo instanceof Serie) {
					seriesAlquiladas.add((Serie) articulo);
				} else if (articulo instanceof VideoJuego) {
					videojuegosAlquilados.add((VideoJuego) articulo);
				}

				System.out.println("Artículo alquilado correctamente.");
			} else {
				System.out.println("El artículo ya está alquilado.");
			}
		} else {
			System.out.println("No se encontró ningún artículo con ese ID.");
		}
	}

}
