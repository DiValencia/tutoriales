/**
 * EjemploExpresionLambda.java
 * Fecha de creaci�n: 19/04/2018, 12:35:16
 *
 * Este software fue creado para fines did�cticos y acad�micos.
 * Puede ser empleado e inclusive ser modificado haciendo referencia
 * al autor e indicando que se trata de una versi�n modificada.
 *
 */
package modulo03;

import java.io.File;
import java.util.Comparator;

import com.jorgerdc.java8.intro.Curso;

/**
 * TODO [Agregar documentaci�n de la clase
 * Historial de cambios
 * <b>Usuario Email Fecha Descripci�n</b>
 * Jorge Rodriguez jorgerdc@gmail.com 19/04/2018 Creaci�n
 */

public class EjemploExpresionLambda {

    /**
     * @param args
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Comparator<Curso> comparatorOld, comparatorLambda;

        // antes de Java 8 (uso de clases an�nimas)
        comparatorOld = new Comparator<Curso>() {
            @Override
            public int compare(Curso o1, Curso o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        };
        // java 8
        comparatorLambda = (Curso o1, Curso o2) -> o1.getNombre().compareTo(o2.getNombre());

        // expresion Lambda como par�metro de un m�todo haciendo referencia al
        // concepto de interface funcional.
        File myFiles;

        String[] filteredFiles;
        myFiles = new File("/tmp");
        filteredFiles = myFiles
            .list((file, fileName) -> file.canWrite() && fileName.endsWith(".txt"));
    }
}
