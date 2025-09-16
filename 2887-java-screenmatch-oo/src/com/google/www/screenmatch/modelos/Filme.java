package br.com.alura.screenmatch.modelos;

import com.google.www.screenmatch.modelos.Titulo;

public class Filme extends Titulo {
    private String diretor;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }
}