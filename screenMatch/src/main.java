import br.com.alura.screenMatch.modelos.Filme;

public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("He-man");
        meuFilme.setAnoLancamento(2026);
        meuFilme.setDuracaoMinutos(141);
        //  meuFilme.totalAvaliacao= 0 ;
        meuFilme.setIncluePlan(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.medias());
    }
}
