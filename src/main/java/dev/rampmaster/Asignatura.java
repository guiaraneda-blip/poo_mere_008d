package dev.rampmaster;

import java.util.HashSet;

public class Asignatura {
    private String nombre;
    private int id;
    private String codigo;
    private HashSet<Seccion> secciones;

    public Asignatura(String nombre, int id, String codigo){
        this.nombre = nombre;
        this.id = id;
        this.codigo = codigo;
        this.secciones = new HashSet<>();
    }

    public void agregarSeccion(Seccion seccion){
        this.secciones.add(seccion);
    }

    public HashSet<Seccion> getSecciones() {
        return secciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
