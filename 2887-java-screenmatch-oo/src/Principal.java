import br.com.alura.screenmatch.modelos.Filme;
import com.google.www.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie pokemon = new Serie();
        pokemon.setNome("pikachu");
        pokemon.setTemporadas(2);
        pokemon.setEpisodiosPorTemporada(2);
        pokemon.setMinutosPorEpisodio(2);
        pokemon.setTemporadas(2);
        pokemon.exibeFichaTecnica();
        System.out.println("duração em minutos:"+ pokemon.getDuracaoEmMinutos());
    }
}