/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandoce.negociosdf.controllers;

import com.fernandoce.negociosdf.formularios.formLogin;
import com.fernandoce.negociosdf.model.dao.daoImpl.loginDAOImpl;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author lfern
 */
public class controlLogin extends formLogin implements MouseListener {

    controlGral ctrlGral = new controlGral();
    loginDAOImpl loginDAOImpl = new loginDAOImpl();

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
    
    private int login(){
        String username = this.txtUser.getText();
        System.out.println("username "+username);
        String password = String.valueOf(txtPass.getPassword());
        System.out.println("password "+password);
        return loginDAOImpl.login(username, password);
    }
    
    

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == btnCancelar) {
            System.exit(0);
        }else if(e.getSource() == btnIngresar){
            if (login() > 0) {
                JOptionPane.showMessageDialog(rootPane, "Bienvenido Usuario "+txtUser.getText(), "Acceso", JOptionPane.DEFAULT_OPTION);
            }else{
                JOptionPane.showMessageDialog(rootPane,"Las credenciales de "+txtUser.getText()+" son incorrectas o no se encuentra registrado", "Acceso Denegado", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

        
    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == btnIngresar){
            ctrlGral.efectoOver(btnIngresar, new Color(56, 117, 238), Color.white);
        }else if(e.getSource() == btnCancelar){
            ctrlGral.efectoOver(btnCancelar, new Color(238, 56, 56), Color.white);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == btnIngresar){
            ctrlGral.efectoOver(btnIngresar, new Color(0, 0, 255), Color.white);
        }else if(e.getSource() == btnCancelar){
            ctrlGral.efectoOver(btnCancelar, new Color(255, 0, 0), Color.white);
        }
    }

}
