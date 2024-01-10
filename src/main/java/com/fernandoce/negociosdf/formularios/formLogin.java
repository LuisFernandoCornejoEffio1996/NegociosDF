/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.fernandoce.negociosdf.formularios;

import java.awt.Color;

/**
 *
 * @author lfern
 */
public class formLogin extends javax.swing.JFrame {

    /**
     * Creates new form formLogin2
     */
    public formLogin() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo1 = new com.fernandoce.negociosdf.componentesExtras.fondo();
        fondoIcono = new com.fernandoce.negociosdf.componentesExtras.fondoLeft();
        lblIconNegocio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        fondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoIcono.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        fondoIcono.add(lblIconNegocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, 150));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NEGOCIOS D&F");
        fondoIcono.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 250, 180, 50));

        fondo1.add(fondoIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 400));

        panelForm.setBackground(new java.awt.Color(255, 255, 255));
        panelForm.setOpaque(false);
        panelForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIAR SESIÓN");
        panelForm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 320, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("USUARIO:");
        panelForm.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 320, 30));

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.setBorder(null);
        txtUser.setOpaque(false);
        panelForm.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 320, 25));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        panelForm.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 165, 320, 10));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CONTRASEÑA:");
        panelForm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 320, 30));

        txtPass.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.setBorder(null);
        txtPass.setDisabledTextColor(new java.awt.Color(255, 102, 102));
        txtPass.setOpaque(false);
        panelForm.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 25));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        panelForm.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 255, 320, 10));

        btnIngresar.setBackground(new java.awt.Color(0, 0, 255));
        btnIngresar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresar.setBorderPainted(false);
        btnIngresar.setFocusPainted(false);
        btnIngresar.setIconTextGap(5);
        panelForm.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 155, 40));

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.setBorderPainted(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.setIconTextGap(5);
        panelForm.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 290, 155, 40));

        fondo1.add(panelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 400, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnIngresar;
    private com.fernandoce.negociosdf.componentesExtras.fondo fondo1;
    public com.fernandoce.negociosdf.componentesExtras.fondoLeft fondoIcono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JLabel lblIconNegocio;
    public javax.swing.JPanel panelForm;
    public javax.swing.JPasswordField txtPass;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
