package dev.rampmaster;

import java.util.HashSet;

public class Piso {
    private int id;
    private int nroPiso;
    private Sede sede;
    private HashSet<Sala> salas;

    public Piso(int id, int nroPiso, Sede sede){
        this.id = id;
        this.nroPiso = nroPiso;
        this.sede = sede;
        this.salas = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNroPiso() {
        return nroPiso;
    }

    public void setNroPiso(int nroPiso) {
        this.nroPiso = nroPiso;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public HashSet<Sala> getSalas() {
        return salas;
    }

    public void agregarSala(Sala sala){
        this.salas.add(sala);
    }
}