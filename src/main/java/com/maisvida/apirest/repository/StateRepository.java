package com.maisvida.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maisvida.apirest.models.State; 

public interface StateRepository extends JpaRepository<State, Long> {
	State findById(long id);
}
