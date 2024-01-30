package br.com.wandersoncarvalho.exception;

public class EntidadeNaoEncontradaException extends Exception {
    public EntidadeNaoEncontradaException(){
        System.out.println("Entidade não encontrada no banco.");
    }

    public EntidadeNaoEncontradaException(String mensagem){
        System.out.println(mensagem);
    }
}
