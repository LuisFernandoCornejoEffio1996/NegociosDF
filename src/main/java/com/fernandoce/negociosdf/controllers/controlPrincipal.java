/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandoce.negociosdf.controllers;

import com.fernandoce.negociosdf.formularios.formCategorias;
import com.fernandoce.negociosdf.formularios.formInicio;
import com.fernandoce.negociosdf.formularios.formPrincipal;
import com.fernandoce.negociosdf.formularios.formConfiguracion;
import com.fernandoce.negociosdf.formularios.usuarios.formUsuarios;
import com.fernandoce.negociosdf.formularios.menu.menuAdmin;
import com.fernandoce.negociosdf.formularios.usuarios.nuevoUsuario;
import com.fernandoce.negociosdf.model.dao.daoImpl.loginDAOImpl;
import com.fernandoce.negociosdf.model.entidades.usuario;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author lfern
 */
public class controlPrincipal extends formPrincipal implements MouseListener {

    loginDAOImpl loginDAOImpl;
    controlPaneles ctrlPaneles;
    controlLabel ctrlLabel;
    menuAdmin menuAdmin;
    formConfiguracion formConfiguracion;
    formInicio formInicio;
    controlUsuarios ctrlUsuarios;
    formUsuarios formUsuarios;
    nuevoUsuario nU;
    usuario user;

    public controlPrincipal(int CargoId, int personaId) {
        iniciar(CargoId, personaId);
    }

    private void iniciar(int CargoId, int personaId) {
        setVisible(true);
        setLocationRelativeTo(null);
        this.setSize(1400, 800);
        ctrlPaneles = new controlPaneles();
        ctrlLabel = new controlLabel();
        menuAdmin = new menuAdmin();
        loginDAOImpl = new loginDAOImpl();
        formUsuarios = new formUsuarios();
        user = loginDAOImpl.Datos(personaId);
        this.txtuser.setText(user.getNomCompleto());
        this.txtCargo.setText(user.getPersonaId().getCargoId().getNombre());
        switch (CargoId) {
            case 1:
                formInicio = new formInicio();
                ctrlPaneles.showPanel(panelMenu, menuAdmin, 250, 630);
                ctrlPaneles.showPanel(panelContenido, formInicio, 1120, 670);
                break;
            case 2:
//                menuOffClick();
//                extras.showPanel(panelMenu, menuVendedor, 250, 630);
//                eventBtnsMenu();
                break;
            case 3:
//                extras.showPanel(panelMenu, menuAlmacen, 250, 630);
                break;
        }
        menuAdmin.btnInicio.addMouseListener(this);
        menuAdmin.btnUsuarios.addMouseListener(this);
        menuAdmin.btnCerrarSesion.addMouseListener(this);
        formUsuarios.btnNuevo.addMouseListener(this);
        
        icon();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == menuAdmin.btnInicio) {
            formInicio = new formInicio();
            System.out.println("Panel Inicio");
            ctrlPaneles.showPanel(panelContenido, formInicio, 1120, 670);
        }

        if (e.getSource() == menuAdmin.btnUsuarios) {
            formConfiguracion = new formConfiguracion();

            formCategorias formCategorias = new formCategorias();

            System.out.println("Panel Usuarios");
            ctrlPaneles.showPanel(panelContenido, formConfiguracion, 1120, 670);
            formConfiguracion.tpConfiguracion.removeAll();
            formConfiguracion.tpConfiguracion.addTab("Usuarios", formUsuarios);
            ctrlUsuarios = new controlUsuarios();
            ctrlUsuarios.Listar(formUsuarios.tblUsuarios, formUsuarios.scrollTblUsuarios);
            formConfiguracion.tpConfiguracion.addTab("Categorias", formCategorias);
            formConfiguracion.tpConfiguracion.setSelectedIndex(0);
            formConfiguracion.tpConfiguracion.updateUI();

        }

        if (e.getSource() == menuAdmin.btnCerrarSesion) {
            System.out.println("Cerrar Sesion");
            cerrar_Sesion();
        }

        if (e.getSource() == formUsuarios.btnNuevo) {
            ctrlUsuarios.btnNuevo();
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
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    private void icon() {
        ctrlLabel.mostrarImgLbl(this.lblIcon, "src/main/resources/images/iconVent.png", lblIcon.getWidth(), lblIcon.getHeight());
        ctrlLabel.mostrarImgLbl(menuAdmin.iconInicio, "src/main/resources/images/home.png", 40, 40);
        ctrlLabel.mostrarImgLbl(menuAdmin.iconCerrarSesion, "src/main/resources/images/salida.png", 40, 40);
    }

    private void cerrar_Sesion() {
        controlLogin ctrlLogin = new controlLogin();
        ctrlLogin.setVisible(true);
        this.dispose();
    }

}
