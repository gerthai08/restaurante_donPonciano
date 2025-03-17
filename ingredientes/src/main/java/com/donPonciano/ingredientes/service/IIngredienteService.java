package com.donPonciano.ingredientes.service;

import java.util.List;

import com.donPonciano.ingredientes.model.Ingrediente;

public interface IIngredienteService {

    //traer todos los ingredientes
    public List<Ingrediente> getIngredientes();

    //guardar un ingrediente
    public void saveIngrediente(Ingrediente ing);

    //eliminar ingrediente
    public void deleteIngrediente(Long id);

    //buscar ingrediente por id
    public Ingrediente findIngrediente(Long id);

    //editar ingrediente
    public void editIngrediente(Long id, Ingrediente ing);

    //buscar ingrediente por nombre
    public List<Ingrediente> getIngredienteByPlato (String nombrePlato);

}
