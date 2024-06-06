package br.com.marcus.restjavaspring.repositories;

import br.com.marcus.restjavaspring.model.Person;

import org.springframework.data.jpa.repository.JpaRepository;

/** PersonRepository */
public interface PersonRepository extends JpaRepository<Person, Long> {}
