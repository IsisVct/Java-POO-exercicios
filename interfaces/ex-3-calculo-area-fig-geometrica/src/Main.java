import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        GeometricForm geometricForm = null;
        while (true) {
            System.out.println("\r\nEscolha uma figura geometrica:");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - Sair");

            option = scanner.nextInt();

            if (option == 1) {
                geometricForm = creatSquare();

            } else if (option == 2) {
                geometricForm = creatRectangle();
            } else if (option == 3) {
                geometricForm = creatCircle();
            } else if (option == 4) {
                System.out.println("Obrigado pela visita! Saindo...");
                break;
            } else {
                System.out.println("opcao invalida");
                continue;
            }
            System.out.println("O resultado da area e: " + geometricForm.getArea());

        }

        scanner.close();
    }

    private static GeometricForm creatSquare() {
        System.out.println("Digite tamanhpo do lado: ");
        double side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm creatRectangle() {
        System.out.println("Digite tamanhpo da base: ");
        double base = scanner.nextDouble();
        System.out.println("Digite tamanhpo da altura: ");
        double height = scanner.nextDouble();
        return new Rectangle(base, height);
    }

    private static GeometricForm creatCircle() {
        System.out.println("Digite tamanhpo do raio: ");
        double radius = scanner.nextDouble();
        return new Circle(radius);
    }

}