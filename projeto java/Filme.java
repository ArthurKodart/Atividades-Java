public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean inclusoNoPlano;
    double somaDasAvaliacoes;
    double totalDeAvaliacoes;
    double mediaAvaliacao = somaDasAvaliacoes/totalDeAvaliacoes;
    double avaliacao;

    void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluido no plano: " + inclusoNoPlano);
        System.out.println("Avaliação média: " + mediaAvaliacao);
    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
    double pegaMedia(){
        mediaAvaliacao = somaDasAvaliacoes/totalDeAvaliacoes;
        return mediaAvaliacao;
    }


}
