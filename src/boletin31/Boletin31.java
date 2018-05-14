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
public class Boletin31{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Coche coche1=new Coche("1234DCC","Seat","Leon");
        JefeDeZona jefe1=new JefeDeZona("despacho1","secretario1",coche1,"nombre1","apellido1","direccion2","dni1","telefono1",2000);
        Secretario secretario1=new Secretario("numero1","fax1","despacho2","nombre2","apellido2","direccion1","dni2","telefono2",1500);
        Vendedor vendedor1=new Vendedor("movil3","area1", 3,coche1,"nombre3","apellido3","direccion3","dni3","telefono3",900);
    
        ArrayList<Empleado> empleados=new ArrayList();
        
        empleados.add(jefe1);
        empleados.add(secretario1);
        empleados.add(vendedor1);
    }
    
}
