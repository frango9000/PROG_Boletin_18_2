/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fran.app;

import com.fran.data.*;
import java.util.Scanner;
/**
 *
 * @author fsancheztemprano
 */
public class Academica {
    private static int numReferencia =2018;
    
    private int matricula;
    private String nombre;
    private float nota;
    private Personal personal;

    public Academica(String nombre, Personal personal) {
        this.nombre = nombre;
        this.personal = personal;
        this.matricula = numReferencia;
        numReferencia++;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    public float calcularNota() {
        return getNota();
    }

    public Personal getPersonal() {
        return personal;
    }
    
    public float pedirNota(){
        Scanner scan = new Scanner(System.in);
        float fl;
        do{
            System.out.println("Introduce Nota (0,10) :");
            fl=scan.nextFloat();
        }while(!verificarNota(fl));
        return fl;
    }
    public boolean verificarNota(float nota){
        return !(nota > 10 || nota < 0);
    }

    public void setNota(float nota) {
            this.nota = nota;
    }

    @Override
    public String toString() {
        return "Academica{" + "matricula=" + matricula + ", nombre=" + nombre + ", nota=" + nota + ", correo=" + personal.getCorreo() + ", telefono=" + personal.getTelefono() + '}';
    }
    
    
}
