/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandoce.negociosdf.model.dao.daoImpl;

import com.fernandoce.negociosdf.config.conexion;
import com.fernandoce.negociosdf.model.dao.loginDAO;
import com.fernandoce.negociosdf.model.entidades.cargo;
import com.fernandoce.negociosdf.model.entidades.persona;
import com.fernandoce.negociosdf.model.entidades.tipodoc;
import com.fernandoce.negociosdf.model.entidades.usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lfern
 */
public class loginDAOImpl implements loginDAO {

    Connection conn = null;
    CallableStatement cst = null;
    PreparedStatement pst;
    ResultSet rs;
    persona persona;
    cargo cargo;
    usuario usuario;
    tipodoc tipodoc;

    @Override
    public usuario login(String username, String password) {
        conn = conexion.getConectar();
        try {
            usuario = new usuario();
            String sql = "{CALL obtenerLogin (?, ?)}";
            cst = conn.prepareCall(sql);
            cst.setString(1, username);
            cst.setString(2, password);
            rs = cst.executeQuery();
            while (rs.next()) {
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                persona = new persona();
                persona.setIdPersona(rs.getInt("idPersona"));
                persona.setEstado(rs.getString("estado"));
                cargo = new cargo();
                cargo.setIdCargo(rs.getInt("cargoId"));
                persona.setCargoId(cargo);
                usuario.setPersonaId(persona);
                usuario.setNomCompleto(rs.getString("nomCompleto"));
            }
            return usuario;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (cst != null) {
                    cst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexion: " + e);
            }
        }
    }

    @Override
    public usuario Datos(int idPersona) {
        conn = conexion.getConectar();
        try {
            String sql = "SELECT * FROM vista_usuarios WHERE idPersona = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idPersona);
            rs = pst.executeQuery();

            usuario = new usuario();
            tipodoc = new tipodoc();
            persona = new persona();
            cargo = new cargo();
            while (rs.next()) {
                usuario.setNomCompleto(rs.getString("nomCompleto"));
                tipodoc.setSigla(rs.getString("tipoDoc"));
                persona.setTipo_docID(tipodoc);
                persona.setNum_doc(rs.getString("num_Doc"));
                cargo.setNombre(rs.getString("cargo"));
                persona.setCargoId(cargo);
                persona.setTelefono(rs.getString("telefono"));
                persona.setDirección(rs.getString("direccion"));
                persona.setEstado(rs.getString("estado"));
                usuario.setPersonaId(persona);
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setUltimo_acceso(rs.getString("ultimo_acceso"));
            }
            return usuario;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (cst != null) {
                    cst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexion: " + e);
                return null;
            }
        }
    }

    public boolean ultimoAcceso(int idUsuario) {
        conn = conexion.getConectar();
        try {
            usuario = new usuario();
            String sql = "{CALL ultimoAcceso (?)}";
            cst = conn.prepareCall(sql);
            cst.setInt(1, idUsuario);
            rs = cst.executeQuery();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return false;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (cst != null) {
                    cst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexion: " + e);
            }
        }
    }

    @Override
    public List<usuario> lista() {
        List<usuario> ListaUsuarios = new ArrayList();
        usuario user;
        conn = conexion.getConectar();
        try {
            String sql = "SELECT * FROM vista_usuarios";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                user = new usuario();
                tipodoc = new tipodoc();
                cargo = new cargo();
                persona = new persona();
                user.setNomCompleto(rs.getString("nomCompleto"));
                tipodoc.setSigla(rs.getString("tipoDoc"));
                persona.setTipo_docID(tipodoc);
                persona.setNum_doc(rs.getString("num_Doc"));
                cargo.setNombre(rs.getString("cargo"));
                persona.setCargoId(cargo);
                persona.setTelefono(rs.getString("telefono"));
                persona.setDirección(rs.getString("direccion"));
                persona.setEstado(rs.getString("estado"));
                user.setPersonaId(persona);
                user.setUsuario(rs.getString("usuario"));
                user.setUltimo_acceso(rs.getString("ultimo_acceso"));
                ListaUsuarios.add(user);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (cst != null) {
                    cst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexion: " + e);
                return null;
            }
        }
        return ListaUsuarios;
    }
//
//    public static void main(String[] args) {
//        loginDAOImpl lDao = new loginDAOImpl();
//
//        List<usuario> lista = lDao.lista();
//        for (int i = 0; i < lista.size(); i++) {
//            usuario u = lista.get(i);
//            System.out.println("Cargo: " + (i + 1) + "\nId: " + u.getNomCompleto() + "\n");
//        }
//        
//        List<usuario> listaCargo = lDao.lista();
//        for (int i = 0; i < listaCargo.size(); i++) {
//            usuario c = listaCargo.get(i);
//            System.out.println("c: " + (i + 1) + "\nId: " + c.getNomCompleto() + "\n");
//        }
//    }

}
