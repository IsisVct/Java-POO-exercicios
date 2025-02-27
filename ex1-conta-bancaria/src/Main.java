
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o saldo da conta: ");
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        int opcao;
        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$" + conta.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Seu cheque especial disponível é: R$" + conta.consultarChequeEspecial());
                    break;
                case 3:
                    System.out.println("Informe o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.println("Informe o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 5:
                    System.out.println("Informe o valor a ser pago:");
                    double valorBoleto = scanner.nextDouble();
                    conta.pagarBoleto(valorBoleto);
                    break;
                case 6:
                    conta.verificarUsoChequeEspecial();
                    break;
                case 0:
                    System.out.println("Obrigado por usar o sistema bancário. Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
        scanner.close();

    }

}
