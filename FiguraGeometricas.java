package Herencia3;

public class FiguraGeometricas {
    protected String nombre;
    protected int lados;
    private int angulos;

    public FiguraGeometricas()
    {

    }

    public FiguraGeometricas(String nombre, int lados, int angulos) {
        this.nombre = nombre;
        this.lados = lados;
        this.angulos = angulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getAngulos() {
        return angulos;
    }

    public void setAngulos(int angulos) {
        this.angulos = angulos;
    }
}
