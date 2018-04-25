/**
 * ReaderProcessorMain.java
 * Fecha de creaci�n: 19/04/2018, 14:34:15
 *
 * Este software fue creado para fines did�cticos y acad�micos.
 * Puede ser empleado e inclusive ser modificado haciendo referencia
 * al autor e indicando que se trata de una versi�n modificada.
 *
 */
package modulo03.procesador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * En este ejemplo, se crean expresiones lambda para representar la l�gica que se
 * va a ejecutar al procesar un archivo de texto.
 * Esta t�cnica evita escribir c�digo repetitivo para crear instancias de un
 * {@link BufferedReader}.
 * El c�digo repetitivo se escribe una sola vez en el m�todo
 * {@link ReaderProcessorMain}{@link #processFile(String, ReaderProcessor)}. En
 * el m�todo main �nicamente se codifica el c�digo funcional que es diferente en cada caso.
 * Historial de cambios
 * <b>Usuario Email Fecha Descripci�n</b>
 * Jorge Rodriguez jorgerdc@gmail.com 19/04/2018 Creaci�n
 */

public class ReaderProcessorMain {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String result;

		System.out.println("1. Crea un processor que lee la primer linea del archivo");
		result = processFile("resources/datos.txt", (reader) -> reader.readLine());
		System.out.println(result);

		System.out.println("2. Crea un processor que lee las primeras 2 lineas");
		result = processFile("resources/datos.txt",
			(reader) -> reader.readLine() + "\n" + reader.readLine());
		System.out.println(result);

		System.out
			.println("3. Crea un processor que lee todas las lineas y las pasa a mayusculas");
		result = processFile("resources/datos.txt", (reader) -> {
			StringBuilder sb;
			String line;
			sb = new StringBuilder();
			while ((line = reader.readLine()) != null) {
				sb.append(line.toUpperCase());
				sb.append("\n");
			}
			return sb.toString();
		});
		System.out.println(result);
	}

	/**
	 * Procesa un {@link BufferedReader}. La l�gica que se emplea para procesar al
	 * archivo se pasa en el par�metro processor a trav�s de una expresi�n lambda.
	 * @param file
	 * @param processor
	 * @return
	 */
	public static String processFile(String file, ReaderProcessor processor) {

		try (BufferedReader reader = new BufferedReader(new FileReader(new File(file)))) {
			return processor.procesa(reader);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
