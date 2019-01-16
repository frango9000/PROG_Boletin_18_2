/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fran.app;

import com.fran.data.Notas;
import com.fran.data.Personal;
import java.util.Scanner;
/**
 *
 * @author fsancheztemprano
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Personal alum = new Personal(986000000, "correo@dominio.com");
        Scanner scan = new Scanner(System.in);  
        
        Academica academica = new Academica("Francisco",new Notas(), new Personal(986000000, "correo@dominio.com"));
        
        academica.getNota().pedirDatos();
        
        System.out.println(academica.toString());  
        System.out.println(academica.getNota().calcNotaFinal());
    }
    
}
