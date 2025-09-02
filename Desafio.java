public class Desafio{
    public static void  main(String[] args){
    //1.Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 7.3;
        double nota2 = 5.12;
        double media = (nota1+nota2)/2;

        System.out.println(String.format("a media entre suas notas %.2f e %.2f é: %.2f",nota1,nota2,media));

    /*2.Declare uma variável do tipo double e uma variável do tipo int.
    Faça o casting da variável double para int e imprima o resultado.*/
        double a= 8.2;
        int b;
        b = (int) a;
        System.out.println(b);

    /*3.Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
    Atribua valores a essas variáveis e concatene-as em uma mensagem.*/
        char letra = 'C';
        String palavra = "Cabelo";
        System.out.println(String.format("A palavra %s começa com a letra %s",palavra,letra));

    /*4.Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
    Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado
    em uma mensagem.*/
        double precoProduto = 20;
        int quantidade = 60;
        System.out.println(precoProduto * quantidade);

    /*5.Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
    Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares
    para reais e imprima o resultado formatado.*/
        double valorEmDolares = 500;
        double valorReais = valorEmDolares * 4.94;
        System.out.println(valorReais);

    /*6.Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
    representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto
    e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais,
    aplique-o ao preço original e imprima o novo preço com desconto.*/
        double precoOriginal = 1400;
        double percentualDesconto = 5;
        System.out.println(String.format("voce teve %.2f de desconto, agora pague apenas %.2f",percentualDesconto,(precoOriginal * (1 - (percentualDesconto * 0.01)))));
    }
}
