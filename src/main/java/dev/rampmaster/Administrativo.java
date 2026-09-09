package dev.rampmaster;

public class Administrativo extends Usuario {
    private String cargo;
    private String departamento;
    private String fecha_contratacion;

    public Administrativo(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String correo, String run, String fecha_nacimiento, String cargo, String departamento, String fecha_contratacion){
        super(primerNombre, segundoNombre, primerApellido, segundoApellido, correo, run, fecha_nacimiento);
        this.cargo = cargo;
        this.departamento = departamento;
        this.fecha_contratacion = fecha_contratacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFecha_contratacion() {
        return fecha_contratacion;
    }

    public void setFecha_contratacion(String fecha_contratacion) {
        this.fecha_contratacion = fecha_contratacion;
    }
}
