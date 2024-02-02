package com.liceolapaz.des.dsv;

public class Dolar extends Moneda {

    private final static double euro = 0.883509299;

    @Override
    protected double cantidadEnEuros() {
        double resultado = cantidad * euro;

        return resultado;
    }
}
