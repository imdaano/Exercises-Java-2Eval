package com.liceolapaz.des.dsv;

public class Departamento {

    private String nombre;

    private int id;

    public Departamento(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public String toString(){
        return id + " " + nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
