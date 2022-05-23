/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author yanyg
 */
public class Fresa extends Frutas_Verduras implements Fruta {

    public Fresa(String nombre, float peso, int calorias, String forma, String tamaño, String color) {
        super(nombre, peso, calorias, forma, tamaño, color);
    }

    @Override
    public boolean madurar() {
        JOptionPane.showMessageDialog(null, "Madurando");
        return true;
    }

    @Override
    public int crecer() {
        JOptionPane.showMessageDialog(null, "Creciendo");
        return (10);
    }

    @Override
    public String tipoCascara() {
        JOptionPane.showMessageDialog(null, "Sin cáscara");
        return "Sin Cáscara";
    }

}
