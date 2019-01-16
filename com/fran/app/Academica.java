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

    private static int numReferencia = 2018;

    private int matricula;
    private String nombre;
    private Notas notas;
    private Personal personal;

    public Academica(String nombre,Notas notas, Personal personal) {
        this.nombre = nombre;
        this.personal = personal;
        this.matricula = numReferencia;
        this.notas = notas;
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

    public Notas getNota() {
        return notas;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setNota(Notas notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Academica{" + "matricula=" + matricula + ", nombre=" + nombre + ", notas=" + notas + ", personal=" + personal + '}';
    }
}
