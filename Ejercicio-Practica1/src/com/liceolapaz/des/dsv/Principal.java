package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Departamento[] departamentos = new Departamento[3];
        do {
            System.out.println("""
                1. Listar Departamento
                2. Añadir Departamento
                3. Eliminar Departamento
                
                0. Salir
                """);
            Scanner teclado = new Scanner(System.in);
            int opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    for (int i = 0; i < departamentos.length; i++) {
                        if (departamentos[i] != null) {
                            System.out.println(departamentos[i]);
                        }
                    }
                    break;
                case 2:
                    /*boolean habiaSitio = false;*/
                    int posicionLibre = -1;
                    for (int i = 0; i < departamentos.length; i++) {
                        if (departamentos[i] == null) {
                            posicionLibre = i;
                            break;
                        }
                    }

                    if (posicionLibre != -1) {
                        System.out.println("Introduce un departamento nuevo");
                        System.out.println("Introduce el id:");
                        int id = teclado.nextInt();
                        System.out.println("Introduce el nombre:");
                        String nombre = teclado.next();
                        Departamento departamento = new Departamento(nombre, id);

                        departamentos[posicionLibre] = departamento;
                        /*for (int i = 0; i < departamentos.length; i++) {
                            if (departamentos[i] == null) {
                                departamentos[i] = departamento;
                                System.out.println(departamento);
                                break;
                            }
                        }
                        */


                        System.out.println("Departamento guardado");
                    } else {
                        System.out.println("No hay espacio disponible para más departamentos.");
                    }
                    break;

                case 3:
                    // no repetir id
                    // eliminar departamentos segun el id

                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while (true);
    }
}
