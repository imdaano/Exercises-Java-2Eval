package com.liceolapaz.des.dsv;

public class Complejo implements Numero {
    //creamos las variables para parte real e imaginaria.
    private int real;
    private int imaginaria;

    // Creamos el constructor
    public Complejo(int real, int imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    // Creamos los Getters y Setters
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginaria() {
        return imaginaria;
    }

    public void setImaginaria(int imaginaria) {
        this.imaginaria = imaginaria;
    }



    @Override
    public Numero suma(Numero operando) {
        // Creamos variable resultado desde Numero
        Numero resultado;
        // Inicializamos la variable resultado a null
        resultado = null;

        if (operando instanceof Complejo) {
            // inicializamos la segunda variable op y asignamos a operando como complejo2
            Complejo op = (Complejo) operando;

            // inicializamos 4 variables
            int a = getReal();
            int b = getImaginaria();
            int c = op.getReal();
            int d = op.getImaginaria();

            // Creamos las operaciones para la parte real y la parte imaginaria
            int parteReal = a + c;
            int parteImaginaria = b + d;
            resultado = new Complejo(parteReal, parteImaginaria);
        }

        return resultado;
    }

    @Override
    public Numero resta(Numero operando) {
        // Creamos variable resultado desde Numero
        Numero resultado;
        // Inicializamos la variable resultado a null
        resultado = null;

        if (operando instanceof Complejo) {
            // inicializamos la segunda variable op y asignamos a operando como complejo2
            Complejo op = (Complejo) operando;

            // inicializamos 4 variables
            int a = getReal();
            int b = getImaginaria();
            int c = op.getReal();
            int d = op.getImaginaria();

            // Creamos las operaciones para la parte real y la parte imaginaria
            int parteReal = a - c;
            int parteImaginaria = b - d;
            resultado = new Complejo(parteReal, parteImaginaria);
        }

        return resultado;
    }


    @Override
    public Numero producto(Numero operando) {
        Numero resultado;
        // Inicializamos la variable resultado a null
        resultado = null;

        if (operando instanceof Complejo) {
            // inicializamos la segunda variable op y asignamos a operando como complejo2
            Complejo op = (Complejo) operando;

            // inicializamos 4 variables
            int a = getReal();
            int b = getImaginaria();
            int c = op.getReal();
            int d = op.getImaginaria();

            // Creamos las operaciones para la parte real y la parte imaginaria
            int parteReal = (a * c) - (b * d);
            int parteImaginaria = (a * d) + (b * c);
            resultado = new Complejo(parteReal, parteImaginaria);
        }

        return resultado;
    }

    @Override
    public Numero division(Numero operando) {
        Numero resultado;
        // Inicializamos la variable resultado a null
        resultado = null;

        if (operando instanceof Complejo) {
            // inicializamos la segunda variable op y asignamos a operando como complejo2
            Complejo op = (Complejo) operando;

            // inicializamos 4 variables
            int a = getReal();
            int b = getImaginaria();
            int c = op.getReal();
            int d = op.getImaginaria();

            // Creamos las operaciones para la parte real y la parte imaginaria
            double parteReal = ((a * c) + (b * c)) / (Math.pow(c, 2) + Math.pow(d, 2));
            double parteImaginaria = ((b * c) - (a * d)) / (Math.pow(c, 2) + Math.pow(d, 2));
            resultado = new Complejo((int) parteReal, (int) parteImaginaria);
        }

        return resultado;
    }

    @Override
    public String mostrar() {
        if (imaginaria >= 0) {
            return real + "+" + imaginaria + "i";
        } else {
            return real + "-" + (-1 * imaginaria) + "i";
        }
    }
}
