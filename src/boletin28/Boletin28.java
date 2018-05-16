/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin28;

import boletin28.Alumno.Enderezo;

/**
 *
 * @author estudios
 */
public class Boletin28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno al= new Alumno("Alex",9,new Enderezo("Garcia Barbon",12));
        System.out.println(al.toString());
        al.cambiarNota();
        System.out.println(al.toString());
    }
    
}
