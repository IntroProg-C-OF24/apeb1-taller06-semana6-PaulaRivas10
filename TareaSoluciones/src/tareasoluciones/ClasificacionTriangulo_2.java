/*
Problema-2
Clasificación de un triángulo Dado tres valores que representan las longitudes
de los lados de un triángulo, determinar su tipo. Las reglas son:
Si todos los lados son iguales, mostrar "Triángulo equilátero".
Si dos lados son iguales, mostrar "Triángulo isósceles".
Si todos los lados son diferentes, mostrar "Triángulo escaleno".
Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un
triángulo".
 */
package tareasoluciones;

import java.util.Scanner;

public class ClasificacionTriangulo_2 {

    public static void main(String[] args) {
        double lado1; 
        double lado2; 
        double lado3; 
        double aux;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor del lado 1: ");
        lado1 = teclado.nextDouble();
        System.out.println("Valor del lado 2: ");
        lado2 = teclado.nextDouble();
        System.out.println("Valor del lado 3 ");
        lado3 = teclado.nextDouble();
        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triangulo es Equilatero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
                System.out.println("El triangulo es Isoceles");
            } else {
                System.out.println("El triangulo es Escaleno");
            }
        } else {
            System.out.println("No es triengulo");
        }
        teclado.close();
    }
}
