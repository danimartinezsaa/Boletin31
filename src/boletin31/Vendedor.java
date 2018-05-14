/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31;

import java.util.ArrayList;

/**
 *
 * @author dani
 */
public class Vendedor extends Empleado{
    private String movil,area;
    ArrayList<String>clientes=new ArrayList();
    private int porcentaje;
    private Coche coche;

    public Vendedor(String movil, String area, int porcentaje, Coche coche, String nombre, String apellido, String direccion, String dni, String telefono, double salario){
        super(nombre, apellido, direccion, dni, telefono, salario);
        this.movil=movil;
        this.area=area;
        this.porcentaje=porcentaje;
        this.coche=coche;
    }


    @Override
    public String toString(){
        return super.toString()+"movil="+movil+", area="+area+", clientes="+clientes+", porcentaje="+porcentaje+", coche="+coche;
    }
    
    
    public void altaCliente(String nombre){
        clientes.add(nombre);
    }
    
    public void bajaCliente(String nombre){
        for(String cliente:clientes){
            clientes.remove(cliente);
        }
    }
    
    public void cambioCoche(Coche coche){
        this.coche=coche;
    }
    
    @Override
    public void incrementarSalario(){
        salario=salario+(0.1*antiguedad);
    }
}
