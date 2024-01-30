package br.com.wandersoncarvalho.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.wandersoncarvalho.entity.Entidade;
import br.com.wandersoncarvalho.exception.EntidadeJaExisteException;
import br.com.wandersoncarvalho.exception.EntidadeNaoEncontradaException;

public class Database implements DatabaseI {
    private static Database instance;
    private Map<Class<? extends Entidade>, List<Entidade>> dataMap;
    private Long idCounter;

    private Database(){
        dataMap = new HashMap<>();
        idCounter = 0l;
    }

    public static synchronized Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    @Override
    public <T extends Entidade> void adicionar(T entidade) throws EntidadeJaExisteException{
        // implementar método para adicionar entidade ao banco
        this.dataMap.put(T entidade, this.dataMap.get(Entidade.class));

        throw new EntidadeJaExisteException();
    }

    @Override
    public <T extends Entidade> List<T> listar(Class<T> tipoEntidade){
        List<T> entidades = new ArrayList<>();

        if(this.dataMap.containsKey(tipoEntidade)){
            for(Entidade e : this.dataMap.get(tipoEntidade)){
                entidades.add(tipoEntidade.cast(e));
            }
        }
        return entidades;
    }

    @Override
    public <T extends Entidade> void atualizar(T entidade) throws EntidadeNaoEncontradaException{
        Class<? extends Entidade> tipoEntidade = entidade.getClass();

        if(this.dataMap.containsKey(tipoEntidade)){
            Entidade e;
            List<Entidade> entidades = this.dataMap.get(tipoEntidade);

            for(int i = 0; i < entidades.size(); i++){
                e = entidades.get(i);

                if(e.equals(entidade)){
                    entidades.set(i, entidade);
                }
            }
        }

        throw new EntidadeNaoEncontradaException();
    }
    
}
