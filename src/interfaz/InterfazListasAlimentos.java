/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.Alimento;
import Clases.ObjFruta;
import Clases.ObjetoVerdura;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

/**
 *
 * @author yanyg
 */
public class InterfazListasAlimentos extends javax.swing.JFrame {

    DefaultListModel fillList = new DefaultListModel();
    ArrayList <ObjFruta> listaFrutas = new ArrayList<>();
    ArrayList <ObjetoVerdura> listaVerduras = new ArrayList<>();
    //ArrayList <Uva> listaUvas = new ArrayList<>();
    int error=0;
    String nombreItem="";
    /**
     * Creates new form InterfazListasAlimentos
     */
    public InterfazListasAlimentos() {
        initComponents();
        pintarImagen(lblFondo, "C:\\Users\\nelly\\OneDrive\\Documentos\\NetBeansProjects\\Transferecia-POO\\src\\imagenes\\fondoDesk.jpg");
        jLista.setModel(fillList);

    }
    public ImageIcon imagen;
    public Icon icono;

    public void pintarImagen(JLabel label, String ruta) {
        imagen = new ImageIcon(ruta);
        icono = new ImageIcon(imagen.getImage().getScaledInstance(label.getWidth(),
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
        jLista = new javax.swing.JList<>();
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
        jBtnVerAtb = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAtributos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLista.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jScrollPane1.setViewportView(jLista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 140, 240));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cmbcategoria.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        cmbcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Fruta", "Verdura", "Grasa", "Hidratos de Carbono", " " }));
        cmbcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcategoriaActionPerformed(evt);
            }
        });

        cmbObjeto.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        cmbObjeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Manzana", "Aguacate", "Uva", "Fresa", "Tomate", "Zanahoria", "Acelga", "Berenjena", "Aceite", "Queso", "Chocolate", "Pescado", "Papa", "Pasta", "Pan", "Yuca" }));
        cmbObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbObjetoActionPerformed(evt);
            }
        });

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
                .addContainerGap(16, Short.MAX_VALUE))
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
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 153, 51));
        btnEliminar.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(51, 51, 51));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jBtnVerAtb.setText("Ver atributos");
        jBtnVerAtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerAtbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnVerAtb)))
                .addContainerGap())
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar1)
                    .addComponent(btnAñadir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(jBtnVerAtb))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 190, 100));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 300));

        txtAtributos.setEditable(false);
        txtAtributos.setColumns(20);
        txtAtributos.setRows(5);
        jScrollPane2.setViewportView(txtAtributos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 200, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        if(!cmbObjeto.getSelectedItem().equals("Seleccione...")&&!cmbcategoria.getSelectedItem().equals("Seleccione...")){
            if(verificar()){
                llenarAtributos();
                if(error!=-1){
                    fillList.addElement(nombreItem);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane,"El elemento "+cmbObjeto.getSelectedItem().toString() + " no es  " + cmbcategoria.getSelectedItem().toString());
            } 
        } else{
            JOptionPane.showMessageDialog(rootPane, "Seleccione una categoria");
        }
        //llenarAtributos();
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void cmbcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcategoriaActionPerformed

    private void cmbObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbObjetoActionPerformed

    }//GEN-LAST:event_cmbObjetoActionPerformed

    /**/

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            if(jLista.getSelectedIndex()==-1){
                JOptionPane.showMessageDialog(rootPane,"No ha seleccionado ningun item");
            } else{
                if (fillList.isEmpty() == false) {
                    fillList.removeElementAt(jLista.getSelectedIndex());
                } else {
                    JOptionPane.showMessageDialog(rootPane, "La lista está vacía");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        try {
            if(jLista.getSelectedIndex()!=-1){
                if (fillList.isEmpty() == false) {
                    fillList.insertElementAt(cmbObjeto.getSelectedItem(), jLista.getSelectedIndex());
                } else {
                    JOptionPane.showMessageDialog(rootPane, "La lista está vacía");
                }
            } else{
                JOptionPane.showMessageDialog(rootPane, "No ha seleccionado ningun item");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnEditar1ActionPerformed

    private void jBtnVerAtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerAtbActionPerformed
        mostrarAtributos();
    }//GEN-LAST:event_jBtnVerAtbActionPerformed

    /*
    public String[] food(String categoria) {
        String[] alimentis = new String[4];
        switch (categoria) {
            case "Fruta":
                alimentis[0] = "Manzana";
                alimentis[1] = "Aguacate";
                alimentis[2] = "Uva";
                alimentis[3] = "Fresa";
                break;
            case "Verdura":
                alimentis[0] = "Tomate";
                alimentis[1] = "Zanahoria";
                alimentis[2] = "Acelga";
                alimentis[3] = "Berenjena";
                break;
            case "Grasa":
                alimentis[0] = "Aceite";
                alimentis[1] = "Queso";
                alimentis[2] = "Chocolate";
                alimentis[3] = "Pescado";
                break;
            case "Hidratos de Carbono":
                alimentis[0] = "Papa";
                alimentis[1] = "Pasta";
                alimentis[2] = "Pan";
                alimentis[3] = "Yuca";
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "Opción Invalida");
                break;
        }
        return alimentis;
    }
     */
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
    
    
    public boolean verificar() {
        //JOptionPane.showInputDialog(imagen);
        try {
            
            switch (cmbObjeto.getSelectedItem().toString()) {
                case "Manzana":
                case "Aguacate":
                case "Uva":
                case "Fresa":
                    if (!cmbcategoria.getSelectedItem().toString().equals("Fruta")) {
                        return false;
                    } else {
                        return true;
                    }
                case "Tomate":
                case "Zanahoria":
                case "Acelga":
                case "Berenjena":
                    if (!cmbcategoria.getSelectedItem().toString().equals("Verdura")) {
                        return false;
                    } else {
                        return true;
                    }
                case "Aceite":
                case "Queso":
                case "Pescado":
                case "Chocolate":
                    if (!cmbcategoria.getSelectedItem().toString().equals("Grasa")) {
                        return false;
                    } else {
                        return true;
                    }   
                case "Papa":
                case "Pasta":
                case "Pan":
                case "Yuca":
                    if (!cmbcategoria.getSelectedItem().toString().equals("Hidratos de Carbono")) {
                        return false;
                    } else {
                        return true;
                    }  
                default:
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        return false;
    }
    
    public void llenarAtributos(){
        error=0;
        //String nombreItem="";
        try{
            if (cmbcategoria.getSelectedItem().toString().equals("Fruta")||cmbcategoria.getSelectedItem().toString().equals("Verdura")){
                //para que pida los dato de atributos y no tener que repetir las siguientes lineas despues
                String nombre=JOptionPane.showInputDialog(rootPane, "Nombre: ");
                float peso=Float.parseFloat(JOptionPane.showInputDialog(rootPane, "Peso: "));
                int calorias=Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Calorias: "));
                String forma=JOptionPane.showInputDialog(rootPane, "Forma: ");
                String tamaño=JOptionPane.showInputDialog(rootPane, "Tamaño ");
                String color=JOptionPane.showInputDialog(rootPane, "Color: ");
                
                switch (cmbObjeto.getSelectedItem().toString()) {
                    case "Manzana":
                        //JOptionPane.showMessageDialog(rootPane, "Enrtesss");
                        ObjFruta manzana = new ObjFruta(nombre, peso, calorias, forma, tamaño, color);
                        manzana.crecer();
                        nombreItem="Manzana - "+manzana.getNombre();
                        //return nombreItem;
                    case "Uva":
                        ObjFruta Uva = new ObjFruta(nombre, peso, calorias, forma, tamaño, color);
                        listaFrutas.add(Uva);
                        nombreItem="Uva - "+Uva.getNombre();
                        //return nombreItem;
                    case "Aguacate":
                        ObjFruta Aguacate = new ObjFruta(nombre, peso, calorias, forma, tamaño, color);
                        listaFrutas.add(Aguacate);
                        nombreItem="Aguacate - "+Aguacate.getNombre();
                        //return nombreItem;
                    case "Fresa":
                        ObjFruta Fresa = new ObjFruta(nombre, peso, calorias, forma, tamaño, color);
                        listaFrutas.add(Fresa);
                        nombreItem="Fresa - "+Fresa.getNombre();
                        //return nombreItem;
                    default:
                        break;
                }
                if (cmbcategoria.getSelectedItem().toString().equals("Verdura")){
                    switch (cmbObjeto.getSelectedItem().toString()) {
                        case "Tomate":
                            ObjetoVerdura Tomate = new ObjetoVerdura(nombre, peso, calorias, forma, tamaño, color);
                            listaVerduras.add(Tomate);
                            nombreItem="Tomate - "+Tomate.getNombre();
                            //return nombreItem;
                        case "Zanahoria":
                            ObjetoVerdura Zanahoria = new ObjetoVerdura(nombre, peso, calorias, forma, tamaño, color);
                            listaVerduras.add(Zanahoria);
                            nombreItem="Zanahoria - "+Zanahoria.getNombre();
                            //return nombreItem;
                        case "Berenjena":
                            ObjetoVerdura Berenjena = new ObjetoVerdura(nombre, peso, calorias, forma, tamaño, color);
                            listaVerduras.add(Berenjena);
                            nombreItem="Berenjena - "+Berenjena.getNombre();
                            //return nombreItem;
                        case "Acelga":
                            ObjetoVerdura Acelga = new ObjetoVerdura(nombre, peso, calorias, forma, tamaño, color);
                            listaVerduras.add(Acelga);
                            nombreItem="Acelga - "+Acelga.getNombre();
                            //return nombreItem;
                        default:
                            break;
                    }
                }
            }
            
        } catch (Exception e) {
            error=-1;
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    
    public void mostrarAtributos(){
        String texto="";
        try{
            //JOptionPane.showMessageDialog(rootPane, "Hola");
            if(jLista.getSelectedIndex()==-1){
                JOptionPane.showMessageDialog(rootPane,"No ha seleccionado ningun item");
            } else{
                //JOptionPane.showMessageDialog(rootPane, "Entre");
                //Muestro los mismos atributos y comportamientos de las frutas
                //con este if controlo que tipo de alimento es
                if (jLista.getSelectedValue().contains("Manzana")||jLista.getSelectedValue().contains("Uva")||
                        jLista.getSelectedValue().contains("Aguacate")||jLista.getSelectedValue().contains("Fresa")){
                    //JOptionPane.showMessageDialog(rootPane, "Veo");
                    for(int i=0; i<listaFrutas.size(); i++){
                        JOptionPane.showMessageDialog(rootPane, "For...");
                        JOptionPane.showMessageDialog(rootPane, listaFrutas.get(i).getNombre());
                        if (jLista.getSelectedValue().contains(listaFrutas.get(i).getNombre())){
                            JOptionPane.showMessageDialog(rootPane, "If...");
                            texto=listaFrutas.get(i).getNombre().toUpperCase()+"\nATRIBUTOS: "+
                               "\nPeso: "+String.valueOf(listaFrutas.get(i).getPeso())+
                               "\nCalorias: "+String.valueOf(listaFrutas.get(i).getCalorias())+
                               "\nForma:"+listaFrutas.get(i).getForma()+
                               "\nTamaño: "+listaFrutas.get(i).getTamaño()+
                               "\nColor: "+listaFrutas.get(i).getColor()+"\nCOMPORTAMIENTOS: "
                                    + "\nMadurar()\nCrecer()\ntipoCascara()";
                            txtAtributos.setText(texto);
                        }
                    }
                }
                else if (jLista.getSelectedValue().contains("Tomate")||jLista.getSelectedValue().contains("Zanahoria")||
                        jLista.getSelectedValue().contains("Acelga")||jLista.getSelectedValue().contains("Berenjena")){
                    //JOptionPane.showMessageDialog(rootPane, "Veo");
                    for(int i=0; i<listaVerduras.size(); i++){
                        //JOptionPane.showMessageDialog(rootPane, "For...");
                        if (jLista.getSelectedValue().contains(listaVerduras.get(i).getNombre())){
                            //JOptionPane.showMessageDialog(rootPane, "If...");
                            texto=listaVerduras.get(i).getNombre().toUpperCase()+"\nATRIBUTOS: "+
                               "\nPeso: "+String.valueOf(listaVerduras.get(i).getPeso())+
                               "\nCalorias: "+String.valueOf(listaVerduras.get(i).getCalorias())+
                               "\nForma:"+listaVerduras.get(i).getForma()+
                               "\nTamaño: "+listaVerduras.get(i).getTamaño()+
                               "\nColor: "+listaVerduras.get(i).getColor()+"\nCOMPORTAMIENTOS: "
                                    + "\nMadurar()\nCrecer()\ntipoVegetal()";
                            txtAtributos.setText(texto);
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "No veo");
                } 
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbObjeto;
    private javax.swing.JComboBox<String> cmbcategoria;
    private javax.swing.JButton jBtnVerAtb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jLista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextArea txtAtributos;
    // End of variables declaration//GEN-END:variables
}
