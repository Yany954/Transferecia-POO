/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Yany Gonzalez & Sebastian Pineda
 */
public class ObjCarbHto extends Hidratos_de_carbono implements GrupoB {

    public ObjCarbHto(String nombre, float peso, int calorias, String tipoDeCarboHidrato) {
        super(nombre, peso, calorias, tipoDeCarboHidrato);
    }

    @Override
    public boolean aportarEnergia() {
        boolean energizar = true;
        JOptionPane.showMessageDialog(null, "Aporta energia: " + energizar);
        return energizar;
    }

    @Override
    public void nutrir() {
        JOptionPane.showMessageDialog(null, "Nutriendo");
    }

    @Override
    public void descomponerse() {
        JOptionPane.showMessageDialog(null, "Descomponiéndose");
    }

    @Override
    public String tipoEmpaque() { //input
        String empaque = "";
        JOptionPane.showMessageDialog(null, "Tipo de empaque: " + empaque);
        return empaque;
    }

    @Override
    public boolean listoParaConsumo() {// input
        boolean consumir = false;
        JOptionPane.showMessageDialog(null, "Listo para consumo: " + consumir);
        return consumir;
    }

}
