package com.liceolapaz.des.dsv;

public abstract class CuentaBancaria {

    // Al hacerla privada no vamos a poder acceder en las otras clases usando el this.
    // Hay dos opciones para acceder a saldo, usando getter y setter para saldo o llamar a saldo
    // e implementar luego el método en las clases hijas
    private double saldo;

    // los hacemos void porque lo indica el enunciado
    public void ingresarDinero (double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva.");
        } else {
            saldo = saldo + cantidad;
        }
    }

    public void retirarDinero (double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva.");
        } else {
            saldo = saldo - cantidad;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
}
