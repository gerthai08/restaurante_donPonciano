package com.donPonciano.platos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donPonciano.platos.model.Plato;

public interface IPlatoRepository extends JpaRepository<Plato, Long> {

}
