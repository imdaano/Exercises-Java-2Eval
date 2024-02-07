package com.liceolapaz.des.dsv;

public class Libra extends Moneda{
    // 1 British pound = 1.1029861 Euros
    // Generamos el constructor
    public Libra(double cantidadEntrada) {
        this.cantidad = cantidadEntrada;
    }

    //
    @Override
    protected double cantidadEnEuros() {
        double resultado = cantidad * 1.1029861;
        return resultado;
    }
}
