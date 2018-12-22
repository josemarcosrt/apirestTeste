package com.maisvida.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maisvida.apirest.models.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Long>  {
	
	//Photo findById(long id);
}

