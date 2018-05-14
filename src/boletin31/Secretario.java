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
public class Secretario extends Empleado{
    private String numero,fax,despacho;

    public Secretario(String numero, String fax, String despacho, String nombre, String apellido, String direccion, String dni, String telefono, double salario){
        super(nombre, apellido, direccion, dni, telefono, salario);
        this.numero=numero;
        this.fax=fax;
        this.despacho=despacho;
    }

    @Override
    public String toString(){
        return super.toString()+"numero="+numero+", fax="+fax+", despacho="+despacho;
    }
    
    @Override
    public void incrementarSalario(){
        salario=salario+(0.05*antiguedad);
    }
}
