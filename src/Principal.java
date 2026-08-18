import br.com.alura.screenMatch.calculos.FiltroRecomendacao;
import br.com.alura.screenMatch.modelos.Episodio;
import br.com.alura.screenMatch.modelos.Filme;
import br.com.alura.screenMatch.modelos.Serie;
import br.com.alura.screenMatch.calculos.CaculadoraDeTempo;

public class Principal {
    public Principal() {
    }

    static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("He-man");
        meuFilme.setAnoLancamento(2026);
        meuFilme.setDuracaoMinutos((double)141.0F);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia((double)10.0F);
        meuFilme.avalia((double)5.0F);
        meuFilme.avalia((double)8.0F);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.medias());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracao para maratonar Lost é de: "+ lost.getDuracaoMinutos());

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("PErdidos em Marte");
        meuFilme2.setAnoLancamento(2026);
        meuFilme2.setDuracaoMinutos((double)129.0F);

        CaculadoraDeTempo calculadora = new CaculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro  = new FiltroRecomendacao();

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.settotalVizualizacoes(300);
        filtro.filtra(episodio);
    }
}
