
package entidades;

/**
 *
 * @author Copy&&Paste
 */
public class EmpleadoPorHoras extends Empleados{
    
    //Atributos
    private double sueldoPorHoras;
    private int horasTrabajadas;
    
    //Constructor
    public EmpleadoPorHoras(double sueldo, int horas, String nombre, String apellido, String seguro){
        super(nombre, apellido, seguro);
        this.sueldoPorHoras = sueldo;
        this.horasTrabajadas = horas;
    }
    
    //Metodos
    public double getSueldo(){
        return this.sueldoPorHoras;
    }
    
    @Override
    public double ingresos(){
        if(this.horasTrabajadas <= 40){
            return this.sueldoPorHoras*this.horasTrabajadas;
        }
        else{
            return this.sueldoPorHoras*2;
        }
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
