/*
Problema-4
Convertir un número de mes a nombre. Dado un número del 1 al 12, que representa
un mes del año, muestra el nombre del mes correspondiente. Por ejemplo, si el 
usuario ingresa 1, debe mostrar "Enero"; si ingresa 2, debe mostrar "Febrero", 
y así sucesivamente.
*/
package tareasoluciones;

import java.util.Scanner;

public class ConvertirNumero_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Ingresar numero del 1 - 12");
        num = teclado.nextInt();
        if (num == 1) {
            System.out.println("Enero");
        } else if (num == 2) {
            System.out.println("Febrero");
        } else if (num == 3) {
            System.out.println("Marzo");
        } else if (num == 4) {
            System.out.println("Abril");
        } else if (num == 5) {
            System.out.println("Mayo");
        } else if (num == 6) {
            System.out.println("Junio");
        } else if (num == 7) {
            System.out.println("Julio");
        } else if (num == 8) {
            System.out.println("Agosto");
        } else if (num == 9) {
            System.out.println("Septiembre");
        } else if (num == 10) {
            System.out.println("Octubre");
        } else if (num == 11) {
            System.out.println("Noviembre");
        } else if (num == 12) {
            System.out.println("Diciembre");
        }else if (num > 12) {
                System.out.println("No existe ese mes");
        }
    }
}
