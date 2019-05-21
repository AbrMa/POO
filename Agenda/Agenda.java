/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Agenda {
    ArrayList<Contacto> contactos = new ArrayList();
    
    public void agregarC(String nombre, int edad, String telefono, String email) { 
        contactos.add(new Contacto(nombre, edad, telefono, email));
    }
    
    public void buscarNombre(String nombre) {
        int x = 0;
        for(Contacto contacto: contactos) { 
            if(contacto.getNombre() == nombre) { 
                System.out.println("Contacto encontrado: ");
                contacto.impC();
                x = 1;
            }
        }
        if(x==0)
            System.out.println("No encontrado");
    }
    
    public void buscarTel(String telefono) {
        int x = 0;
        for(Contacto contacto: contactos) { 
            if(contacto.getTel() == telefono) { 
                System.out.println("Contacto encontrado: ");
                contacto.impC();
                x = 1;
            }
        }
        if(x==0)
            System.out.println("No encontrado");
    }
        
    public void buscarMail(String email) {
        int x = 0;
        for(Contacto contacto: contactos) { 
            if(contacto.getEmail() == email) { 
                System.out.println("Contacto encontrado: ");
                contacto.impC();
                 x = 1;
            }    
        }
                if(x==0)
            System.out.println("No encontrado");
    }
}
