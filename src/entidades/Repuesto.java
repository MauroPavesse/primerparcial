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
public class Repuesto {
    // Atributos
    private double precio;
    
    // Constructor
    
    public Repuesto(double precio){
      this.precio = precio;
    }
    
    // Metodos
   public double getPrecio(){
       return this.precio;
   }
}