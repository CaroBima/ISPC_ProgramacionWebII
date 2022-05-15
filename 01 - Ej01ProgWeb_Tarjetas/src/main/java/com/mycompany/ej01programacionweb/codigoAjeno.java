package com.mycompany.ej01programacionweb;
/*
Dado el siguiente código,realizado por una compañera.
Analizar si el ingreso de datos "Importe a abonar" siempre se ejecuta de manera repetitiva.
Verificar si los cálculos son correctos.
Realizar un nuevo código optimizando con funciones y en caso de tener While usar If. (Llamandolo Tarjetavdos ).
Luego convertirlo a POO.(Generando un nuevo código)- (Llamandolo TarjetaPOO).

*/

import java.util.Scanner;


public class codigoAjeno {
    public static void main(String[] args) {

        //Cálculo pago tarjeta de Crédito en cuotas.
        double importeNeto, valorCuota = 0, importeTotal = 0;
        int planCuotas = 0;
        int tipoTarjeta;
        Scanner miEntrada = new Scanner(System.in);

        do {//para validar que ingrese un num +.
            System.out.println(" Ingrese el importe a abonar ");
            importeNeto = miEntrada.nextDouble();
            if (importeNeto <= 0) {
                System.out.println("Valor incorrecto, ingrese un importe mayor que cero");
            }
        } while (importeNeto <= 0);// si es v, me lo vuelve a pedir hasta que ingrese un valor correcto.
          
        do {// para que vuelva a pedirme luego de la opcion default
         
            System.out.println("Por favor seleccione el tipo de tarjeta: ");
            System.out.println("1-Platino,tiene 5% de recargo");
            System.out.println("2-Dorada,tiene 10% de recargo");
            System.out.println("3-Black,tiene 15% de recargo");

            tipoTarjeta = miEntrada.nextInt();
            int x = tipoTarjeta;

            switch (x) {
                case 1: {
                    System.out.println(" Por favor ingrese el número de cuotas");
                    planCuotas = miEntrada.nextInt();
                    importeTotal = importeNeto + (importeNeto * 5 / 100);
                    valorCuota = importeTotal / planCuotas;
                    break;
                }
                case 2: {
                    System.out.println(" Por favor ingrese el número de cuotas");
                    planCuotas = miEntrada.nextInt();
                    importeTotal = importeNeto + (importeNeto * 10 / 100);
                    valorCuota = importeTotal / planCuotas;
                    break;
                }
                case 3: {
                    System.out.println(" Por favor ingrese el número de cuotas");
                    planCuotas = miEntrada.nextInt();
                    importeTotal = importeNeto + (importeNeto * 15 / 100);
                    valorCuota = importeTotal / planCuotas;
                    break;
                }
                default: {
                    if (tipoTarjeta > 3) {
                        System.out.println("Valor incorrecto");
                    }
                }
            }
        } while (tipoTarjeta > 3);// si es v, me lo vuelve a pedir hasta que ingrese un valor correcto

        System.out.println("Importe total: " + importeTotal);
        System.out.println("Plan de cuotas: " + planCuotas);
        System.out.println("Importe de cada cuota: " + valorCuota);
    }
}