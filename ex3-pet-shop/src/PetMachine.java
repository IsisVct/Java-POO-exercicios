public class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na maquina para inicar o banho.");
            return;
        }
        this.water -= 3;
        this.shampoo -= 1;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " foi limpo.");
    }

    public void addWater() {
        if (this.water == 30) {
            System.out.println("A capacidade de agua ja esta cheia.");
        }
        water += 2;
    }

    public void addShampoo() {
        if (this.shampoo == 10) {
            System.out.println("A capacidade de shampoo ja esta cheia.");
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (clean == false) {
            System.out.println("A maquina precisa ser limpa.");
        }
        if (hasPet()) {

        }
        this.pet = pet;
        System.out.println("o pet " + pet.getName() + " ja esta na maquina.");

    }

    public void removePet() {
        if (this.pet == null) {
            System.out.println("Nao tem pet na maquina.");
            return;
        }
        this.clean = this.pet.isClean();
        System.out.println("O pet " + pet.getName() + " foi retirado.");
        this.pet = null;
    }

    public void washMachine() {
        if (this.water == 0 || this.shampoo == 0) {
            System.out.println("A maquina nao pode ser limpa pois nao tem agua ou shampoo.");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina foi limpa.");
    }

}
