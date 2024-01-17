package com.liceolapaz.des.dsv;

public class Entero extends Numero {

    // SI PONE + ES PUBLICA / SI PONE - ES PRIVADA / SI PONE # ES PROTECTED
    private int valor;


    public Entero(int valor) {
        this.valor = valor;
    }


    // GENERAMOS GETTER Y SETTER CON CLICK DERECHO GENERATE GETTER & SETTER
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    protected Numero suma(Numero operando) {
        Entero resultado = null;

        // comprobar si (variable de la izquierda) operando  es un entero
        if (operando instanceof Entero) {
            // crear variable local
            // esta operación lo que hace es tratar el operando en vez como un numero, como un entero.

            Entero op = (Entero) operando;

            // Resultado antes era null y ahora será un nuevo entero
            // en new Entero ( sumanos el valor que obtenemos de un operando + el valor del segundo )
            resultado = new Entero(getValor() + op.getValor());

            // OTRA FORMA DE HACERLO
            // result = (getValor() + op.getValor());
            // resultado = new Entero (result);

        } else {
            System.out.println("El operando tiene que ser un número entero.");
        }

        return resultado;
    }

    @Override
    protected Numero resta(Numero operando) {
        return null;
    }

    @Override
    protected Numero producto(Numero operando) {
        return null;
    }

    @Override
    protected Numero division(Numero operando) {
        return null;
    }

    @Override
    protected String mostrar() {
        return null;
    }
}

