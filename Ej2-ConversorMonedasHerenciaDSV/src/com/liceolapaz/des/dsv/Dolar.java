package com.liceolapaz.des.dsv;

public class Dolar extends Moneda{

    private final static double CONVERSION_A_DOLAR = 0.883509299;

    // usamos el super para acceder al constructor que esta creado en la clase padre Moneda
    public Dolar(double cantidad) {
        super(cantidad);
    }
    // 1 U.S. dollar = 0.883509299 Euros


    @Override
    protected double cantidadEnEuros() {

        double resultado = cantidad * CONVERSION_A_DOLAR;

        return resultado;
    }
}
