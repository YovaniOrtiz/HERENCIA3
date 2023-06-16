package Herencia3;

public class Circulo extends FiguraGeometricas{
    protected double radio;

    public Circulo() {

    }

    public Circulo(String nombre, int lados, int angulos, double radio) {
        super(nombre, lados, angulos);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", nombre='" + nombre + '\'' +
                ", lados=" + lados +
                '}';
    }
}
