package com.jorgerdc.java8.intro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jorge on 02/07/17.
 */
public class CursoUtil {

    /**
     * TODO [Agregar documentaci�n del m�todo]
     * @param cursos
     * @return
     */
    public static List<Curso> filtraCursosJava(List<Curso> cursos) {

        List<Curso> cursosJava = new ArrayList<>();
        for (Curso curso : cursos) {
            if (curso.getNombre().toLowerCase().contains("java")) {
                cursosJava.add(curso);
            }
        }
        return cursosJava;
    }

    /**
     * TODO [Agregar documentaci�n del m�todo]
     * @param cursos
     * @param maxCosto
     * @return
     */
    public static List<Curso> filtraCursoMaxCosto(List<Curso> cursos, double maxCosto) {
        List<Curso> cursosJava = new ArrayList<>();
        for (Curso curso : cursos) {
            if (curso.getCosto() <= maxCosto) {
                cursosJava.add(curso);
            }
        }
        return cursosJava;
    }

}
