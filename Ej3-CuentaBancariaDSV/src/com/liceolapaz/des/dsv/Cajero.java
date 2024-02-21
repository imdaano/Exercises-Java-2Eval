package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Cajero {


    public static void main(String[] args) {
        CuentaBancaria miCuenta = null;
        do {

            System.out.println("""
                                        
                    BANCO
                     1. Crear cuenta
                     2. Ingresar dinero
                     3. Retirar dinero
                     4. Consultar saldo
                     0. Salir
                    Escoja una opción:
                                    
                    """);

            Scanner teclado = new Scanner(System.in);
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("""
                            Tipo de cuenta
                             1. Cuenta normal
                             2. Cuenta Premium
                             0. Cancelar
                            Escoja una opción:
                                                        
                            """);
                    int opcion2 = teclado.nextInt();

                    switch (opcion2) {
                        case 1:
                            System.out.println("Introduzca el saldo inicial: ");
                            double saldo = leerDouble();
                            miCuenta = new CuentaNormal(saldo);
                            break;
                        case 2:
                            System.out.println("Introduzca el saldo inicial: ");
                            double saldo2 = leerDouble();
                            miCuenta = new CuentaPremium(saldo2);
                            break;
                        case 0:

                            break;

                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;
                case 2:
                case 3:
                    if (miCuenta == null) {
                        System.out.println("No tienes una cuenta creada.");
                    } else {
                        System.out.println("Introduzca la cantidad: ");
                        double cantidad = teclado.nextDouble();
                        if (opcion == 2) {
                            miCuenta.ingresarDinero(cantidad);
                        } else {
                            miCuenta.retirarDinero(cantidad);
                        }
                    }
                    break;
                case 4:
                    if (miCuenta != null ) {
                        System.out.println("Tu saldo es: " + miCuenta.consultarSaldo() + "€.");
                    }else {
                        System.out.println("No tienes una cuenta bancaria.");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        } while (true);
    }

    private static double leerDouble() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextDouble();
    }


}
