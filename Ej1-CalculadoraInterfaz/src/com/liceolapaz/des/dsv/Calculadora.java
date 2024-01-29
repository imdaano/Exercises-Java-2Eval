package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        do {
            escribirMenu();
            int opcion = leerOpcion();
            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                    submenu();
                    int opcionSubmenu = leerOpcion();
                    Numero numero1 = null;
                    Numero numero2 = null;
                    switch (opcionSubmenu) {
                        case 1:
                            pedirOperando();
                            int operando = leerOperando();
                            pedirSegundoOperando();
                            int segundoOperando = leerOperando();
                            numero1 = new Entero(operando);
                            numero2 = new Entero(segundoOperando);
                            break;
                        case 2:
                            System.out.println("Primero introducimos los datos de la primera fracción. ");
                            pedirNumerador();
                            int primerNumerador = leerNumero();
                            pedirDenominador();
                            int primerDenominador = leerNumero();
                            numero1 = new Racional(primerNumerador, primerDenominador);
                            System.out.println("Introduce ahora los datos de la siguiente fracción: ");
                            pedirNumerador();
                            int segundoNumerador = leerNumero();
                            pedirDenominador();
                            int segundoDenominador = leerNumero();
                            numero2 = new Racional(segundoNumerador, segundoDenominador);
                            break;
                        case 3:
                            System.out.println("Primero introducimos los datos de la primera fracción. ");
                            pedirNumerador();
                            int primerNumeradorComplejo2 = leerNumero();
                            pedirDenominador();
                            int primerDenominadorComplejo2 = leerNumero();
                            numero1 = new Complejo2(primerNumeradorComplejo2, primerDenominadorComplejo2);
                            System.out.println("Introduce ahora los datos de la siguiente fracción: ");
                            pedirNumerador();
                            int segundoNumeradorComplejo2 = leerNumero();
                            pedirDenominador();
                            int segundoDenominadorComplejo2 = leerNumero();
                            numero2 = new Complejo2(segundoNumeradorComplejo2, segundoDenominadorComplejo2);
                            break;
                    }
                    Numero resultado = null;
                    switch (opcion) {
                    // USANDO LAS LLAVES PODEMOS REUSAR UNA VARIABLE PROQUE SOLO SE ESTA GUARDANDO DENTRO
                    // DE ESAS LLAVES. AL CAMBIAR DE CASO SE CREA OTRA VARIABLE CON EL MISMO NOMBRE
                    case 1:
                        resultado = numero1.suma(numero2);
                        break;
                    case 2:
                        resultado = numero1.resta(numero2);
                        break;
                    case 3:
                        resultado = numero1.producto(numero2);
                        break;
                    case 4:
                        resultado = numero1.division(numero2);
                        break;
                    }
                    if (resultado != null) {
                        System.out.println("El resultado es: " + resultado.mostrar());
                    }
            }
        } while (true);
    }

    private static void pedirDenominador() {
        System.out.print("Introduce primer denominador: ");
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumerador() {
        System.out.print("Introduce primer Numerador: ");
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
