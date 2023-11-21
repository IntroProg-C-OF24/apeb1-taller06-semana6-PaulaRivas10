/*
Problema-1
Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador
de Sistemas Informáticos para programar su sistema de compras online, el cual 
calcule el precio total de la compra para un cliente. Para ello, se necesita 
utilizar estructuras secuenciales y de selección (if simple, doble y/o anidadas),
sin aplicar ciclos repetitivos.
Requisitos:
La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos
variantes.
Al costo total de la factura, se debe incluir los gastos por concepto de 
transporte/envío del paquete, del cual no se aplican ningún tipo de descuentos 
o impuestos dada la excepción descrita en el punto 3.b.
El objetivo es presentar al usuario los detalles de su compra: costos, 
impuestos, descuentos, monto final dadas las siguientes condiciones: a. Si el 
subtotal de la compra (sin descuentos o gastos de envío), supera los $1000, se 
le otorga un 20% de descuento; y si es al menos los $1000 el descuento es como
mínimo 5%. b. Adicional, si la compra es mayor a $5000, el envío será gratuito. 
c. El IVA del 10% se debe aplicar a todos los artículos antes de agregar 
cualquier tipo de descuesto o promoción.
A continuación, algunos ejemplos de una factura modelo:
 */
package tareasoluciones;

import java.util.Scanner;

public class FacturacionProductos_1 {

    public static void main(String[] args) {
        double costoIpad;
        double totalIpad;
        double costoIphone;
        double totalIphone;
        double subTotal;
        double total;
        double descuento;
        double gastoEnvio;
        double IVA;
        double submasIva;
        int unidadesIpad;
        int unidadesIphone;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el costo del Ipad");
        costoIpad = teclado.nextDouble();
        System.out.println("Unidades adquiridas");
        unidadesIpad = teclado.nextInt();
        System.out.println("Ingresa el costo del Iphone");
        costoIphone= teclado.nextDouble();
        System.out.println("Unidades adquiridas");
        unidadesIphone = teclado.nextInt();
        System.out.println("Ingresa el costo del envio");
        gastoEnvio = teclado.nextDouble();
        totalIpad = costoIpad * unidadesIpad;
        totalIphone = costoIphone * unidadesIphone;
        total = totalIpad + totalIphone;
        subTotal = totalIpad + totalIphone;
        if (total <= 1000) {
            IVA = total * 0.12;
            submasIva = subTotal + IVA;
            descuento = submasIva * 0.05;
            total = total - descuento + IVA + gastoEnvio;
        } else if (total <= 5000) {
            IVA = total * 0.12;
            submasIva = subTotal + IVA;
            descuento = submasIva * 0.2;
            total = total - descuento + IVA + gastoEnvio;
        } else {
            IVA = total * 0.12;
            submasIva = subTotal + IVA;
            descuento = submasIva * 0.2;
            total = total - descuento + IVA;
            gastoEnvio = 0;
        }
        System.out.println("Producto 1: " + costoIpad + " Subtotal 1: " + totalIpad);
        System.out.println("Producto 2: " + costoIpad + " Subtotal 2: " + totalIphone);
        System.out.println("Subtotal: " + subTotal);
        System.out.println("IVA: " + IVA);
        System.out.println("Subtotal + IVA: " + submasIva);
        System.out.println("Descuento: " + descuento);
        System.out.println("Gasto de envio: " + gastoEnvio);
        System.out.println("TOTAl: $" + total);
    }
}