public class Main {
    public static void main(String[] args) {
        Pessoa n1 =  new Pessoa();
        n1.texto();
        Calculadora teste = new Calculadora();
        teste.calculaDobro(2);

        Musica m1 =  new Musica();
        m1.titulo= "faceMyFears";
        m1.anoLancamento = 2022;
        m1.artista = "Hikaru Utada";
        m1.avaliar(8);
        m1.avaliar(9);
        m1.calcularMedia();
        m1.exibirFichaTecnica();

    }
}
