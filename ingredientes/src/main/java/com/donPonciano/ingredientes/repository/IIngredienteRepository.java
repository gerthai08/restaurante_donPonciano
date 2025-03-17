package com.donPonciano.ingredientes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.donPonciano.ingredientes.model.Ingrediente;

@Repository
public interface IIngredienteRepository extends JpaRepository<Ingrediente, Long> {

    @Query("SELECT i FROM Ingrediente i WHERE :plato MEMBER OF i.platos")
    List<Ingrediente> findByNombre(String plato);

}
