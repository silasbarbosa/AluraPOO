package br.com.alura.screenMatch.calculos;

import br.com.alura.screenMatch.modelos.Titulo;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra (Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Esta dentre os preferidos do momento");
        }
        else if (classificavel.getClassificacao() >= 2){
            System.out.println("Esta está bem avaliado");
        }
        else if (classificavel.getClassificacao() <= 2){
            System.out.println("assista em outro momento ");
        }
    }
}
