/**
 * ProcesadorArchivos.java
 * Fecha de creaci�n: 19/04/2018, 14:20:23
 *
 * Este software fue creado para fines did�cticos y acad�micos.
 * Puede ser empleado e inclusive ser modificado haciendo referencia
 * al autor e indicando que se trata de una versi�n modificada.
 *
 */
package modulo03.procesador;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * TODO [Agregar documentaci�n de la clase
 * Historial de cambios
 * <b>Usuario Email Fecha Descripci�n</b>
 * Jorge Rodriguez jorgerdc@gmail.com 19/04/2018 Creaci�n
 */

@FunctionalInterface
public interface ReaderProcessor {

    /**
     * Este m�todo contiene el c�digo funcional para procesar un {@link BufferedReader}
     * Esta idea permite separar la parte funcional del c�digo de la parte de manejo de
     * recursos, en este caso instanciar el {@link BufferedReader} y su liberaci�n de recursos.
     * @param reader
     * @return Una cadena que resulta del procesamiento del archivo.
     * @throws IOException
     */
    String procesa(BufferedReader reader) throws IOException;
}
