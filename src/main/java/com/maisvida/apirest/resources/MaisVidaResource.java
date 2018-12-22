package com.maisvida.apirest.resources;

import java.util.List;

import javax.validation.Valid;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maisvida.apirest.models.State;
import com.maisvida.apirest.models.Person;
import com.maisvida.apirest.models.Document;
import com.maisvida.apirest.models.Photo;
import com.maisvida.apirest.repository.StateRepository;
import com.maisvida.apirest.repository.PersonRepository;
import com.maisvida.apirest.repository.DocumentRepository;
import com.maisvida.apirest.repository.PhotoRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST State")
public class MaisVidaResource {

	@Autowired
	StateRepository stateRepository;
	
	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	DocumentRepository documentRepository;
	
	@Autowired
	PhotoRepository photoRepository;
	
	
	@ApiOperation(value="Retorna uma lista de Estados")
	@GetMapping("/estados")
	public List<State> listaEstados(){
		return stateRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um estado unico")
	@GetMapping("/estado/{id}")
	public State listaEstadoUnico(@PathVariable(value="id") long id){
		return stateRepository.findById(id);
	}
	
	@ApiOperation(value="Retorna uma lista as Pessoas")
	@GetMapping("/pessoas")
	public List<Person> listaPessoas(){
		return (List<Person>) personRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um pessoa")
	@GetMapping("/pessoa/{id}")
	public Person listaPessoa(@PathVariable(value="id") long id){
		return personRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um pessoa")
	@PostMapping("/pessoa")
	public Person salvaPerson(@RequestBody @Valid Person pessoa) {
		return personRepository.save(pessoa);
	}
	
	@ApiOperation(value="Deleta um pessoa")
	@DeleteMapping("/pessoa")
	public void deletaPerson(@RequestBody @Valid Person pessoa) {
		personRepository.delete(pessoa);
	}
	
	@ApiOperation(value="Atualiza um pessoa")
	@PutMapping("/pessoa")
	public Person atualizaPerson(@RequestBody @Valid Person pessoa) {
		return personRepository.save(pessoa);
	}
	
	
	@ApiOperation(value="Retorna uma lista de Documentos")
	@GetMapping("/documentos")
	public List<Document> listaDocumentos(){
		return (List<Document>) documentRepository.findAll();
	}
	
	
	@ApiOperation(value="Retorna a photo")
	@GetMapping("/photo")
	public List<Photo> listaPhoto(){
		return photoRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um photo unica")
	@GetMapping("/photo/{id}")
	public Photo listaPhotoUnica(@PathVariable(value="id") long id){
		return photoRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um photo")
	@PostMapping("/savePhoto")
	public Photo salvaPhoto(@RequestBody @Valid Photo photo) {
		return photoRepository.save(photo);
	}
	
	@ApiOperation(value="Atualiza um photo")
	@PutMapping("/atualizarPhoto")
	public Photo atualizaPhoto(@RequestBody @Valid Photo photo) {
		return photoRepository.save(photo);
	}
	//@RequestMapping(value="/{codigo}", method=RequestMethod.GET)
	
	@ApiOperation(value="Deleta um photo")
	@DeleteMapping("/deletePhoto")
	public void deletaPhoto(@RequestBody @Valid Photo photo) {
		photoRepository.delete(photo);
	}

}
