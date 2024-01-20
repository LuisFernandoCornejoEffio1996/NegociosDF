/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandoce.negociosdf.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lfern
 */
public class conexion {
    private static Connection cn;
    private static final Properties Setting = new Properties();
    private static InputStream openFileSource = null;
    private static String Usuario;
    private static String Pasword;
    private static String Driver;
    private static String Url;
    public String Query;
    public ResultSet rs;
    public PreparedStatement pst;

    public static Connection getConectar() {
        try {
            openFileSource = new FileInputStream("src/main/java/com/fernandoce/negociosdf/config/Setting.properties");
            Setting.load(openFileSource);
            Usuario = Setting.getProperty("USUARIO");
            Pasword = Setting.getProperty("PASSWORD");
            Driver = Setting.getProperty("DRIVER_CLASS");
            Url = Setting.getProperty("URL");
            Class.forName(Driver);
            cn = DriverManager.getConnection(Url, Usuario, Pasword);

        } catch (IOException | ClassNotFoundException | SQLException e) {
            String[] options = { "Acceptar"};
            int conectar = JOptionPane.showOptionDialog(null, "Error al conectar con la base de datos\n\nPor favor contactar a soporte tecnico\n\n"+e,"Conexion con Base de Datos",JOptionPane.ERROR_MESSAGE,0, null, options, options[0]);
            if (conectar >= 0) {
                System.exit(0);
            }
        }    
        return cn;
    }
    
    public void Desconectar() {
        try {
            cn.close();           
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexion: "+ex);
        }
    }

    public PreparedStatement Pst(String sql) {
        try {
            pst = getConectar().prepareStatement(sql);
            return pst;
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet Rs(PreparedStatement pst) {
        try {
            rs = pst.executeQuery();
            return rs;
        } catch (SQLException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        conexion con = new conexion();
        if (con.getConectar()!= null) {
            System.out.println("conectado ");
            con.Desconectar();
        }
    }
}
