package br.com.alura.screenMatch.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluePlan;
    private double somaDasAvaliacoes;
    private int totalAvaliacao;
    private double duracaoMinutos;


    public void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lancamento: " + anoLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacao++;
    }

    public double medias() {
        return somaDasAvaliacoes / totalAvaliacao;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluePlan(boolean incluePlan) {
        this.incluePlan = incluePlan;
    }

    public void setDuracaoMinutos(double duracaoMinutos) {

        this.duracaoMinutos = duracaoMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluePlan() {
        return incluePlan;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public double getDuracaoMinutos() {
        return duracaoMinutos;
    }
}
