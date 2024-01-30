package br.com.wandersoncarvalho.database;

import java.util.List;

import br.com.wandersoncarvalho.entity.Entidade;
import br.com.wandersoncarvalho.exception.EntidadeJaExisteException;
import br.com.wandersoncarvalho.exception.EntidadeNaoEncontradaException;

public interface DatabaseI {
    public abstract <T extends Entidade> void adicionar(T entidade) throws EntidadeJaExisteException;
    public abstract <T extends Entidade> void atualizar(T entidade) throws EntidadeNaoEncontradaException;
    public abstract <T extends Entidade> T remover(Class<T> tipoEntidade, Long id) throws EntidadeNaoEncontradaException;
    public abstract <T extends Entidade> T buscar(Class<T> tipoEntidade, Long id) throws EntidadeNaoEncontradaException;
    public abstract <T extends Entidade> List<T> listar(Class<T> tipoEntidade);
}
