package br.com.wandersoncarvalho.entity;

public class Solicitante extends Entidade {
    private String nome;
    private Setor setor;
    private String cargo;
    private String email;

    public Solicitante(String nome, Setor setor, String cargo, String email){
        this.nome = nome;
        this.setor = setor;
        this.cargo = cargo;
        this.email = email;
    }
}