package com.maisvida.apirest.repository;

import org.springframework.data.repository.CrudRepository;

import com.maisvida.apirest.models.Document;

public interface DocumentRepository extends CrudRepository<Document, String> {
	
	Document findByType(String type);
}
