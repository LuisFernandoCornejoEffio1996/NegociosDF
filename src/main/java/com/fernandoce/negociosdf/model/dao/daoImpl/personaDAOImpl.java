/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandoce.negociosdf.model.dao.daoImpl;

import com.fernandoce.negociosdf.config.conexion;
import com.fernandoce.negociosdf.model.dao.crudDAO;
import com.fernandoce.negociosdf.model.entidades.persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author lfern
 */
public class personaDAOImpl implements crudDAO<persona> {

    Connection conn = null;
    PreparedStatement pst;
    ResultSet rs;
    persona persona = null;

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insertar(persona objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int modificar(persona objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminar(int idObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public persona obtenerObjetoPorId(int idObjeto) {
        conn = conexion.getConectar();
        try {
            String sql = "SELECT * FROM vista_usuarios WHERE idPersona = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idObjeto);
            rs = pst.executeQuery();
            persona = new persona();
            while (rs.next()) {
                
            }
        } catch (SQLException e) {
        } finally {
        }

        return persona;
    }

}
