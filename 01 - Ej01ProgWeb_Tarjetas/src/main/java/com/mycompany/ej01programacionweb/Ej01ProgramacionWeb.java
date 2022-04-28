/*
Cálculo pago tarjeta de Crédito en cuotas:


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

package com.mycompany.ej01programacionweb;

import java.util.Scanner;

/**
 *
 * @author Caro
 */
public class Ej01ProgramacionWeb {

    public static void main(String[] args) {
        int opcionTarjeta = 0; //se inicializa a cero para que ingrese al while
        double descuento = 0;
        
        //se  solicita el ingreso del importe a abonar
        System.out.print("Importe a abonar: ");
        Scanner impor = new Scanner(System.in);
        double importe = impor.nextDouble();
       
        //se hace el while para comprobar que se ingrese un valor entre 1 y 3
        //si el valor es menor a 1 o mayor a 3 se sigue repitiendo el ciclo 
        while( opcionTarjeta<1 || opcionTarjeta >3){
            //se solicita el ingreso del valor y se modifica el valor de opcion
            System.out.print("Ingrese tipo de tarjeta: ");
            Scanner ingresoTipo = new Scanner(System.in);
            opcionTarjeta = ingresoTipo.nextInt();
        }
        
        //Ingreso de la cantidad de cuotas
        System.out.print("Cantidad de cuotas: ");
        Scanner inCantCuotas = new Scanner(System.in);
        int cantCuotas = inCantCuotas.nextInt();
        
        //calcula el descuento dependiendo del tipo de tarjeta
        switch(opcionTarjeta){
            case 1:
                descuento = importe * 0.05;
                break;
            case 2: 
                descuento = importe * 0.10;
                break;
            case 3: 
                descuento = importe * 0.15;
                break;
            default:
                 System.out.println("Error en el tipo de tarjeta.");
                 break;      
        }
        
        //calcula el importe total a abonar con el descuento aplicado
        double total = importe - descuento;
        //calcula el importe de cada cuota
        double importeXCuota = total/cantCuotas;
        
        //muestra los importes, limitando los decimales a dos
        System.out.println("Importe a abonar con descuento: " + String.format("%.2f", total));
        System.out.println("Descuento: " +  String.format("%.2f", descuento));
        System.out.println("Cantidad de cuotas: " + cantCuotas);
        System.out.println("Importe por cuota: " + String.format("%.2f", importeXCuota));
    }
}
    

