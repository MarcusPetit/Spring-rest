package br.com.marcus.restjavaspring.service;

import br.com.marcus.restjavaspring.dto.PersonDTO;
import br.com.marcus.restjavaspring.dto.PersonDTO2;
import br.com.marcus.restjavaspring.exceptions.ResourceNotFoundException;
import br.com.marcus.restjavaspring.model.Person;
import br.com.marcus.restjavaspring.repositories.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/** PersonService */
@Service
public class PersonService {

    @Autowired private PersonRepository repository;

    public List<PersonDTO> findAll() {
        List<Person> entity = repository.findAll();
        List<PersonDTO> dto =
                entity.stream().map(PersonDTO::new).collect(Collectors.toList());
        return dto;
    }

    public PersonDTO findById(Long id) {
        Person entity =
                repository
                        .findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Sem o id"));
        PersonDTO dto = new PersonDTO(entity);
        return dto;
    }

    public PersonDTO create(PersonDTO person) {
        Person entity = new Person(person);
        Person saveEntity = repository.save(entity);
        return new PersonDTO(saveEntity);
    }

    public PersonDTO createV2(PersonDTO2 person) {
        Person entity = new Person(person);
        Person saveEntity = repository.save(entity);
        return new PersonDTO(saveEntity);
    }


    public PersonDTO updade(PersonDTO person) {
        Person entity =
                repository
                        .findById(person.getId())
                        .orElseThrow(
                                () -> new ResourceNotFoundException("nao foi encomtrado o id"));

        entity.setNome(person.getNome());
        entity.setEndereco(person.getEndereco());
        entity.setUltimoNome(person.getUltimoNome());
        entity.setGenero(person.getGenero());
        Person saveEntity = repository.save(entity);
        return new PersonDTO(saveEntity);
    }

    public void delete(Long id) {
        Person entity =
                repository
                        .findById(id)
                        .orElseThrow(
                                () -> new ResourceNotFoundException("nao conseguimos encontrar"));
        repository.delete(entity);
    }
}
