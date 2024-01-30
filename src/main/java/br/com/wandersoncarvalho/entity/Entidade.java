package br.com.wandersoncarvalho.entity;

public abstract class Entidade {
    protected Long id;

    public boolean equals(Object obj){
        return obj instanceof Entidade && this.id.equals(((Entidade)obj).id);
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }
}
