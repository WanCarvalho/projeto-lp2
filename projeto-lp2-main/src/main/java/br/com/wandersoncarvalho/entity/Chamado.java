package br.com.wandersoncarvalho.entity;

public class Chamado extends Entidade {
    private Solicitante solicitante;
    private Atendente atendente;
    private String descricaoProblema;
    private String status;
    private String solucao;
    private String dataDeAbertura;
    private String dataDeConclusao;
    private String observacoes;

    public Chamado(Solicitante solicitante, Atendente atendente, String descricaoProblema, String dataDeAbertura, String observacoes){
        this.solicitante = solicitante;
        this.atendente = atendente;
        this.descricaoProblema = descricaoProblema;
        this.dataDeAbertura = dataDeAbertura;
        this.observacoes = observacoes;
        this.status = "Aberto";
    }
}