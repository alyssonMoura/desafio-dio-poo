package br.com.desafio.dio.domain;

public class Cliente {
    String nome;
    String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

}
