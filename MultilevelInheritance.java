class Animal {
    String speciesName;
    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }
}

class Mammal extends Animal {
    boolean hasFur;

    public Mammal(String speciesName, boolean hasFur) {
        super(speciesName); 
        this.hasFur = hasFur;
    }
}

class Dog extends Mammal {
    String breed;

    public Dog(String speciesName, boolean hasFur, String breed) {
        super(speciesName, hasFur); 
        this.breed = breed;
    }


    public void displayInfo() {
        System.out.println("Species: " + speciesName);
        System.out.println("Has Fur: " + hasFur);
        System.out.println("Breed: " + breed);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Canine", true, "Golden Retriever");
        dog.displayInfo();
    }
}
