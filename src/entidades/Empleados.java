
package entidades;

/**
 *
 * @author Copy&&Paste
 */

public class Empleados implements Liquidacion{
    
    //Atributos
    private String primerNombre;
    private String apellido;
    private String numeroSeguroSocial;
    
    //Constructor
    public Empleados(String nombre, String apellido, String seguro){
        this.primerNombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = seguro;
    }
    
    //Métodos
    public double ingresos(){
        return 0;
    }
    
    public String getNombre(){
        return this.primerNombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getSeguro(){
        return this.numeroSeguroSocial;
    }
    
    public double montoPago(){
        return ingresos();
    }
}
