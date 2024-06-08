package br.com.marcus.restjavaspring.dto;

import br.com.marcus.restjavaspring.model.Person;

import java.util.Objects;

/** PersonDTO */
public class PersonDTO {

    private Long id;

    private String nome;

    private String ultimonome;

    private String endereco;

    private String genero;

    public PersonDTO(Long id, String nome, String ultimoNome, String endereco, String genero) {
        this.id = id;
        this.nome = nome;
        this.ultimonome = ultimoNome;
        this.endereco = endereco;
        this.genero = genero;
    }

    public PersonDTO(Person person) {
        id = person.getId();
        nome = person.getNome();
        ultimonome = person.getUltimoNome();
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
        return ultimonome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimonome = ultimoNome;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonDTO personDTO)) return false;
        return getId() == personDTO.getId() && Objects.equals(getNome(), personDTO.getNome()) && Objects.equals(ultimonome, personDTO.ultimonome) && Objects.equals(getEndereco(), personDTO.getEndereco()) && Objects.equals(getGenero(), personDTO.getGenero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), ultimonome, getEndereco(), getGenero());
    }
}
