/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandoce.negociosdf.controllers;

import com.fernandoce.negociosdf.formularios.formLogin;
import com.fernandoce.negociosdf.formularios.formPrincipal;
import com.fernandoce.negociosdf.model.dao.daoImpl.loginDAOImpl;
import com.fernandoce.negociosdf.model.entidades.usuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author lfern
 */
public class controlLogin extends formLogin implements MouseListener, KeyListener {

    controlBotones ctrlBotones;
    controlValidaciones ctrlValidaciones;
    controlLabel ctrlLabel;
    loginDAOImpl loginDAOImpl;
    formPrincipal formPrincipal;
    controlPrincipal ctrlPrincipal;
    public controlLogin() {
        iniciar();
    }

    private void iniciar() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setSize(650, 450);

        this.btnCancelar.addMouseListener(this);
        this.btnIngresar.addMouseListener(this);

        this.txtUser.addKeyListener(this);
        this.txtPass.addKeyListener(this);

        setImgLbl(this.lblIconNegocio, "src/main/resources/images/iconVent.png");
        btns();

    }

    private void btns() {
        setImgBtn(btnIngresar, "src/main/resources/images/iconAcceso.png");
        setImgBtn(btnCancelar, "src/main/resources/images/cerrar-sesion.png");

    }

    private void setImgLbl(JLabel jLabel, String root) {
        ctrlLabel = new controlLabel();
        int ancho = jLabel.getWidth();
        int alto = jLabel.getHeight();
        ctrlLabel.mostrarImgLbl(jLabel, root, ancho, alto);
    }

    private void setImgBtn(JButton button, String root) {
        ctrlBotones = new controlBotones();
        int ancho = 25;
        int alto = 25;
        ctrlBotones.iconoBtn(button, root, ancho, alto);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == btnCancelar) {
            System.exit(0);
        }
        
        if (e.getSource() == btnIngresar) {
            if (txtUser.getText().equals("") || String.valueOf(txtPass.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(this, "Estimado usuario los campos usuario y contraseña son obligatorios", "Validación de Campos", JOptionPane.INFORMATION_MESSAGE);
            } else {                
                if (login().getIdUsuario() > 0) {
                    usuario usuario = login();
                    if(usuario.getPersonaId().getEstado().equals("Activo") && loginDAOImpl.ultimoAcceso(usuario.getIdUsuario()) == true){
                        this.dispose();
                        JOptionPane.showMessageDialog(rootPane, "Bienvenido al sistema " + usuario.getNomCompleto(), "Acceso al sistema", JOptionPane.PLAIN_MESSAGE);
                        ctrlPrincipal = new controlPrincipal(usuario.getPersonaId().getCargoId().getIdCargo(), usuario.getPersonaId().getIdPersona()); 
                    }else{
                        JOptionPane.showMessageDialog(this, "El usuario se encuentra inactivo\nPor favor contactar al administrador del sistema", "Acceso al Sistema", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Las credenciales ingresadas son incorrectas o no se encuentra registrado", "Acceso Denegado", JOptionPane.ERROR_MESSAGE);
                }
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
        ctrlBotones = new controlBotones();
        if (e.getSource() == btnIngresar) {
            ctrlBotones.efectoOver(btnIngresar, new Color(56, 117, 238), Color.white);
        } 
        if (e.getSource() == btnCancelar) {
            ctrlBotones.efectoOver(btnCancelar, new Color(238, 56, 56), Color.white);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == btnIngresar) {
            ctrlBotones.efectoOver(btnIngresar, new Color(0, 0, 255), Color.white);
        } 
        if (e.getSource() == btnCancelar) {
            ctrlBotones.efectoOver(btnCancelar, new Color(255, 0, 0), Color.white);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        ctrlValidaciones = new controlValidaciones();
        int key = e.getKeyChar();
        if (e.getSource() == txtUser) {
            if(ctrlValidaciones.ingresarLetras(key) == false && ctrlValidaciones.ingresarNumeros(key) == false){
                e.consume();
                JOptionPane.showMessageDialog(rootPane, "Solo se permiten letras", "Validación", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(e.getSource() == txtPass){
            if(ctrlValidaciones.ingresarCaracteresEspeciales(key) == false && ctrlValidaciones.ingresarLetrasSinNcontilde(key) == false && ctrlValidaciones.ingresarNumeros(key) == false){
                e.consume();
                JOptionPane.showMessageDialog(rootPane, "Caracter ingresado no permitido\nCaracteres Permitidos: \nLetras\nNumeros\n! # $ & * + - . / @ _ |", "Validación", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
    
    private usuario login() {
        loginDAOImpl = new loginDAOImpl();
        String username = this.txtUser.getText();
        String password = String.valueOf(txtPass.getPassword());
        usuario usuario = loginDAOImpl.login(username, password);
        return usuario;
    }
    
}
