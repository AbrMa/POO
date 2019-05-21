/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Alumno
 */
public class Contacto extends Persona {
    public String tel;
    public String email;

    Contacto(String nombre, int edad, String telefono, String email) {
        this.nombre = nombre;
        this.tel = telefono;
        this.email = email;
        this.edad = edad;
    }
    
    public void impC() { 
        System.out.println("Nombre " + nombre);
        System.out.println("Edad " + edad);
        System.out.println("Tel " + tel);
        System.out.println("Email " + email);
    }    

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }
}
