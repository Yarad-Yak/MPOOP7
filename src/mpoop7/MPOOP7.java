/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop7;

/**
 *
 * @author Yarad Yamil
 */
public class MPOOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente ger1 = new Gerente();
        ger1.setNombre("MochiMochi");
        ger1.setNumEmpleado(2323);
        ger1.setSueldo(50000);
        System.out.println(ger1);
        ger1.asignarPresupuesto(20000);
        System.out.println(ger1);
        System.out.println("Presupuesto:" + ger1.getPresupuesto());
        
        System.out.println("************************************");
        
        Gerente ger2 = new Gerente(50000,"SawakoJS",2345,30000);
        System.out.println(ger2);
        ger2.aumentarSueldo(10);
        System.out.println(ger2);
        
        System.out.println("************************************");
        
        Gerente ger3 = new Gerente();
        if(ger3 instanceof Gerente)//Fue creado apartir de gerente?
            System.out.println("Es una instancia de Gerente");
        if(ger3 instanceof Empleado)
            System.out.println("Si es una instancia de empleado");
        else
            System.out.println("No es una instancia de empleado");
        if(ger3 instanceof Object)
            System.out.println("Si es una instancia de Object");
        else
            System.out.println("No es una instancia de Object");
    }
    
}
