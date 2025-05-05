import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.00;
        double valor;
        int opcao;

        do {
            System.out.println("\n---Caixa Eletrônico---");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1: // Mostrar saldo atual
                    System.out.println("Seu saldo atual é de: R$ " + saldo);
                    break;
                case 2: // Depositar (Validar valor)
                    System.out.println("Quantia a ser depositada: ");
                    valor = scanner.nextDouble();
                    if (valor > 0) {
                        saldo += valor;
                        System.out.println("Deposito Realizado!");
                    }
                    else {
                        System.out.println("Valor inválido! Tente novamente.");
                    }
                    break;
                case 3: // Sacar (Validar valor e saldo)
                    System.out.println("Quantia a ser sacada: ");
                    valor = scanner.nextDouble();
                    if (valor > 0 && valor <= saldo) {
                        saldo -= valor;
                        System.out.println("Saque Realizado!");
                    }
                    else {
                        System.out.println("Valor inválido! Tente novamente.");
                    }
                    break;
                case 4: // Encerrar atividade
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
