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
        int opcion = 0;
        double calculo = 0;
        System.out.print("Importe a abonar: ");
        Scanner impor = new Scanner(System.in);
        double importe = impor.nextDouble();
       
        while( opcion<1 || opcion >3){
            System.out.print("Ingrese tipo de tarjeta: ");
            Scanner ingresoTipo = new Scanner(System.in);
            opcion = ingresoTipo.nextInt();
            
        }
        
        System.out.print("Cantidad de cuotas: ");
        Scanner inCantCuotas = new Scanner(System.in);
        int cantCuotas = inCantCuotas.nextInt();
        
        
        switch(opcion){
            case 1:
                calculo = importe * 0.05;
                break;
            case 2: 
                calculo = importe * 0.10;
                break;
            case 3: 
                calculo = importe * 0.15;
                break;
            default:
                 System.out.println("Error en el tipo de tarjeta.");
                 break;      
        }
        
        double total = importe - calculo;
        double importeXCuota = calculo/cantCuotas;
        
        System.out.println("Importe a abonar con descuento: " + String.format("%.2f", total));
        System.out.println("Descuento: " +  String.format("%.2f", calculo));
        System.out.println("Cantidad de cuotas: " + cantCuotas);
        System.out.println("Importe por cuota: " + String.format("%.2f", importeXCuota));
    }
}
    

