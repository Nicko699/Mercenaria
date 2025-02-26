package mercenaria;

import java.util.Scanner;

public class Mercenaria {

    public static void main(String[] args) {

        int cant_Productos = 0;
        double costo_Total = 0;

        Scanner teclado = new Scanner(System.in);

        while (cant_Productos < 5) {
            while (true) {
                try {
                    System.out.println("Ingrese la cantidad de productos");
                    cant_Productos = teclado.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Solo se permiten numeros.Vuelva a ingresar");
                    teclado.nextLine();
                }
            }

            if (cant_Productos < 0) {
                if (cant_Productos < 5 && cant_Productos >= 0) {
                    System.out.println("No se permiten compras inferiores a 5.");
                } else {
                    System.out.println("No se permiten valores negativos.");
                }
            } else {
                System.out.println("Ingrese el costo total");
                costo_Total = teclado.nextDouble();

                if (cant_Productos >= 5 && cant_Productos <= 15) {
                    System.out.println("El costo del envío es de $10USD");
                    costo_Total += 10;

                } else if (cant_Productos > 15) {

                    System.out.println("El envío es gratuito");

                }

                if (costo_Total < 100) {
                    costo_Total = 100 - costo_Total;
                    System.out.println("No hay promociones. Usted necesita $" + costo_Total + "USD para entrar a la promocion");

                } else if (costo_Total > 100 && costo_Total < 300) {
                    costo_Total = costo_Total - (costo_Total * 0.05);
                    System.out.println("Usted posee un descuento del 5% sobre el total. El nuevo monto a pagar es de:$" + costo_Total + "USD");

                } else if (costo_Total > 300) {
                    costo_Total = costo_Total - (costo_Total * 0.10);
                    System.out.println("Usted posee un descuento del 10$ sobre el total. El nuevo monto a pagar es de:$" + costo_Total + "USD");

                }
               
        }

    }
    } }
