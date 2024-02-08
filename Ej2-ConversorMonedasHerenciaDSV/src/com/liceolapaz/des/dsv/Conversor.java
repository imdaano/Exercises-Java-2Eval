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
                case 2:
                case 3:
                System.out.println("Escriba la cantidad:");
                double cantidad = leerCantidad();
                Moneda moneda = null;
                    if (opcion == 1) {
                        // crea objeto tipo dolar nuevo
                        moneda = new Dolar(cantidad);
                        // imprimimos resultado de la operacion
                    } else if (opcion == 2){
                        // crea objeto tipo dolar nuevo
                        moneda = new Libra(cantidad);
                        // imprimimos resultado de la operacion
                    } else if (opcion == 3) {
                        // crea objeto tipo dolar nuevo
                        moneda = new Yen(cantidad);
                        // imprimimos resultado de la operacion
                    }
                    System.out.println("La cantidad en euros es: " + moneda.cantidadEnEuros() + "€");
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
