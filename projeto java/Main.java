public class Main {
    public static void main(String[] args) {
        Filme novoFilme = new Filme();
        novoFilme.nome = "Era do Gelo";
        novoFilme.anoDeLancamento = 2025;
        novoFilme.duracaoEmMinutos = 160;
        novoFilme.inclusoNoPlano = true;
        novoFilme.mediaAvaliacao = 0 ;
        novoFilme.avalia(5);
        novoFilme.avalia(8);
        novoFilme.pegaMedia();
        novoFilme.exibeFichaTecnica();
    }

}
