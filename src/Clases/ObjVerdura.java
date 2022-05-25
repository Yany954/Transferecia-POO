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
public class ObjVerdura extends Frutas_Verduras implements GrupoA {

    public ObjVerdura(String nombre, float peso, int calorias, String forma, String tamaño, String color) {
        super(nombre, peso, calorias, forma, tamaño, color);
    }

    
    @Override
    public int crecer() {
        JOptionPane.showMessageDialog(null, "Creciendo");
        return (10);
    }

    @Override
    public boolean madurar() {
        JOptionPane.showMessageDialog(null, "Madurando");
        return true;
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
    public String tipoSuperficie() {
        JOptionPane.showMessageDialog(null, "Cáscara");
        return "cascara";
    }

    @Override
    public boolean listoParaConsumo() {
        boolean consumir=true;
        JOptionPane.showMessageDialog(null, "Listo para consumo: " + consumir);
        return consumir;
    }
    
}
