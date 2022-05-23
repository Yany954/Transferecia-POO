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
public abstract class Hidratos_de_carbono extends Alimento {
    public String tipoDeCarboHidrato="";

    public Hidratos_de_carbono(String nombre, float peso, int calorias, String tipoDeCarboHidrato) {
        super(nombre, peso, calorias);
        this.tipoDeCarboHidrato=tipoDeCarboHidrato;
    }

    public String getTipoDeCarboHidrato() {
        return tipoDeCarboHidrato;
    }

    public void setTipoDeCarboHidrato(String tipoDeCarboHidrato) {
        this.tipoDeCarboHidrato = tipoDeCarboHidrato;
    }
        
    public abstract boolean aportarEnergia();
    
}
