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
public class JefeDeZona extends Empleado{
    private String despacho;
    ArrayList<Vendedor> vendedores=new ArrayList();
    private String secretario;
    private Coche coche;

    public JefeDeZona(String despacho,String secretario, Coche coche, String nombre, String apellido, String direccion, String dni, String telefono, double salario){
        super(nombre, apellido, direccion, dni, telefono, salario);
        this.despacho=despacho;
        this.secretario=secretario;
        this.coche=coche;
    }

    public String getDespacho(){
        return despacho;
    }

    public String getSecretario(){
        return secretario;
    }

    public void cambiarSecretario(String secretario){
        this.secretario=secretario;
    }

    public Coche getCoche(){
        return coche;
    }

    public void cambiarCoche(Coche coche){
        this.coche=coche;
    }

    @Override
    public String toString(){
        return super.toString()+"despacho="+despacho+", secretario="+secretario+", coche="+coche;
    }

    @Override
    public void incrementarSalario(){
        salario=salario+(0.2*antiguedad);
    }
    
}
