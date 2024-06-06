package br.com.marcus.restjavaspring.dto;

import br.com.marcus.restjavaspring.model.Person;


/** PersonDTO */

public class PersonDTO {

    private Long id;

    private String nome;

    private String ultimoNome;

    private String endereco;

    private String genero;

    public PersonDTO(Long id, String nome, String ultimoNome, String endereco, String genero) {
        this.id = id;
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.endereco = endereco;
        this.genero = genero;
    }

    public PersonDTO(Person person) {
        id = person.getId();
        nome = person.getNome();
        ultimoNome = person.getUltimoNome();
        endereco = person.getEndereco();
        genero = person.getGenero();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
