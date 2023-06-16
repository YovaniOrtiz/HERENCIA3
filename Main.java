package Herencia3;

public class Main {
    public static void main(String args[]){
        Rectangulo rectangulo = new Rectangulo("Rectangulo",4,0,10,5);
        rectangulo.toString();
        System.out.println(rectangulo.toString());

        Circulo circulo = new Circulo("Circulo",0,360,3);
        circulo.toString();
        System.out.println(circulo.toString());

    }
}
