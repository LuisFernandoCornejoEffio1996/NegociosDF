/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package com.fernandoce.negociosdf.formularios.usuarios;

/**
 *
 * @author lfern
 */
public class formUsuarios extends javax.swing.JPanel {

    /** Creates new form formUsuarios */
    public formUsuarios() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTblUsuarios = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollTblUsuarios.setViewportView(tblUsuarios);

        add(scrollTblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1050, 440));

        btnNuevo.setText("NUEVO");
        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnNuevo;
    public javax.swing.JScrollPane scrollTblUsuarios;
    public javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables

}