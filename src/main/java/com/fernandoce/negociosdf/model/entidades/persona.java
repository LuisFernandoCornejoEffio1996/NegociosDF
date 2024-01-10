/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fernandoce.negociosdf.model.entidades;

/**
 *
 * @author lfern
 */
public class persona {
    private int idPersona;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private tipodoc tipo_docID;
    private String num_doc;
    private cargo cargoId;
    private String telefono;
    private String dirección;
    private String username;
    private String password;
    private String ultimo_acceso;
    private String fecha_creación;
    private String estado;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public tipodoc getTipo_docID() {
        return tipo_docID;
    }

    public void setTipo_docID(tipodoc tipo_docID) {
        this.tipo_docID = tipo_docID;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public cargo getCargoId() {
        return cargoId;
    }

    public void setCargoId(cargo cargoId) {
        this.cargoId = cargoId;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUltimo_acceso() {
        return ultimo_acceso;
    }

    public void setUltimo_acceso(String ultimo_acceso) {
        this.ultimo_acceso = ultimo_acceso;
    }

    public String getFecha_creación() {
        return fecha_creación;
    }

    public void setFecha_creación(String fecha_creación) {
        this.fecha_creación = fecha_creación;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
