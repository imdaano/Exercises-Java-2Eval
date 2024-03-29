package com.liceolapaz.des.dsv;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        FiguraGeometrica figura = null;

        while (true) {
            System.out.println("""
                FIGURAS GEOMÉTRICAS
                1. Triángulo
                2. Rectángulo
                3. Cuadrado
                4. Pentágono
                0. Salir
                Escoja una opción:
                                
                """);

            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1: { // Triangulo
                    System.out.println("Escriba el valor del primer lado (base) del triángulo: ");
                    double lado1 = teclado.nextDouble();
                    System.out.println("Escriba el valor del segundo lado del triángulo: ");
                    double lado2 = teclado.nextDouble();
                    System.out.println("Escriba el valor del tercer lado del triángulo: ");
                    double lado3 = teclado.nextDouble();
                    System.out.println("Escriba la altura: ");
                    double altura = teclado.nextDouble();
                    figura = new Triangulo(lado1, lado2, lado3, altura);
                    mostrarResultado(figura);
                }
                    break;
                case 2: { // Rectángulo
                    System.out.println("Escriba el valor de la base: ");
                    double base = teclado.nextDouble();
                    System.out.println("Escriba el valor de la altura: ");
                    double altura = teclado.nextDouble();
                    figura = new Rectangulo(base,altura);
                    mostrarResultado(figura);
                }
                    break;
                case 3: // Cuadrado
                {
                    System.out.println("Escriba el valor del lado: ");
                    double lado = teclado.nextDouble();
                    figura = new Cuadrado(lado);
                    mostrarResultado(figura);
                }
                    break;
                case 4: // Pentágono
                {
                    System.out.println("Escriba el valor del lado: ");
                    double lado = teclado.nextDouble();
                    System.out.println("Escriba el valor del apotema: ");
                    double apotema = teclado.nextDouble();
                    figura = new Pentagono(lado, apotema);
                    mostrarResultado(figura);
                }
                    break;
                case 0: // Salir
                    System.exit(0);

                default: // opcion diferente
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void mostrarResultado(FiguraGeometrica objeto) {
        System.out.println("El area es " + objeto.calcularArea() + " y el perímetro es " + objeto.calcularPerimetro());
    }


}
