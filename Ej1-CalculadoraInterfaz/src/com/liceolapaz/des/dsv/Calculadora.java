package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        escribirMenu();
        int opcion = leerOpcion();
        switch (opcion) {
            case 1:
            case 2:
            case 3:
            case 4:
                submenu();
                int opcionSubmenu = leerOpcion();
                switch (opcionSubmenu) {
                    case 1:
                        pedirOperando();
                        int operando = leerOperando();
                        pedirSegundoOperando();
                        int segundoOperando = leerOperando();
                    case 2:
                }
        }

    }

    private static void pedirSegundoOperando() {
        System.out.print("Escribe el segundo operando: ");
    }

    private static int leerOperando() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOperando() {
        System.out.print("Introduzca el primer operando: ");
    }

    private static void submenu() {
        System.out.println("""
                
                Tipo de números
                1. Números enteros
                2. Números racionales
                3. Números complejos
                0. Cancelar
                Escoja una opción:
                """);
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }


    private static void escribirMenu() {
        System.out.println("""
                
                CALCULADORA
                1. Suma
                2. Resta
                3. Producto
                4. División
                0. Salir
                Escoja una opción:
                """);
    }
}
