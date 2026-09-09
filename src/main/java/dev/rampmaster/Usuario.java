package dev.rampmaster;

public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String run;
    protected String fecha_nacimiento;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Usuario(String nombre, String apellido, String correo, String run, String fecha_nacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.run = run;
        this.fecha_nacimiento = fecha_nacimiento;

    }
}
