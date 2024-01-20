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
    private String direccion;
    private String fecha_creación;
    private String estado;
    private String nomCompleto;

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

    public String getDireccion() {
        return direccion;
    }

    public void setDirección(String direccion) {
        this.direccion = direccion;
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

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }
    
}
