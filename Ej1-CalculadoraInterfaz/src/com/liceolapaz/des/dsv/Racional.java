package com.liceolapaz.des.dsv;

public class Racional extends Numero {

    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
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
        Racional resultado = null;

        // comprobar si (variable de la izquierda) operando  es un entero
        if (operando instanceof Racional) {
            // crear variable local
            // esta operación lo que hace es tratar el operando en vez como un numero, como un entero.

            Racional op = (Racional) operando;

            // Resultado antes era null y ahora será un nuevo entero
            // en new Entero ( sumanos el valor que obtenemos de un operando + el valor del segundo )
            // resultado = new Racional(getValor() + op.getValor());
            resultado = new Racional(
                    (getNumerador() * op.getDenominador())+(getDenominador()* op.getNumerador()),
                    (getDenominador()*op.getDenominador())
                    );

            // OTRA FORMA DE HACERLO
            // result = (getValor() + op.getValor());
            // resultado = new Entero (result);

        } else {
            System.out.println("El operando tiene que ser un número racional.");
        }

        return resultado;
    }

    @Override
    protected Numero resta(Numero operando) {
        Racional resultado = null;

        // comprobar si (variable de la izquierda) operando  es un entero
        if (operando instanceof Racional) {
            // crear variable local
            // esta operación lo que hace es tratar el operando en vez como un numero, como un entero.

            Racional op = (Racional) operando;

            // Resultado antes era null y ahora será un nuevo entero
            // en new Entero ( sumanos el valor que obtenemos de un operando + el valor del segundo )
            // resultado = new Racional(getValor() + op.getValor());
            resultado = new Racional(
                    (getNumerador() * op.getDenominador())-(getDenominador()* op.getNumerador()),
                    (getDenominador()*op.getDenominador())
            );

            // OTRA FORMA DE HACERLO
            // result = (getValor() + op.getValor());
            // resultado = new Entero (result);

        } else {
            System.out.println("El operando tiene que ser un número racional.");
        }

        return resultado;
    }

    @Override
    protected Numero producto(Numero operando) {
        Racional resultado = null;

        // comprobar si (variable de la izquierda) operando  es un entero
        if (operando instanceof Racional) {
            // crear variable local
            // esta operación lo que hace es tratar el operando en vez como un numero, como un entero.

            Racional op = (Racional) operando;

            // Resultado antes era null y ahora será un nuevo entero
            // en new Entero ( sumanos el valor que obtenemos de un operando + el valor del segundo )
            // resultado = new Racional(getValor() + op.getValor());
            resultado = new Racional(getNumerador() * op.getNumerador(),
                                    getDenominador() * op.getDenominador());

            // OTRA FORMA DE HACERLO
            // result = (getValor() + op.getValor());
            // resultado = new Entero (result);

        } else {
            System.out.println("El operando tiene que ser un número racional.");
        }

        return resultado;
    }

    @Override
    protected Numero division(Numero operando) {
        Racional resultado = null;

        // comprobar si (variable de la izquierda) operando  es un entero
        if (operando instanceof Racional) {
            // crear variable local
            // esta operación lo que hace es tratar el operando en vez como un numero, como un entero.

            Racional op = (Racional) operando;

            // Resultado antes era null y ahora será un nuevo entero
            // en new Entero ( sumanos el valor que obtenemos de un operando + el valor del segundo )
            // resultado = new Racional(getValor() + op.getValor());


            // OTRA FORMA DE HACERLO
            // result = (getValor() + op.getValor());
            // resultado = new Entero (result);

        } else {
            System.out.println("El operando tiene que ser un número racional.");
        }

        return resultado;
    }

    @Override
    protected String mostrar() {
        return numerador + " / " + denominador;
    }
}
