package br.com.wandersoncarvalho.dao;

import br.com.wandersoncarvalho.entity.Setor;
import br.com.wandersoncarvalho.database.Database;
import br.com.wandersoncarvalho.database.DatabaseI;
import br.com.wandersoncarvalho.exception.EntidadeJaExisteException;
import br.com.wandersoncarvalho.exception.EntidadeNaoEncontradaException;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class SetorDao implements Dao<Setor>{

    public SetorDao(){
        //chamo db.adicionar para popular o banco com os setores
    }
    
    DatabaseI db = Database.getInstance();
    public abstract void adicionar(T entidade) throws EntidadeJaExisteException;
    public abstract void atualizar(T entidade) throws EntidadeNaoEncontradaException;
    public abstract T remover(T entidade) throws EntidadeNaoEncontradaException;
    public abstract T buscar(long id) throws EntidadeNaoEncontradaException;
    public abstract List<T> listar();
    public abstract List<T> listar(Predicate<T> predicate);
    public abstract List<T> listar(Comparator<T> comparator);
}
