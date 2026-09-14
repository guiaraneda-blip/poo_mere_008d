package dev.rampmaster;

public class Sala {
    private int id;
    private String codigo;
    private int capMax;
    private Piso piso;

    public Sala(int id, String codigo, int capMax, Piso piso){
        this.id = id;
        this.codigo = codigo;
        this.capMax = capMax;
        this.piso = piso;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
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

    public Piso getPiso() {
        return piso;
    }

    public void setPiso(Piso piso) {
        this.piso = piso;
    }
}
