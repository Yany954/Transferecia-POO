/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Yany Gonzalez & Sebastian Pineda
 */
public abstract class Frutas_Verduras extends Alimento {

    public String forma = "";
    public String tamaño = "";
    public String color = "";

    public Frutas_Verduras(String nombre, float peso, int calorias, String forma, String tamaño, String color) {
        super(nombre, peso, calorias);
        this.forma = forma;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public abstract boolean madurar();

    public abstract int crecer();
    
}
