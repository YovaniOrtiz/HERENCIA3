package Herencia3;

public class Rectangulo extends FiguraGeometricas{
    protected double base;
    protected double altura;

    public Rectangulo() {

    }

    public Rectangulo(String nombre, int lados, int angulos, double base, double altura) {
        super(nombre, lados, angulos);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", nombre='" + nombre + '\'' +
                ", lados=" + lados +
                '}';
    }
}
