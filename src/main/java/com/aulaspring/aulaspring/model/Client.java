package com.aulaspring.aulaspring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clients")
public class Client {

    @Id
    private String id;

    private String nome;
    private String sobreNome;
    private int idade;

    public Client() {

    }

    public Client(String nome, String sobreNome){
      this.setNome(nome);
      this.setSobreNome(sobreNome);
    }

    public Client(String nome, String sobreNome, int idade){
        this.setNome(nome);
        this.setSobreNome(sobreNome);
        this.setIdade(idade);
    }

    @Override
    public String toString() {
        return String.format(
                "Client[id=%s, name='%s', sobreName='%s', idade='%s']",
                id, nome, sobreNome, idade);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
