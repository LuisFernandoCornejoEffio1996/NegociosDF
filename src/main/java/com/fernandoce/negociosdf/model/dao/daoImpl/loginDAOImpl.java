/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandoce.negociosdf.model.dao.daoImpl;

import com.fernandoce.negociosdf.config.conexion;
import com.fernandoce.negociosdf.model.dao.loginDAO;
import com.fernandoce.negociosdf.model.entidades.persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lfern
 */
public class loginDAOImpl implements loginDAO {

    conexion cn = new conexion();
    Connection conn = null;
    PreparedStatement pst = null;
    CallableStatement cst = null;
    ResultSet rs;

    @Override
    public int login(String username, String password) {
        int idPersona = 0;
        try {
            persona persona = new persona();
            String sql = "SELECT * FROM persona WHERE username = ? AND password = ?";
            pst = cn.Pst(sql);
            pst.setString(1,username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            if (rs.next()) {
                System.out.println("Se encontro");
                persona.setIdPersona(rs.getInt("idPersona"));
                idPersona = persona.getIdPersona();
            }else{
                System.out.println("Sin encontrar");
                idPersona = persona.getIdPersona();
            }
            return idPersona;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return idPersona;
        }
    }

    public static void main(String[] args) {
        loginDAOImpl l = new loginDAOImpl();
        String user = "admin";
        String pass = "123";
        int id = l.login(user, pass);
        System.out.println("Id: "+id);
    }
}
