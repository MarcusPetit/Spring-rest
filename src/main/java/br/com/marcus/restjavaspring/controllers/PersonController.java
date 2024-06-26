package br.com.marcus.restjavaspring.controllers;

import br.com.marcus.restjavaspring.dto.PersonDTO;
import br.com.marcus.restjavaspring.dto.PersonDTO2;
import br.com.marcus.restjavaspring.model.Person;
import br.com.marcus.restjavaspring.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/** PersonController */
@RestController
@RequestMapping("/person")
public class PersonController {
  @Autowired
  private PersonService service;

  @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public PersonDTO findByID(@PathVariable(value = "id") Long id) {
    return service.findById(id);
  }

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public PersonDTO create(@RequestBody PersonDTO person) {
    return service.create(person);
  }

  @PostMapping(value = "/v2", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public PersonDTO createV2(@RequestBody PersonDTO2 person) {
    return service.createV2(person);
  }

  @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public PersonDTO update(@RequestBody PersonDTO person) {
    return service.updade(person);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<PersonDTO> findAll() {
    return service.findAll();
  }
}
