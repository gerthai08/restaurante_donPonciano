package com.donPonciano.ingredientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donPonciano.ingredientes.model.Ingrediente;
import com.donPonciano.ingredientes.service.IIngredienteService;

@RestController
@RequestMapping("/ingredientes")
public class ControllerIngredientes {


    @Autowired
    private IIngredienteService ingreServ;

    @PostMapping("/crear")
    public String crearIngrediente(@RequestBody Ingrediente ing){
        ingreServ.saveIngrediente(ing);
        return "Ingrediente creado";
    }

    @GetMapping("traer/{nombrePlato}")
    public List<Ingrediente> traerIngredientes(@PathVariable String nombrePlato){
        return ingreServ.getIngredienteByPlato(nombrePlato);
    }



}
