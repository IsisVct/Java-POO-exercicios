import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) throws Exception {
        var option = -1;
        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a maquina com agua");
            System.out.println("3 - Abastecer a maquina com  shampoo");
            System.out.println("4 - Verificar nivel de agua da maquina");
            System.out.println("5 - Verificar nivel de shampoo da maquina");
            System.out.println("6 - Verificar se tem pet na maquina");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da maquina");
            System.out.println("9 - Limpar maquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            switch (option) {

                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> checkWater();
                case 5 -> checkShampoo();
                case 6 -> checkHasPet();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                case 0 -> System.out.println("Obrigado pela visita! Saiindo...");
                default -> System.out.println("Opção inválida.");
            }

        } while (option != 0);
    }

    private static void checkShampoo() {
        var amout = petMachine.getShampoo();
        System.out.println("A maquina tem " + amout + " litros de shampoo.");
    }

    private static void checkWater() {
        var amout = petMachine.getWater();
        System.out.println("A maquina tem " + amout + " litros de agua.");
    }

    private static void checkHasPet() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na maquina" : "Nao tem pet na maquina");
    }

    private static void setShampoo() {
        System.out.println("Tentando abastecer a maquina com shampoo.");
        petMachine.addShampoo();
    }

    private static void setWater() {
        System.out.println("Tentando abastecer a maquina com agua.");
        petMachine.addWater();
    }

    private static void setPetInMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("informe o nome do pet: ");
            name = scanner.next();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na maquina.");
    }
}
