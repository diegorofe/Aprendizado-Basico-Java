package com.projetono;

public class No {

private String conteudo;
private No proximNo;

    public No(String conteudo) {
        this.proximNo = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximNo() {
        return proximNo;
    }

    public void setProximNo(No proximNo) {
        this.proximNo = proximNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
