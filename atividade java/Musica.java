public class Musica {
        String titulo;
        String artista;
        int anoLancamento;
        double avaliacao;
        double somaAvaliacoes;
        int quantAvaliacoes;

        void exibirFichaTecnica(){
            System.out.println(titulo);
            System.out.println(artista);
            System.out.println(anoLancamento);
            System.out.println(avaliacao);
        }
        void avaliar(double nota){
            somaAvaliacoes += nota;
            quantAvaliacoes ++;
        }
        void calcularMedia(){
            avaliacao= somaAvaliacoes/quantAvaliacoes;

        }
}
