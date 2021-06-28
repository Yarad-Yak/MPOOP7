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
public class Empleado {
    
    private String nombre;
    private int numEmpleado;
    private float sueldo;

    public Empleado() {
    }

    public Empleado(String nombre, int numEmpleado, float sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public void aumentarSueldo(int porcentaje){
        sueldo = sueldo + (sueldo*porcentaje/100);
    }

    @Override
    public String toString() { //Sobreescritura mismo metodo con mismos parametros
        return super.toString() + "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    //SObre carga mismo metodo pero diferentes parametros
}
