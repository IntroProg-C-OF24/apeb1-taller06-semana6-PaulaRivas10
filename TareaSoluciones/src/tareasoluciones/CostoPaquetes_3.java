/*
Problema-3
Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según
la región y el peso del paquete. Si el peso es menor de 5 kg y la región es 
"local", el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la
región "nacional". Para cualquier otro caso, el costo es de $15.
 */
package tareasoluciones;

import java.util.Scanner;

public class CostoPaquetes_3 {

    public static void main(String[] args) {
        double paquete;
        double peso;
        String region;
        double costoEnvio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio: ");
        paquete = teclado.nextDouble();
        System.out.println("Ingrese el peso: ");
        peso = teclado.nextDouble();
        teclado.nextLine(); // Consume la entrada de línea vacía
        System.out.println("Ingrese la region: ");
        region = teclado.nextLine();
        costoEnvio = 0;
        switch (region) {
            case "local":
                if (peso < 5) {
                    paquete = paquete + 5;
                    System.out.println("El precio del paquete es: " + paquete);
                } else if (peso < 10.0) {
                    paquete = paquete + 10;
                    System.out.println("El precio del paquete es: " + paquete);
                } else {
                    paquete = paquete + 15;
                    System.out.println("El precio del paquete es: " + paquete);
                }
                break;
            case "nacional":
                if (peso >= 5 && peso < 10.0) {
                    paquete = paquete + 10;
                    System.out.println("El precio del paquete es: " + paquete);
                } else {
                    paquete = paquete + 15;
                    System.out.println("El precio del paquete es: " + paquete);
                }
                break;
            default:
                paquete = paquete + 15;
                System.out.println("El precio del paquete es: " + paquete);
                break;
        }

    }
}

