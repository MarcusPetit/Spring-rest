package br.com.marcus.restjavaspring.model;

import br.com.marcus.restjavaspring.dto.PersonDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

/** Person */
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 80)
    private String nome;

    @Column(name = "ultimoNome", nullable = false, length = 80)
    private String ultimoNome;

    @Column(name = "endereco", nullable = false, length = 100)
    private String endereco;

    @Column(name = "genero", nullable = false, length = 8)
    private String genero;

    public Person() {}

    public Person(Long id) {
        this.id = id;
    }

    public Person(Long id, String nome, String ultimoNome, String endereco, String genero) {
        this.id = id;
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.endereco = endereco;
        this.genero = genero;
    }

    public Person(PersonDTO persondto) {
        this.id = persondto.getId();
        this.nome = persondto.getNome();
        this.ultimoNome = persondto.getUltimoNome();
        this.endereco = persondto.getEndereco();
        this.genero = persondto.getGenero();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getId(), person.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
