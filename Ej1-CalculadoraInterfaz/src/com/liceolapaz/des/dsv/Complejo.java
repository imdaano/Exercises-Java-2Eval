package com.liceolapaz.des.dsv;

public class Complejo extends Numero {
    private int numerador;
    private int denominador;

    public Complejo(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    protected Numero suma(Numero operando) {
        Complejo resultado;
        resultado = null;
        if (operando instanceof Complejo) {
            Complejo op = (Complejo) operando;
            int a = getNumerador();
            int b = getDenominador();
            int c = op.getNumerador();
            int d = op.getDenominador();
            int nuevoNumerador = a + c;
            int nuevoDenominador = b + d;
            resultado = new Complejo(nuevoNumerador, nuevoDenominador);
        }
        return resultado;
    }

    @Override
    protected Numero resta(Numero operando) {
        Complejo resultado;
        resultado = null;
        if (operando instanceof Complejo) {
            Complejo op = (Complejo) operando;
            int a = getNumerador();
            int b = getDenominador();
            int c = op.getNumerador();
            int d = op.getDenominador();
            int nuevoNumerador = a - c;
            int nuevoDenominador = b - d;
            resultado = new Complejo(nuevoNumerador, nuevoDenominador);
        }
        return resultado;

    }

    @Override
    protected Numero producto(Numero operando) {
        Complejo resultado;
        resultado = null;
        if (operando instanceof Complejo) {
            Complejo op = (Complejo) operando;
            int a = getNumerador();
            int b = getDenominador();
            int c = op.getNumerador();
            int d = op.getDenominador();
            int nuevoNumerador = (a * c) - (b * d);
            int nuevoDenominador = (a * d) + (b * c);
            resultado = new Complejo(nuevoNumerador, nuevoDenominador);
        }
        return resultado;

    }

    @Override
    protected Numero division(Numero operando) {
        Complejo resultado;
        resultado = null;
        if (operando instanceof Complejo) {
            Complejo op = (Complejo) operando;
            int a = getNumerador();
            int b = getDenominador();
            int c = op.getNumerador();
            int d = op.getDenominador();
            double nuevoNumerador = ((a * c) + (b * c)) / (Math.pow(c, 2) + Math.pow(d, 2));
            double nuevoDenominador = ((b * c) - (a * d)) / (Math.pow(c, 2) + Math.pow(d, 2));
            resultado = new Complejo((int) nuevoNumerador, (int) nuevoDenominador);
        }
        return resultado;


    }

    @Override
    protected String mostrar() {
        if (denominador >= 0) {
            return numerador + "+" + denominador + "i";
        }
        else {
            return numerador + "-" + (-1 * denominador) + "i";
        }
    }
}