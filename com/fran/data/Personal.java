/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fran.data;

/**
 *
 * @author fsancheztemprano
 */
public class Personal {
    private int telefono;
    private String correo;

    public Personal() {
    }

    public Personal(int telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Personal{" + "telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    
}
