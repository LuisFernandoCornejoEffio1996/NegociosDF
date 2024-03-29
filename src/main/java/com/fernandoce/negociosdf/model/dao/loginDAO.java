/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fernandoce.negociosdf.model.dao;

import com.fernandoce.negociosdf.model.entidades.usuario;
import java.util.List;

/**
 *
 * @author lfern
 */
public interface loginDAO <T>{
    public usuario login(String email, String password);
    public T Datos(int idPersona);
    public List<T> lista();
}
