package br.com.wandersoncarvalho.dao;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import br.com.wandersoncarvalho.entity.Entidade;
import br.com.wandersoncarvalho.exception.EntidadeJaExisteException;
import br.com.wandersoncarvalho.exception.EntidadeNaoEncontradaException;

public interface Dao<T extends Entidade> {
    public abstract void adicionar(T entidade) throws EntidadeJaExisteException;
    public abstract void atualizar(T entidade) throws EntidadeNaoEncontradaException;
    public abstract T remover(T entidade) throws EntidadeNaoEncontradaException;
    public abstract T buscar(long id) throws EntidadeNaoEncontradaException;
    public abstract List<T> listar();
    public abstract List<T> listar(Predicate<T> predicate);
    public abstract List<T> listar(Comparator<T> comparator);
}
