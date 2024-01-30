package br.com.wandersoncarvalho.exception;

public class EntidadeJaExisteException extends Exception {
    public EntidadeJaExisteException(){
        System.out.println("Entidade já existe no banco.");
    }

    public EntidadeJaExisteException(String mensagem){
        System.out.println(mensagem);
    }
}
