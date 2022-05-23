/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author yanyg
 */
public abstract class Grasa extends Alimento {

    public String tipoDeGrasa = "";

    public Grasa(String nombre, float peso, int calorias, String tipoDeGrasa) {
        super(nombre, peso, calorias);
        this.tipoDeGrasa = tipoDeGrasa;
    }

    public String getTipoDeGrasa() {
        return tipoDeGrasa;
    }

    public void setTipoDeGrasa(String tipoDeGrasa) {
        this.tipoDeGrasa = tipoDeGrasa;
    }
 
    
    public abstract boolean reservarEnergia();

    public abstract boolean insolubilidad();

    public abstract boolean fundirseAlCalor();

}
