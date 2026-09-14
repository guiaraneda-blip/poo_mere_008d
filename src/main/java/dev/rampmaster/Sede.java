package dev.rampmaster;

import java.util.HashSet;

public class Sede {
    private int id;
    private String nombre;
    private String direccion;
    private HashSet<Piso> pisos;

    public Sede(int id, String nombre, String direccion){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.pisos = new HashSet<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public HashSet<Piso> getPisos() {
        return pisos;
    }

    public void agregarPiso(Piso piso){
        this.pisos.add(piso);
    }
}

