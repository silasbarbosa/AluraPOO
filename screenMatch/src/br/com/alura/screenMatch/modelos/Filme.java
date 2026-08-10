package br.com.alura.screenMatch.modelos;

public class Filme {
    private String nome;
    private int anoLancamento;
    private boolean incluePlan;
    private double somaDasAvaliacoes;
    private int totalAvaliacao;
    private double duracaoMinutos;


    public void exibeFichaTecnica(){
        System.out.println("Nome: "+nome);
        System.out.println("Ano de lancamento: "+anoLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacao++;
    }
    public double medias(){
        return somaDasAvaliacoes/totalAvaliacao;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setNome(String nome){
        this.nome= nome;
    }
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento= anoLancamento;
    }
    public void setIncluePlan(boolean incluePlan){
        this.incluePlan= incluePlan;
    }

    public void setDuracaoMinutos(double duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
