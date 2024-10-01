import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int seleccion = -1;
		final String ruta = "D:\\PRUEBAS\\alumnos.csv";
		
		while(true) {
			
			mostrarMenu();
			try {
				seleccion = scanner.nextInt();
			}catch(InputMismatchException e) {
				
			}
			
			switch (seleccion) {
				case 1: {
					Ficheros.mostrarFichero(ruta);
					break;
				}
				case 2: {
					Ficheros.generarFichero(ruta);
					break;
				}
				case 3: {
					System.out.println("3");
					System.exit(0);
					//break;
				}
				default:
					System.out.println("El valor seleccionado no es correcto");
			}
		}
			
	}

	private static void mostrarMenu() {
		System.out.println("****MENÚ****");
		System.out.println("1. Mostrar el contenido");
		System.out.println("2. Generar el fichero");
		System.out.println("3. Salir");
	}

}
