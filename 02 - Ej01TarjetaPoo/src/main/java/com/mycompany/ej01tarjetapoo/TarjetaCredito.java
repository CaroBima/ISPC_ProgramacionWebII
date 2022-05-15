package com.mycompany.ej01tarjetapoo;

/**
 *
 * @author Caro
 */
public class TarjetaCredito {
    private double interes = 0;
    
    //devuelve el interes correspondiente al tipo de tarjeta
    public double interesDeTarjeta( int tipoTarjeta){
        if(tipoTarjeta == 1){
            interes = 0.05;
        }else if (tipoTarjeta == 2){
            interes = 0.10;
        }else if (tipoTarjeta == 3){
            interes = 0.15;
        }
        return interes;
    }
    
    //devuelve el monto total con intereses sumados
    public double calcularMontoTotal(double monto, int tipoTarjeta, int cantCuotas){
        double montoTotal = 0;
        double interesT = this.interesDeTarjeta(tipoTarjeta);
        montoTotal = monto * interesT;
        return montoTotal;
    }
    
}
