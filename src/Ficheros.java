import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ficheros {
	
	static BufferedWriter bw = null;
	
	public static void mostrarFichero(String ruta) {
		Path fichero = Paths.get(ruta);
		BufferedReader br = null;
		try {
			br = Files.newBufferedReader(fichero);
		} catch (IOException e) {
			System.out.println("No se ha podido leer el fichero");
		}
		Stream<String> lineas = br.lines();
		lineas.forEach(System.out::println);
	}
	
	public static void generarFichero(String ruta) {
		
		Path fichero = Paths.get(ruta);
		Path ficheroGenerado = Paths.get("D:\\PRUEBAS\\alumnos2.txt");
		
		BufferedReader br = null;
		
		
		try {
			bw = Files.newBufferedWriter(ficheroGenerado);
		} catch (IOException e) {
			System.out.println("Imposible generar fichero");
		}
		try {
			br = Files.newBufferedReader(fichero);
		} catch (IOException e) {
			System.out.println("No se ha podido leer el fichero");
		}
		Stream<String> lineas = br.lines();
		lineas.forEach(texto -> {
			//Nombre;edad;ciudad;curso
			//El alumno kjdsfjkdfs, de 24 años, cursa dslkfn y es de sldknf
			String[] valores = texto.split(";");
			try {
				bw.write("El alumno " + valores[0] + ", de " + valores[1] + " años, cursa " + valores[3] + " y es de " + valores[2] + "\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		try {
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
