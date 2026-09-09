package dev.rampmaster;

public class Estudiante extends Usuario{
    private int semestre;
    private String carrera;

    public Estudiante(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String correo, String run, String fecha_nacimiento, int semestre, String carrera) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido, correo, run, fecha_nacimiento);
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}

