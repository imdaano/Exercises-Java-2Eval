package com.liceolapaz.des.dsv;

public abstract class Moneda {
    // lo creamos protected porque indica #
    // - es privado
    // + es público
    //
    protected double cantidad;

    // Creamos en la clase padre el constructor para llevarlo luego a los hijos
    public Moneda(double cantidad) {
        this.cantidad = cantidad;
    }

    protected abstract double cantidadEnEuros();




}
