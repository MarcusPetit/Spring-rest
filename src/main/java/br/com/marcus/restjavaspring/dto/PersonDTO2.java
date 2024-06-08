package br.com.marcus.restjavaspring.dto;

import java.util.Date;

import br.com.marcus.restjavaspring.model.Person;

/** PersonDTO2 */
public class PersonDTO2 {

    private Long id;

    private String nome;

    private String ultimoNome;

    private String endereco;

    private String genero;

    private Date aniversario;

    
    public PersonDTO2(Long id, String nome, String ultimoNome, String endereco, String genero, Date aniversario) {
        this.id = id;
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.endereco = endereco;
        this.genero = genero;
        this.aniversario = aniversario;
    }

    public PersonDTO2(Person person) {
        id = person.getId();
        nome = person.getNome();
        ultimoNome = person.getUltimoNome();
        endereco = person.getEndereco();
        genero = person.getGenero();
        aniversario = person.getAniversario();
    }

    public Long getId() {
        return id;
    }
    
    public void setId(long id) {
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

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((ultimoNome == null) ? 0 : ultimoNome.hashCode());
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((aniversario == null) ? 0 : aniversario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PersonDTO2 other = (PersonDTO2) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (ultimoNome == null) {
            if (other.ultimoNome != null)
                return false;
        } else if (!ultimoNome.equals(other.ultimoNome))
            return false;
        if (endereco == null) {
            if (other.endereco != null)
                return false;
        } else if (!endereco.equals(other.endereco))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (aniversario == null) {
            if (other.aniversario != null)
                return false;
        } else if (!aniversario.equals(other.aniversario))
            return false;
        return true;
    }
}
