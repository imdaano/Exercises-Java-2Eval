package com.liceolapaz.des.dsv;

public class Rectangulo implements FiguraGeometrica {
    // Creamos las variables que nos pide el diagrama
    private double base;
    private double altura;

    // una vez creadas las variables, generamos el constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}
