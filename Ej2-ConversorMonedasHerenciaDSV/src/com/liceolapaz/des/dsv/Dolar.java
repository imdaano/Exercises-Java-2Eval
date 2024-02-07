package com.liceolapaz.des.dsv;

public class Dolar extends Moneda{
    // 1 U.S. dollar = 0.883509299 Euros
    public Dolar(double cantidadEntrada) {
        this.cantidad = cantidadEntrada;
    }

    @Override
    protected double cantidadEnEuros() {

        double resultado = cantidad * 0.883509299;

        return resultado;
    }
}
