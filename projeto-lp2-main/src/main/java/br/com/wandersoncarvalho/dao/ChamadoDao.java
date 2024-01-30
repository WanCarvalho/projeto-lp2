package br.com.wandersoncarvalho.dao;

import br.com.wandersoncarvalho.exception.EntidadeJaExisteException;
import br.com.wandersoncarvalho.exception.EntidadeNaoEncontradaException;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ChamadoDao implements Dao {
    public abstract void adicionar(T entidade) throws EntidadeJaExisteException;
    public abstract void atualizar(T entidade) throws EntidadeNaoEncontradaException;
    public abstract T remover(T entidade) throws EntidadeNaoEncontradaException;
    public abstract T buscar(long id) throws EntidadeNaoEncontradaException;
    public abstract List<T> listar();
    public abstract List<T> listar(Predicate<T> predicate);
    public abstract List<T> listar(Comparator<T> comparator);
}
