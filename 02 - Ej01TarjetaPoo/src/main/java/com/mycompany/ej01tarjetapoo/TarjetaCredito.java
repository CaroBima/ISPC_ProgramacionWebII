package com.mycompany.ej01tarjetapoo;

/**
 *
 * @author Caro
 */
public class TarjetaCredito {
    private int tipoTarjeta; //se setea en 1, 2 o 3
    
 
    //devuelve el monto total con intereses sumados
    public double calcularMontoTotal(double monto, int tipoTarjeta){
        double montoTotal = 0;
        double interesT = this.interesDeTarjeta(); //devuelve cual es el interes a pagar, 5%, 10% o 15%
        montoTotal = monto + (monto * interesT);
        return montoTotal;
    }
    
    //devuelve el importe de cada cuota
    public double calcularMontoCuota(double montoTotal, int cantCuotas){
        return montoTotal/cantCuotas;
    }
    
    //devuelve el interes correspondiente al tipo de tarjeta
    public double interesDeTarjeta(){
        double interes = 0;
        if(this.tipoTarjeta == 1){
            interes = 0.05;
        }else if (this.tipoTarjeta == 2){
            interes = 0.10;
        }else if (this.tipoTarjeta == 3){
            interes = 0.15;
        }else{
            interes = 0; //devuelve 0 en caso de que se haya ingresado incorrectamente el tipo de tarjeta
        }
        return interes;
    }
    
  
    //constructor, getter y setters
    public TarjetaCredito() {
    }

    public int getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(int tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    
}
