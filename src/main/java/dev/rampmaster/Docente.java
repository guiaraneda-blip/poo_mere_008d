package dev.rampmaster;

import java.util.List;
import java.util.ArrayList;

public class Docente extends Usuario{
    private String especialidad;
    private List<Asignatura> asignaturas;

    public Docente(String primerNombre,String segundoNombre, String primerApellido, String segundoApellido, String correo, String run, String fecha_nacimiento, String especialidad){
        super(primerNombre, segundoNombre, primerApellido, segundoApellido, correo, run, fecha_nacimiento);
        this.especialidad = especialidad;
        this.asignaturas = new ArrayList<>();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void agregarAsignatura(Asignatura asignatura) {
        this.asignaturas.add(asignatura);
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}
