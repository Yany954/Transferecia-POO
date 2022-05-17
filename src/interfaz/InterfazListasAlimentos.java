/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.Manzana;
import java.util.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author yanyg
 */
public class InterfazListasAlimentos extends javax.swing.JFrame {

    /**
     * Creates new form InterfazListasAlimentos
     */
    public InterfazListasAlimentos() {
        initComponents();
        pintarImagen(lblFondo,"C:\\Users\\yanyg\\OneDrive\\Documentos\\NetBeansProjects\\POO-Transferencia\\src\\imagenes\\fondoDesk.jpg");
    }
    public ImageIcon imagen;
    public Icon icono;
    
    public void pintarImagen(JLabel label, String ruta){
        imagen=new ImageIcon(ruta);
        icono=new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(), 
                label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(this.icono);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        cmbcategoria = new javax.swing.JComboBox<>();
        cmbObjeto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAñadir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEditar1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lista.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jScrollPane1.setViewportView(lista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 28, 140, 240));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cmbcategoria.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        cmbcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Fruta", "Verdura", "Grasa", "Hidratos de Carbono", " " }));

        cmbObjeto.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        cmbObjeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Manzana", "Aguacate", "Uva", "Tomate", "Aceite", "Queso", "Chocolate", "Pescado", "Papa", "Pasta", "Pan", " ", " " }));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        jLabel2.setText("CATEGORIA");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        jLabel3.setText("ALIMENTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 120));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnAñadir.setBackground(new java.awt.Color(255, 153, 51));
        btnAñadir.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(51, 51, 51));
        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        jLabel1.setText("SELECCIONE: ");

        btnEditar1.setBackground(new java.awt.Color(255, 153, 51));
        btnEditar1.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        btnEditar1.setForeground(new java.awt.Color(51, 51, 51));
        btnEditar1.setText("Editar");

        btnEliminar.setBackground(new java.awt.Color(255, 153, 51));
        btnEliminar.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(51, 51, 51));
        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAñadir)
                    .addComponent(btnEditar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 190, 100));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
       String frutas[]={"Manzana","Uva"};
       String verduras[]={"Aguacate","Tomate"};
       String grasa[]={"Aceite","Queso","Chocolate","Pescado"};
       String Carbohidratos[]={"Papa","Pasta","Pan"};
        if(cmbcategoria.equals("Fruta")){
            for (int i = 0; i < frutas.length; i++) {
                if(!cmbObjeto.equals(frutas[i])){
                    JOptionPane.showMessageDialog(rootPane, "El alimento seleccionado no es una fruta");
                }
                else{
                    //listaAlimentos.setModel(model);
                    //model.addElement(new Manzana());
                }
            }
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazListasAlimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazListasAlimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazListasAlimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazListasAlimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazListasAlimentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbObjeto;
    private javax.swing.JComboBox<String> cmbcategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JList<String> lista;
    // End of variables declaration//GEN-END:variables
}