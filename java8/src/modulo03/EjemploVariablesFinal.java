/**
 * EjemploVariablesFinal.java
 * Fecha de creaci�n: 19/04/2018, 16:06:22
 *
 * Este software fue creado para fines did�cticos y acad�micos.
 * Puede ser empleado e inclusive ser modificado haciendo referencia
 * al autor e indicando que se trata de una versi�n modificada.
 *
 */
package modulo03;

/**
 * TODO [Agregar documentaci�n de la clase
 * Historial de cambios
 * <b>Usuario Email Fecha Descripci�n</b>
 * Jorge Rodriguez jorgerdc@gmail.com 19/04/2018 Creaci�n
 */

public class EjemploVariablesFinal {

	int x = 0;

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		new EjemploVariablesFinal().test();
	}

	/**
	 * @throws InterruptedException
	 */
	private void test() throws InterruptedException {
		final Object o;

		o = new Object();
		System.out.println(o);
		Runnable r = () -> {
			System.out.println("en hilo");

			System.out.println(o);
		};

		Thread t = new Thread(r);
		t.setDaemon(true);
		t.start();
		Thread.sleep(5000);
		System.out.println("fin");

	}
}
