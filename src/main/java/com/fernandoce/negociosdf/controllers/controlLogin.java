/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandoce.negociosdf.controllers;

import com.fernandoce.negociosdf.formularios.formLogin;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author lfern
 */
public class controlLogin extends formLogin implements MouseListener {

    controlGral ctrlGral = new controlGral();

    public controlLogin() {
        iniciar();
    }

    private void iniciar() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(650, 400);
       
        this.btnCancelar.addMouseListener(this);
        this.btnIngresar.addMouseListener(this);
        setImgLbl(this.lblIconNegocio, "src/main/java/public/imagenes/iconVent.png");
        btns();

    }

    private void btns() {
        setImgBtn(btnIngresar, "src/main/java/public/imagenes/iconAcceso.png");
        setImgBtn(btnCancelar, "src/main/java/public/imagenes/cerrar-sesion.png");
    }

    private void setImgLbl(JLabel jLabel, String root) {
        int ancho = jLabel.getWidth();
        int alto = jLabel.getHeight();
        ctrlGral.mostrarImgLbl(jLabel, root, ancho, alto);
    }
    

    private void setImgBtn(JButton jButton, String root) {
        int ancho = 25;
        int alto = 25;
        ctrlGral.mostrarImgBtn(jButton, root, ancho, alto);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == btnCancelar) {
            System.exit(0);
        }else if(e.getSource() == btnIngresar){
            JOptionPane.showMessageDialog(this, "Hola btnIngresar");
        }
    }

    
    int x, y;
    
    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }

}
