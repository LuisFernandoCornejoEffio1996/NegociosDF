/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandoce.negociosdf.controllers;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author lfern
 */
public class controlGral {
    public void mostrarImgLbl(JLabel jLabel, String ruta, int ancho, int alto){
        ImageIcon img = new ImageIcon(ruta);
        Icon icon = new ImageIcon(img.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        jLabel.setIcon(icon);
    }
    
    public void mostrarImgBtn(JButton jButton, String ruta, int ancho, int alto){
        ImageIcon img = new ImageIcon(ruta);
        Icon icon = new ImageIcon(img.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        jButton.setIcon(icon);
    }
    
    public void efectoOver(JButton jButton, Color background, Color foreground){
        jButton.setBackground(background);
        jButton.setForeground(foreground);
    }
}
