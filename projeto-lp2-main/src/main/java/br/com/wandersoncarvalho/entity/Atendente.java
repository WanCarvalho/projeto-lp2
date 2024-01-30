package br.com.wandersoncarvalho.entity;

public class Atendente extends Entidade {
        private String nome;
        private Setor setor;
        private String cargo;
        private String email;

    public Atendente(String nome, Setor setor, String cargo, String email){
        this.nome = nome;
        this.setor = setor;
        this.cargo = cargo;
        this.email = email;
    }
}