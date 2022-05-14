/*
Dado el siguiente código,realizado por una compañera.
Analizar si el ingreso de datos "Importe a abonar" siempre se ejecuta de manera repetitiva.
Verificar si los cálculos son correctos.
Realizar un nuevo código optimizando con funciones y en caso de tener While usar If. (Llamandolo Tarjetavdos ).
Luego convertirlo a POO.(Generando un nuevo código)- (Llamandolo TarjetaPOO).

 */

/*
1)-Ingresar por teclado el importe a pagar:

2)-Seleccionar Tipo:
1- Platinum. (5 %)
2- Intermedia. (10 %)
3- Black.(15 %)

3)-Ingresar Cantidad de Cuotas:



4)-Mostrar el resultado total que tiene que pagar y el costo de cada una de 
las cuotas.
  1 - Platino (5% de recargo)
  2 - Dorada (10% de recargo)
  3 - Black (15% de recargo)
*/

package com.mycompany.ej01programacionweb;

import java.util.Scanner;

/**
 *
 * @author Caro
 */
public class Tarjetavdos {
        public static void main(String[] args) {
          //llamo al metodo que permite ingresar el tipo de tarjeta:
          int opcion = 0;
          double importe = 0;
          
          //solicito el ingreso del importe total a abonar:
          System.out.println("*********************************************");
          System.out.print  ("       Ingrese el importe: ");
          Scanner ingImporte = new Scanner(System.in);
          importe = ingImporte.nextDouble();
          
          //llamo al metodo que solicita el ingreso de el tipo de tarjeta, devuelve el numero de opcion solamente
          opcion = ingresoTipoTarj();
          if(opcion != 0){ //valido que se haya ingresado un numero de tarjeta correcto, si es cero quiere decir que se ingreso un valor distinto a 1, 2 o 3
                //solicito el ingreso de la cantidad de cuotas:
                System.out.println("*********************************************");
                System.out.print  ("       Ingrese la cantidad de cuotas: ");
                Scanner ingCantCuotas = new Scanner(System.in);
                int cantCuotas = ingCantCuotas.nextInt();
                
                //calculo los importes para mostrarlos
                double importeTotal = calcularMontoTotal(importe, opcion);
                double importeCuota = calcularMontoCuota(importeTotal, cantCuotas);

                  System.out.println("*********************************************");
                  System.out.println("   Importe total: $" + importeTotal );
                  System.out.println("   Importe de cada cuota: $" + importeCuota);
                  System.out.println("*********************************************");
          }
        }
        
        
         public static double calcularMontoCuota(double monto, int cantCuotas){
            return monto/cantCuotas;
        }
  
        public static double calcularMontoTotal(double monto, int tipoTarjeta){
            if(tipoTarjeta == 1){
                return monto + (monto * 0.05);
            }else if (tipoTarjeta == 2){
                return monto + (monto * 0.10);
            }else{
                return monto + (monto * 0.15);
            }
        }
         
         
        //permite el ingreso del tipo de tarjeta y devuelve el numero de opcion
        public static int ingresoTipoTarj(){
           int opcionTarjeta = 0;
           //do while para validar que el número ingresado sea correcto, que corresponda a una tarjeta 
           //do {
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
                opcionTarjeta = ingresoTipo.nextInt();
            //} while(opcionTarjeta<1 || opcionTarjeta >3);
            //utilizando if en vez de do while o while para validar que el numero este entre 1 y 3:
            if(opcionTarjeta<1 || opcionTarjeta >3){
                System.out.println("Opción inválida, se debe ingresar un número del 1 al 3.");
                return 0; //devuelvo 0 "informando" que se ingreso un valor inválido para que no continuar la ejecucion de las demas opciones
            }
           return opcionTarjeta;
            
        }       
       
       
}
      