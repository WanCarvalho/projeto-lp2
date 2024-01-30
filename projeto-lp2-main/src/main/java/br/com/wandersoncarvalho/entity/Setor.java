package br.com.wandersoncarvalho.entity;

public class Setor extends Entidade {
    private String nome;
    private int qtdFuncionarios;

    public Setor(String nome){
        this.nome = nome;
        this.qtdFuncionarios = 0;
    }
}