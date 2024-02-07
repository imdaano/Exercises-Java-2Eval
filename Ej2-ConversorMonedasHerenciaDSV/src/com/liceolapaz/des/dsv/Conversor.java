package com.liceolapaz.des.dsv;

import java.util.List;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        do {
            System.out.println("""
                
                CONVERSOR DE MONEDAS
                1. Dólares
                2. Libras
                3. Yens
                0. Salir
                Escoja una opción:
                                
                """);

            int opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    System.out.println("Escriba la cantidad:");
                    double cantidad = leerCantidad();
                    // crea objeto tipo dolar nuevo
                    Dolar dolar = new Dolar(cantidad);
                    // imprimimos resultado de la  operacion
                    System.out.println("La cantidad en euros es: " + dolar.cantidadEnEuros() + "€");
                    break;

                case 2:
                    System.out.println("Escriba la cantidad:");
                    double cantidad2 = leerCantidad();
                    // crea objeto tipo dolar nuevo
                    Libra libra = new Libra(cantidad2);
                    // imprimimos resultado de la operacion
                    System.out.println("La cantidad en euros es: " + libra.cantidadEnEuros() + "€");
                    break;

                case 3:
                    System.out.println("Escriba la cantidad:");
                    double cantidad3 = leerCantidad();
                    // crea objeto tipo dolar nuevo
                    Yen yen = new Yen(cantidad3);
                    // imprimimos resultado de la operacion
                    System.out.println("La cantidad en euros es: " + yen.cantidadEnEuros() + "€");
                    break;

                case 0:
                    System.out.println("Hasta luego Lucas.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        } while (true);
    }

    private static double leerCantidad() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextDouble();
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
}
