package com.liceolapaz.des.dsv;

public class Yen extends Moneda{
    // 1 Japanese yen = 0.00779327499 Euros

    public Yen(double cantidadEntrada) {
        this.cantidad = cantidadEntrada;
    }

    @Override
    protected double cantidadEnEuros() {
        double resultado = cantidad * 0.00779327499;
        return resultado;
    }
}
