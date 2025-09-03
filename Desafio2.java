import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        /*1.Crie um programa que solicite ao usuário digitar um número.
        Se o número for positivo, exiba "Número positivo", caso contrário,
        exiba "Número negativo".*/
        Scanner leitura = new Scanner(System.in);
        System.out.println("digite um numero");
        double numero = leitura.nextDouble();
        if (numero >= 0){
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        /*2.Peça ao usuário para inserir dois números inteiros.
        Compare os números e imprima uma mensagem indicando se são iguais,
        diferentes, o primeiro é maior ou o segundo é maior.*/
        System.out.println("digite um numero");
        numero = leitura.nextDouble();
        System.out.println("digite outro numero");
        double numero2 = leitura.nextDouble();
        if (numero == numero2){
            System.out.println("Números iguais");
        } else {
            System.out.println("Números diferentes");
        }

        if (numero > numero2){
            System.out.println("o primeiro numero é maior");
        } else if (numero < numero2) {
            System.out.println("o segundo numero é maior");
        }
        /*3.Crie um menu que oferece duas opções ao usuário: "1.
        Calcular área do quadrado" e "2. Calcular área do círculo".
        Solicite a escolha do usuário e realize o cálculo da área
        com base na opção selecionada.*/
        System.out.println("você deseja:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        int opcao = leitura.nextInt();
        double a = 0;
        double b = 0;
        if (opcao == 1) {
            System.out.println("digite o valor da base");
            a = leitura.nextDouble();
            System.out.println("digite o valor da altura");
            b = leitura.nextDouble();
            System.out.println(a*b);
        } else if (opcao == 2) {
            System.out.println("digite o valor do raio");
            a = leitura.nextDouble();
            System.out.println(2*3.14*a);
        } else{
            System.out.println("opção invalida");
        }
        /*4.Crie um programa que solicite ao usuário um número
        e exiba a tabuada desse número de 1 a 10.*/
        System.out.println("quer saber a tabuada de qual numero?");
        int tabuada = leitura.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d X %d = %d ", i, tabuada, i*tabuada) );
        }
        /*5.Crie um programa que solicite ao usuário a entrada
        de um número inteiro. Verifique se o número é par ou
        ímpar e exiba uma mensagem correspondente.*/
        System.out.println("digite um numero");
        int pi = leitura.nextInt();
        if( pi % 2 == 0){
            System.out.println("par");
        } else{
            System.out.println("impar");
        }
        /*6.Crie um programa que solicite ao
        usuário um número e calcule o fatorial desse número.*/
        System.out.println("digite um numero");
        int fatorial = leitura.nextInt();
        int fator = fatorial;
        while (fator != 1) {
            fatorial = fatorial * (fator -1);
                    fator --;
        }
        System.out.println("o fatorial desse numero é" + fatorial );

    }
}
