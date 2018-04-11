/**
 * Ejemplo01ArchivosOcultos.java
 * Fecha de creaci�n: 11/04/2018, 17:44:50
 *
 * Este software fue creado para fines did�cticos y acad�micos.
 * Puede ser empleado e inclusive ser modificado haciendo referencia
 * al autor e indicando que se trata de una versi�n modificada.
 *
 */
package com.jorgerdc.java8.intro;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

/**
 * Ejemplo que muestra los archivos ocultos de un directorio con Java <7 y con Java 8
 *
 * <pre>
 * Historial de cambios
 *
 * <b>Usuario		Email				Fecha		Descripci�n</b>
 * Jorge Rodriguez	jorgerdc@gmail.com	11/04/2018	Creaci�n
 * </pre>
 */
public class Ejemplo01ArchivosOcultos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		muestraArchivosOcultosJava7();
		muestraArchivosOcultosJava8();
	}

	/**
	 * Imprime los archivos ocultos del directorio temporal del sistema empleabdo programaci�n
	 * imperativa.
	 */

	private static void muestraArchivosOcultosJava7() {
		File[] archivosOcultos = new File(System.getProperty("java.io.tmpdir"))
			.listFiles(new FileFilter() {
				@Override
				public boolean accept(File f) {
					return f.isHidden();
				}
			});
		System.out.println("Archivos ocultos con java < 8 :");
		for (File file : archivosOcultos) {
			System.out.println(file.getAbsolutePath());
		}

	}

	/**
	 * Imprime los archivos ocultos del directorio temporal del sistema empleando expresiones
	 * lambda y Referencias a m�todos.
	 */
	private static void muestraArchivosOcultosJava8() {
		List<File> files;

		System.out.println("Archivos ocultos con java  8 :");
		files = Arrays
			.asList(new File(System.getProperty("java.io.tmpdir")).listFiles(File::isHidden));
		files.forEach(System.out::println);

	}
}
