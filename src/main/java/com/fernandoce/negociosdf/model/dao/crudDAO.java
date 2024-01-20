/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fernandoce.negociosdf.model.dao;

import java.util.List;

/**
 *
 * @author lfern
 * @param <T>
 */
public interface crudDAO <T>{
    public List<T> listar();
    public boolean insertar(T objeto);
    public int modificar(T objeto);
    public int eliminar(int idObjeto);
    public T obtenerObjetoPorId(int idObjeto);
}
