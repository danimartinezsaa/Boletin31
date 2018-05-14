/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31;

/**
 *
 * @author dani
 */
public abstract class Empleado{
    String nombre,apellido,direccion,dni,telefono;
    double antiguedad,salario;
    Empleado supervisor;

    public Empleado(String nombre, String apellido, String direccion, String dni, String telefono, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.dni=dni;
        this.telefono=telefono;
        this.salario=salario;
    }

    @Override
    public String toString(){
        return "nombre="+nombre+", apellido="+apellido+", direccion="+direccion+", dni="+dni+", telefono="+telefono+", antiguedad="+antiguedad+", salario="+salario+", supervisor="+supervisor;
    }
    
    public void cambiarSupervisor(Empleado e){
        supervisor=e;
    }
    
    public abstract void incrementarSalario();
    
    
}
