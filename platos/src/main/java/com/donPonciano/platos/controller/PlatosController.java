package com.donPonciano.platos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donPonciano.platos.dto.PlatoDTO;
import com.donPonciano.platos.model.Plato;
import com.donPonciano.platos.service.IPlatoService;

@RestController
@RequestMapping("/platos")
public class PlatosController {

    @Autowired
    private IPlatoService platoServ;

    @PostMapping("/crear")
    public String crearIngrediente (@RequestBody PlatoDTO plato){

        platoServ.savePlato(plato.getNombre(),plato.getPrecio(),plato.getDescripcion());
        return "Plato creado";
    }

    @GetMapping("traer")
    public List<Plato> traerPlatos(){
        return platoServ.getPlatos();
    }   

}
