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
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregarC("Deividson", 21 , "55987534", "leshe@gmail.com");
        agenda.agregarC("Isaac", 19, "5587632154", "isaac@hotmail.com");
        agenda.agregarC("Abraham", 20, "2464695764", "eyv@gmail.com");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        agenda.buscarNombre("Abraham");
        System.out.println("________________________");
        agenda.buscarNombre("Isaac");
        System.out.println("________________________");
        agenda.buscarNombre("Deividson");
        System.out.println("________________________");
        agenda.buscarNombre("Salvatti");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        agenda.buscarMail("leshe@gmail.com");
        System.out.println("________________________");
        agenda.buscarMail("isaac@hotmail.com");
        System.out.println("________________________");
        agenda.buscarMail("eyv@gmail.com");
        System.out.println("________________________");
        agenda.buscarMail("maui@gmail.com");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        agenda.buscarTel("55987534");
        System.out.println("________________________");
        agenda.buscarTel("5587632154");
        System.out.println("________________________");
        agenda.buscarTel("2464695764");
        System.out.println("________________________");
        agenda.buscarTel("23");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    
}
