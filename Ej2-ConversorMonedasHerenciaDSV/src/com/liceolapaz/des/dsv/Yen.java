package com.liceolapaz.des.dsv;

public class Yen extends Moneda{

    private final static double CONVERSION_A_YEN = 0.00779327499;
    public Yen(double cantidad) {
        super (cantidad);
    }
    // 1 Japanese yen = 0.00779327499 Euros



    @Override
    protected double cantidadEnEuros() {
        double resultado = cantidad * CONVERSION_A_YEN;
        return resultado;
    }
}
