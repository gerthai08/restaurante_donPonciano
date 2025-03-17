package com.donPonciano.platos.service;

import java.util.List;

import com.donPonciano.platos.model.Plato;

public interface IPlatoService{

    //Crear plato
    public void savePlato(String nombre, Double precio, String descripcion);

    //Traer platos
    public List<Plato> getPlatos();

    //Traer plato por id
    public Plato findPlatoById(Long id);
    
    //Eliminar plato
    public void deletePlato(Long id);

    //Editar plato
    public void editPlato(Long id, Plato plat);
}
