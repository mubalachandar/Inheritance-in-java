class Vehicle {
    String make;
    String model;
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayCarInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    String type;

    public Bike(String make, String model, String type) {
        super(make, model);
        this.type = type;
    }

    public void displayBikeInfo() {
        System.out.println("Bike Make: " + make);
        System.out.println("Bike Model: " + model);
        System.out.println("Bike Type: " + type);
    }
}

public class  HierarchicalInheritance {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);
        car.displayCarInfo();
        System.out.println(); 
        Bike bike = new Bike("Yamaha", "R1", "Sport");
        bike.displayBikeInfo();
    }
}
