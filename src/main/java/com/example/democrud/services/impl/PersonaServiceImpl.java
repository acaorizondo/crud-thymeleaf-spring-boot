package com.example.democrud.services.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.democrud.commons.*;
import com.example.democrud.model.Persona;
import com.example.democrud.services.PersonaService;
import com.example.democrud.dao.PersonaDao;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService{
	
	@Autowired
	private PersonaDao personaDao;

	@Override
	public CrudRepository<Persona, Long> getDao() {
		return personaDao;
	}

}
