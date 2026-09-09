package dev.rampmaster;

import java.util.HashSet;
import java.util.Set;

public class Seccion {
    // Atributos
    private String codigo;
    private Asignatura asignatura;
    private boolean activa = false;

    public Seccion(String codigo, Asignatura asignatura){
        this.codigo = codigo;
        this.asignatura = asignatura;
    }

}