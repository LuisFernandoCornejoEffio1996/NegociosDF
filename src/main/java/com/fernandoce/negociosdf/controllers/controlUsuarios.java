/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandoce.negociosdf.controllers;

import com.fernandoce.negociosdf.formularios.formPrincipal;
import com.fernandoce.negociosdf.formularios.usuarios.formUsuarios;
import com.fernandoce.negociosdf.formularios.usuarios.nuevoUsuario;
import com.fernandoce.negociosdf.model.dao.daoImpl.loginDAOImpl;
import com.fernandoce.negociosdf.model.entidades.usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author lfern
 */
public class controlUsuarios implements ActionListener{

    controlTabla ctrlTabla = new controlTabla();
    formPrincipal fP;
    formUsuarios fU;
    nuevoUsuario nU;
    
    
    
    public void Listar(JTable tbl, JScrollPane scroll) {
        String titulos[] = {"N°", "Nombre Completo", "Tipo Doc.", "Numumero Doc.", "Cargo", "Telefono", "Dirección", "Usuario", "Ultimo Acceso", "Estado"};
        String informacion[][] = listaUsuarios();
        ctrlTabla.tablaCategoria(tbl, scroll, titulos, informacion);
    }

    private String[][] listaUsuarios() {
        loginDAOImpl loginDAOImp = new loginDAOImpl();
        List<usuario> lista = loginDAOImp.lista();
        String matrizInfo[][] = new String[lista.size()][10];
        for (int i = 0; i < lista.size(); i++) {
            matrizInfo[i][0] = String.valueOf(i + 1);
            matrizInfo[i][1] = lista.get(i).getNomCompleto();
            matrizInfo[i][2] = lista.get(i).getPersonaId().getTipo_docID().getSigla();
            matrizInfo[i][3] = lista.get(i).getPersonaId().getNum_doc();
            matrizInfo[i][4] = lista.get(i).getPersonaId().getCargoId().getNombre();
            matrizInfo[i][5] = lista.get(i).getPersonaId().getTelefono();
            matrizInfo[i][6] = lista.get(i).getPersonaId().getDireccion();
            matrizInfo[i][7] = lista.get(i).getUsuario();
            matrizInfo[i][8] = lista.get(i).getUltimo_acceso();
            matrizInfo[i][9] = lista.get(i).getPersonaId().getEstado();
        }
        return matrizInfo;
    }
    
    public void btnNuevo(){
        fP = new formPrincipal();
        nU = new nuevoUsuario(fP, true);
        nU.setSize(500,400);
        nU.setLocationRelativeTo(null);
        nU.setTitle("NUEVO USUARIO");
        nU.setResizable(false);
        nU.btnGuardar.addActionListener(this);
        nU.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == nU.btnGuardar){
            JOptionPane.showMessageDialog(fP, "Hoa Btn Guardar");
        }
    }
    
    
}
