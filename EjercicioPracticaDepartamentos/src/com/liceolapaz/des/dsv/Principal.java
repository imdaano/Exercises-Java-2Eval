package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Departamento[] departamentos = new Departamento[3];
        do {
            System.out.println("""
                Escoja una opción:
                
                1. Crear Departamento
                2. Listar Departamento
                3. Eliminar Departamento
                
                0. Salir
                """);

            Scanner teclado = new Scanner(System.in);
            int opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    boolean seHaAnhadido = false;
                    boolean yaExiste = false;
                    for (int i = 0; i < departamentos.length; i++) {
                        if (departamentos[i] == null){
                            System.out.println("Introduce el id del departamento: ");
                            int id = teclado.nextInt();
                            for (int j = 0; j < departamentos.length; j++ ){
                                if (departamentos[j] != null) {
                                    if (id == departamentos[j].getId()) {
                                        yaExiste = true;
                                        break;
                                    }
                                }

                            }
                            if (yaExiste){break;}
                            String nombre = pedirNombre();
                            Departamento departamento = new Departamento(id, nombre);
                            departamentos[i] = departamento; // guardamos el nuevo departamento en el array en la posicion i
                            seHaAnhadido = true;
                            break;
                        }
                    }
                    if (seHaAnhadido) {
                        System.out.println("El departamento ha sido añadido correctamente.");
                    } else {
                        if (yaExiste){
                            System.out.println("Ya existe este ID.");
                        }else {
                        System.out.println("No existe sitio para añadir el departamento. Borra un departamento antes de añadir.");
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < departamentos.length; i++){
                        if (departamentos[i] != null ) {
                            Departamento miDepartamento = departamentos[i];
                            System.out.println("Id: " + miDepartamento.getId() + " y nombre: " + miDepartamento.getNombre());
                        }
                    }
                    break;
                case 3:
                    System.out.println("¿Qué departamento desea eliminar? Introduzca su id: ");
                    int id = teclado.nextInt();
                    boolean seHaBorrado = false;
                    for (int i = 0; i< departamentos.length; i++){
                        if (departamentos[i] != null) {
                            if (id == departamentos[i].getId()) {
                                departamentos[i] = null;
                                seHaBorrado = true;
                                break;
                            }
                        }
                    }
                    if (seHaBorrado) {
                        System.out.println("Se ha borrado el departamento.");
                    } else {
                        System.out.println("No existe ese departamento.");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }




        }while (true);
    }

    private static String pedirNombre() {
        System.out.println("Introduce el nombre del departamento: ");
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
}
