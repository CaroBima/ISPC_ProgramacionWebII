/*Cálculo pago tarjeta de Crédito en cuotas:
1)-Ingresar por teclado el importe a pagar:
2)-Seleccionar Tipo:
    1-Platinum. (5 %)
    2- Intermedia. (10 %)
    3- Black.(15 %)
3)-Ingresar Cantidad de Cuotas:
4)-Mostrar el resultado total que tiene que pagar y el costo de cada una de 
las cuotas.
Crear Código para front (javascript) y back (java) modo consola.
 */

package com.mycompany.ej01tarjetapoo;

import java.util.Scanner;

public class Ej01TarjetaPoo {

    public static void main(String[] args) {
        double importe = 0;
        TarjetaCredito tc = new TarjetaCredito(); //creo una instancia del objeto 

        //solicito el ingreso del importe total a abonar:
        System.out.println("*********************************************");
        System.out.print  ("       Ingrese el importe: ");
        Scanner ingImporte = new Scanner(System.in);
        importe = ingImporte.nextDouble();

        //se solicita el ingreso del valor y se modifica el valor de opcion
        System.out.println("*********************************************");
        System.out.println("*    Cálculo de importe total y cuotas      *");
        System.out.println("*********************************************");
        System.out.println("*                                           *");
        System.out.println("*      Seleccione tarjeta de crédito:       *");
        System.out.println("*       1 - Platino (5% de recargo)         *");
        System.out.println("*       2 - Dorada (10% de recargo)         *");
        System.out.println("*       3 - Black (15% de recargo)          *");
        System.out.println("*                                           *");
        System.out.println("*********************************************");
        System.out.print  ("   Ingrese número de opción (del 1 al 3): ");
        
        Scanner ingresoTipo = new Scanner(System.in);
        int opcionTarjeta = ingresoTipo.nextInt();
        tc.setTipoTarjeta(opcionTarjeta); //guardo el tipo de tarjeta en la instancia utilizando el setter

        if(tc.getTipoTarjeta() != 0){ //valido que se haya ingresado un numero de tarjeta correcto, 
                                      //si es cero quiere decir que se ingreso un valor distinto a 1, 2 o 3
            //solicito el ingreso de la cantidad de cuotas:
            System.out.println("*********************************************");
            System.out.print  ("       Ingrese la cantidad de cuotas: ");
            Scanner ingCantCuotas = new Scanner(System.in);
            int cantCuotas = ingCantCuotas.nextInt();

            //calculo los importes para mostrarlos
            double importeTotal = tc.calcularMontoTotal(importe, tc.getTipoTarjeta());//paso el importe ingresado y el tipo de tarjeta ingresado
            double importeCuota = tc.calcularMontoCuota(importeTotal, cantCuotas);

            System.out.println("*********************************************");
            System.out.println("   Importe total: $" +  String.format("%.2f", importeTotal) ); //agrego el  String.format("%.2f", variable) para limitar los decimales a dos 
            System.out.println("   Importe de cada cuota: $" +  String.format("%.2f", importeCuota));
            System.out.println("*********************************************");
        }else{
            System.out.println("La opción elegida es incorrecta, debe seleccionarse un número entre 1 y 3");
        }
    }
       
}
