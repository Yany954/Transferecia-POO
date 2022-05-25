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
public class ObjGrasa extends Grasa implements GrupoB {

    public ObjGrasa(String nombre, float peso, int calorias, String tipoDeGrasa) {
        super(nombre, peso, calorias, tipoDeGrasa);
    }

    @Override
    public boolean reservarEnergia() {
        boolean reserva = false;
        JOptionPane.showMessageDialog(null, "Reserva energías: " + reserva);
        return reserva;
    }

    @Override
    public boolean insolubilidad() {
        boolean soluble = false;
        JOptionPane.showMessageDialog(null, "Es soluble: " + soluble);
        return soluble;
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
