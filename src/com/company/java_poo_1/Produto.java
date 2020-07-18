package com.company.java_poo_1;

public class Produto {
    private String nome;
    private Float preco;

    public Produto(){
        this.nome="item";
        this.preco=0.01f;
    }
    public Produto(String nome, Float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    @Override
    public String toString(){
        String resultado="";
        resultado += " nome='" + getNome() + "'";
        resultado += " preço='" + getPreco() + "'";
        return resultado;
    }


}
