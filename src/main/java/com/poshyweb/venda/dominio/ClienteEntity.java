package com.poshyweb.venda.dominio;

public class ClienteEntity {

    private Integer id;
    private String nome;

    public ClienteEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
