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
          double importeTotal = 0;
          
          //solicito el ingreso del importe total a abonar:
          
          
          //llamo al metodo que solicita el ingreso de el tipo de tarjeta, devuelve el numero de opcion solamente
          opcion = ingresoTipoTarj();
          
          //solicito el ingreso de la cantidad de cuotas:
          System.out.print("Ingrese la cantidad de cuotas:");
          Scanner ingCantCuotas = new Scanner(System.in);
          int cantCuotas = ingCantCuotas.nextInt();
          
            
        }
        
        //permite el ingreso del tipo de tarjeta y devuelve el numero de opcion
        public static int ingresoTipoTarj(){
           int opcionTarjeta = 0;
           //do while para validar que el número ingresado sea correcto, que corresponda a una tarjeta 
           do {
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
            } while( opcionTarjeta<1 || opcionTarjeta >3);
            
           return opcionTarjeta;
            
        }       
       
       // public static calcularMontoCuota(){
        //}
}
