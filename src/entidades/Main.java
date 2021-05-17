
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Copy&&Paste
 */

public class Main {
    
    static public void main(String args[]){ 
        //PUNTO A
        EmpleadoAsalariado em1 = new EmpleadoAsalariado(19,"Mauro", "Pavesse", "12345");
        EmpleadoAsalariado em2 = new EmpleadoAsalariado(18, "Seba", "Arias", "54321");
        EmpleadoPorComision em3 = new EmpleadoPorComision(20, 2, 22, "A", "B", "12");
        EmpleadoPorComision em4 = new EmpleadoPorComision(30, 3, 33, "B", "C", "13");
        EmpleadoPorHoras em5 = new EmpleadoPorHoras(40, 8, "C", "D", "14");
        EmpleadoPorHoras em6 = new EmpleadoPorHoras(50, 8, "D", "E", "15");
        
        Empleados[] empleados = {em1, em2, em3, em4, em5, em6};
        
        //PUNTO C
        for(int i=0; i< empleados.length; i++){
            System.out.println(empleados[i].toString());
        }
        
        //PUNTO B
        // Factura 1
        Llantas l1 = new Llantas(1030);
        Llantas l2 = new Llantas(550);
        Rueda r1 = new Rueda(530);
        Rueda r2 = new Rueda(220);

        Repuesto[] rep = {l1,l2,r1,r2};
        Factura f1 = new Factura(1,rep);

        // Factura 2
        Llantas l3 = new Llantas(990);
        Llantas l4 = new Llantas(650);
        Rueda r3 = new Rueda(550);
        Rueda r4 = new Rueda(440);
        
        Repuesto[] rep2 = {l3,l4,r3,r4};
        Factura f2 = new Factura(2,rep2);

        Factura[] facturas = {f1,f2};

        for(int i=0;i<facturas.length;i++){
            System.out.println(facturas[i].toString());
        }

        //PUNTO D
        double sumaTotal = 0; 
        
        System.out.println("=========================================================\nFACTURAS:");
        for(int i=0;i<facturas.length;i++){
            System.out.println("\t" + facturas[i].montoPago());
            sumaTotal += facturas[i].montoPago();
        }
        
        System.out.println("\nEMPLEADOS:");
        for(int i=0; i< empleados.length; i++){
            System.out.println("\t" + empleados[i].montoPago());
            sumaTotal += empleados[i].montoPago();
        }
         System.out.println("\nTOTAL: " + sumaTotal);
        
        ArrayList<Object> list = new ArrayList <Object>();
        list.add(f2);
        for(Object o: list){
            System.out.println(o);                 
        }
    }
    
    
}
