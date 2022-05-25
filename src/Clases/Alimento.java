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
public abstract class Alimento {

    String nombre;
    float peso;
    int calorias;

    public Alimento(String nombre, float peso, int calorias) {
        this.nombre = nombre;
        this.peso = peso;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void nutrir() {
    }

    public void descomponerse() {
    }

}
