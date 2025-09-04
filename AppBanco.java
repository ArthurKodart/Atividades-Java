import java.util.Scanner;

public class AppBanco {
    public static void main(String[] args) {
        String nome = "Maria Fernandes Sousa";
        String tipoConta = "Corrente";
        double saldo = 2000;
        Scanner leitura = new Scanner(System.in);
        double valorTransferência = 0;
        String inicializar = """
                ***********************
                Dados iniciais do cliente:
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ***********************
                """.formatted(nome, tipoConta, saldo);
        System.out.println( inicializar );
        int opcao =0;
        int i =0 ;
        while (i!= 1) {
            String menu = """
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """;
            System.out.println(menu);
            System.out.println("Digite a opção desejada:");
            opcao = leitura.nextInt();
            switch (opcao){
                case 1:
                    System.out.println(saldo);
                    break;
                case 2:
                    System.out.println("digite o valor desejado");
                    System.out.println("você tem \n" + saldo);
                    valorTransferência = leitura.nextDouble();
                    saldo += valorTransferência;
                    System.out.println("você tem \n" + saldo);
                    break;
                case 3:
                    System.out.println("digite o valor desejado");
                    System.out.println("você tem \n" + saldo);
                    valorTransferência = leitura.nextDouble();
                    saldo -= valorTransferência;
                    System.out.println("você tem \n" + saldo);
                    break;
                case 4:
                    i = 1;
                    break;
                default:
                    System.out.println("Opção inexistente");
                    break;
            }
        }
    }
}
