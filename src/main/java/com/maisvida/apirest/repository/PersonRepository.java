package com.maisvida.apirest.repository;

import org.springframework.data.repository.CrudRepository;

import com.maisvida.apirest.models.Person; 

public interface PersonRepository extends CrudRepository<Person, Long> {

	Person findById(long id);
}
