package com.example.democrud.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.democrud.model.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
