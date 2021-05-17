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
public class EmpleadoAsalariado extends Empleados{
    
    //Atributos
    private double salarioSemanal;
    
    //Constructor
    public EmpleadoAsalariado(double salario, String nombre, String apellido, String seguro){
        super(nombre, apellido, seguro);
        this.salarioSemanal = salario;
    }
    
    @Override
    public double ingresos(){
        return 15000;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();  
        sb.append("\nNombre: ");
        sb.append(this.getNombre());
        sb.append("\nApellido: ");
        sb.append(this.getApellido());
        sb.append("\nSeguro: ");
        sb.append(this.getSeguro());
        sb.append("\nSueldo: ");
        sb.append(this.ingresos()); 
        return sb.toString();
    }
    
}
