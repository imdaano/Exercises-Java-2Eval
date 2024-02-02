package com.liceolapaz.des.dsv;

public abstract class Moneda {

    // al ser protected todos los hijos podrán acceder a Cantidad.
    protected double cantidad;

    public double getCantidad() {
        return cantidad;
    }

    protected abstract double cantidadEnEuros();
}