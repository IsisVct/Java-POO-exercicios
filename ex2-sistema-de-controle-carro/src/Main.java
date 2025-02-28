import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        int opcao;

        do {
            System.out.println("\n===== MENU DO CARRO =====");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Colocar no ponto morto");
            System.out.println("6 - Virar para esquerda/direita");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Ver estado do carro");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro.ligar();
                    System.out.println("Carro ligado!");
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.diminuirVelocidade();
                    break;
                case 5:
                    carro.colocarNoPontoMorto();
                    break;
                case 6:
                    carro.virarParaEsquerdaOuDireita();
                    break;
                case 7:
                    carro.verificarVelocidade();
                    break;
                case 8:
                    carro.estadoAtual();
                    break;
                case 9:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 9);

        scanner.close();
    }
}
