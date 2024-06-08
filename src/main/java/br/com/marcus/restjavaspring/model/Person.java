package br.com.marcus.restjavaspring.model;

import java.util.Date;

import br.com.marcus.restjavaspring.dto.PersonDTO;
import br.com.marcus.restjavaspring.dto.PersonDTO2;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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

  @Column(name = "aniversario", nullable = true, length = 10)
  private Date aniversario;

  public Person() {
  }

  public Person(Long id) {
    this.id = id;
  }

  public Person(Long id, String nome, String ultimoNome, String endereco, String genero, Date aniversario) {
    this.id = id;
    this.nome = nome;
    this.ultimoNome = ultimoNome;
    this.endereco = endereco;
    this.genero = genero;
    this.aniversario = aniversario;
  }

  public Person(PersonDTO persondto) {
    this.id = persondto.getId();
    this.nome = persondto.getNome();
    this.ultimoNome = persondto.getUltimoNome();
    this.endereco = persondto.getEndereco();
    this.genero = persondto.getGenero();
  }

  public Person(PersonDTO2 persondto2) {
    this.id = persondto2.getId();
    this.nome = persondto2.getNome();
    this.ultimoNome = persondto2.getUltimoNome();
    this.endereco = persondto2.getEndereco();
    this.genero = persondto2.getGenero();
    this.aniversario = persondto2.getAniversario();
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

  public Date getAniversario() {
    return aniversario;
  }

  public void setAniversario(Date aniversario) {
    this.aniversario = aniversario;
  }




}
