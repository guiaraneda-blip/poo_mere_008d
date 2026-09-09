package dev.rampmaster;

import java.util.HashSet;
import java.util.Set;

public class Seccion {
    // Atributos
    private String codigo;
    private Asignatura asignatura;
    private boolean activa = false;
    private String jornada;
    private Docente docente;
    private Sala sala;
    private Set<Estudiante> estudiantes ;

    public Seccion(String codigo, Asignatura asignatura, String jornada, Docente docente, Sala sala){
        this.codigo = codigo;
        this.asignatura = asignatura;
        this.jornada = jornada;
        this.docente = docente;
        this.sala = sala;
        this.estudiantes = new HashSet<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getJornada() {
        return jornada;
    }

    public Docente getDocente() {
        return docente;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Set<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}