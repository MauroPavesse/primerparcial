/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Copy&&Paste
 */
public class Factura implements Liquidacion{
    // Atributos
    private int numeroFactura;
    private Repuesto[] Repuesto;
    private double montoTotal;
    
    // Constructor
    public Factura(int numeroFactura, Repuesto[] Repuesto){
        this.numeroFactura = numeroFactura;
        this.Repuesto = Repuesto;
        this.montoTotal = 0;
    }
    
    // Metodos
    public double getMonto(){
        return this.montoTotal;
    }
    
    public double calculaMonto(){
        var monto = 0;
        for(int i=0;i<Repuesto.length;i++){
            if(Repuesto[i] instanceof Llantas){
                monto+= (Repuesto[i].getPrecio()*0.21)+Repuesto[i].getPrecio();
            }
            else
            {
                monto+= Repuesto[i].getPrecio();
            }
        }
        this.montoTotal = monto;
        return this.montoTotal;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();  
        sb.append("\nNumero factura: ");
        sb.append(this.numeroFactura);
        sb.append("\nMonto total: ");
        sb.append(this.calculaMonto());
        return sb.toString();
    }
    
    public double montoPago(){
        return calculaMonto();
    }

}