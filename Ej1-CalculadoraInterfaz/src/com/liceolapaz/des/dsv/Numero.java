package com.liceolapaz.des.dsv;

public abstract class Numero {
    protected abstract Numero suma(Numero operando);
    protected abstract Numero resta(Numero operando);
    protected abstract Numero producto(Numero operando);
    protected abstract Numero division(Numero operando);
    protected abstract String mostrar();

}
