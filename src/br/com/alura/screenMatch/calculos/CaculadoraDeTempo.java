package br.com.alura.screenMatch.calculos;
import br.com.alura.screenMatch.modelos.Filme;
import br.com.alura.screenMatch.modelos.Titulo;

public class CaculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal +=f.getDuracaoMinutos();
//    }

    public void inclui(Titulo titulo) {
        this.tempoTotal+= titulo.getDuracaoMinutos();
    }
}
