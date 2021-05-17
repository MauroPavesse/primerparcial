
package entidades;

/**
 *
 * @author Copy&&Paste
 */

public class EmpleadoPorComision extends Empleados{
    
    //Atributos
    private double salarioBase;
    private int cantidadReparaciones;
    private double tarifaComision;
    
    //Constructor
    public EmpleadoPorComision(double salario, int cantidad, double tarifa, String nombre, String apellido, String seguro){
        super(nombre, apellido, seguro);
        this.salarioBase = salario;
        this.cantidadReparaciones = cantidad;
        this.tarifaComision = tarifa;
    }
    
    @Override
    public double ingresos(){
        return 600*this.cantidadReparaciones;
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
