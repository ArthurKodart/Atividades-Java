package com.carros.br;

public class Carro {
    //Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
    // Implemente métodos para definir o nome do modelo,os preços médios para cada ano,
    // e calcular e exibir o menor e o maior preço .
    // Adicione uma subclasse ModeloCarro para criar instâncias específicas,
    // utilizando-a na classe principal para definir preços e mostrar informações.
    private String nome;
    private int ano1,ano2,ano3;
    private double preco1,preco2,preco3;

    public Carro (String nome, int ano1, int ano2, int ano3, double preco1, double preco2, double preco3){
        this.nome = nome;
        this.ano1 = ano1;
        this.ano2 = ano2;
        this.ano3 = ano3;
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
        // voce pode usar esse tipo de metodo para informar as caracteristicas de um objeto
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno1() {
        return ano1;
    }

    public void setAno1(int ano1) {
        this.ano1 = ano1;
    }

    public int getAno2() {
        return ano2;
    }

    public void setAno2(int ano2) {
        this.ano2 = ano2;
    }

    public int getAno3() {
        return ano3;
    }

    public void setAno3(int ano3) {
        this.ano3 = ano3;
    }

    public double getPreco1() {
        return preco1;
    }

    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }

    public double getPreco2() {
        return preco2;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }

    public double getPreco3() {
        return preco3;
    }

    public void setPreco3(double preco3) {
        this.preco3 = preco3;
    }
//lembre de usar private em todos, alem disso voce pose colocar um em cada linha

    public void calcularPrecos() {
        // eu posso declarar coisas especificas dentro dos metodos como salvar os valores de maximo e minimo
        double maisCaro = Math.max(preco1, Math.max(preco2, preco3));
        // o Math.max e min so aceitam 2 valores para comparar e retornam o maior
        // assim se voce estiver trabalhando com mais de um é so usar um max dentro do outro
        double maisBarato = Math.min(preco1, Math.min(preco2, preco3));
        System.out.println("o carro mais barato custa: " + maisBarato);
        System.out.println("o carro mais caro custa: " + maisCaro);

    }
}
