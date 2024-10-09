import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme topgun = new Filme();
        topgun.setNome("Top Gun");
        topgun.setAnoDeLancamento(2022);
        topgun.setDuracaoEmMinutos(110);

        Filme harryPotter = new Filme();
        harryPotter.setNome("Harry Potter");
        harryPotter.setAnoDeLancamento(2000);

        harryPotter.setDuracaoEmMinutos(140);


        topgun.exibirFichaTecnica();
        harryPotter.exibirFichaTecnica();

        harryPotter.avaliaFilme(10);
        harryPotter.avaliaFilme(8);
        harryPotter.avaliaFilme(6);
        harryPotter.avaliaFilme(10);
        harryPotter.avaliaFilme(9);

        System.out.println(harryPotter.calculaMedia());
        System.out.println(harryPotter.getTotalDeAvaliacoes());

        Serie ninenine = new Serie();
        ninenine.setNome("Brooklyn 99");
        ninenine.setEpisodiosPorTemporadas(15);
        ninenine.setMinutosPorEpisodio(30);
        ninenine.setTemporadas(7);

        System.out.println("Tempo total de " + ninenine.getNome() + ": " + ninenine.getDuracaoEmMinutos() + "m");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(harryPotter);
        calculadora.inclui(topgun);
        calculadora.inclui(ninenine);


        System.out.println(calculadora.getTempoTotal());

        Episodio inicio = new Episodio();
        Episodio fim = new Episodio();

        inicio.setTotalVisualizacoes(200);
        fim.setTotalVisualizacoes(30);

        System.out.println(inicio.getClassificacao() + " - " + fim.getClassificacao());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(harryPotter);



    }
}
