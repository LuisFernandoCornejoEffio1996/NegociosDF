/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandoce.negociosdf.model.entidades;

/**
 *
 * @author lfern
 */
public class usuario {

    private int idUsuario;
    private persona personaId;
    private String usuario;
    private String contrasenia;
    private String nomCompleto;
    private String ultimo_acceso;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(persona personaId) {
        this.personaId = personaId;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public String getUltimo_acceso() {
        return ultimo_acceso;
    }

    public void setUltimo_acceso(String ultimo_acceso) {
        this.ultimo_acceso = ultimo_acceso;
    }

}
