package br.com.alura.screenMatch.modelos;

public class Filme extends Titulo implements Episodio{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
