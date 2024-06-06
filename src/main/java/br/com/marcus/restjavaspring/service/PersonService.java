package br.com.marcus.restjavaspring.service;

import br.com.marcus.restjavaspring.exceptions.ResourceNotFoundException;
import br.com.marcus.restjavaspring.model.Person;
import br.com.marcus.restjavaspring.repositories.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** PersonService */
@Service
public class PersonService {

    @Autowired PersonRepository repository;

    public List<Person> findAll() {
        return repository.findAll();
    }

    public Person findById(Long id) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setNome("marcus");
        person.setEndereco("Brasil");

        person.setUltimoNome("Petit");
        person.setGenero("Mascolino");
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Sem o id"));
    }

    public Person create(Person person) {
        return repository.save(person);
    }

    public Person updade(Person person) {
        Person entity =
                repository
                        .findById(person.getId())
                        .orElseThrow(
                                () -> new ResourceNotFoundException("nao foi encomtrado o id"));
        return repository.save(entity);
    }

    public void delete(Long id) {
        var entity =
                repository
                        .findById(id)
                        .orElseThrow(
                                () -> new ResourceNotFoundException("nao conseguimos encontrar"));
        repository.delete(entity);
    }
}