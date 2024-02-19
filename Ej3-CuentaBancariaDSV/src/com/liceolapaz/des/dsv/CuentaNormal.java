package com.liceolapaz.des.dsv;

public class CuentaNormal extends CuentaBancaria {
    public CuentaNormal(double saldo) {
        super(saldo);
    }

    @Override
    public void retirarDinero(double cantidad) {
        if (consultarSaldo() < cantidad) {
            System.out.println("No tienes suficiente saldo.");
        } else {
            super.retirarDinero(cantidad);
        }
    }

}
