package abstractClass;
abstract class Vehicle {
    String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    public abstract void startEngine();

    // Concrete method
    public void displayBrand() {
        System.out.println("Vehicle brand: " + brand);
    }
}

class Car extends Vehicle {
    // Constructor
    public Car(String brand) {
        super(brand);
    }

    // Implementation of the abstract method
    @Override
    public void startEngine() {
        System.out.println(brand + " car engine started");
    }
}

class Motorcycle extends Vehicle {
    // Constructor
    public Motorcycle(String brand) {
        super(brand);
    }

    // Implementation of the abstract method
    @Override
    public void startEngine() {
        System.out.println(brand + " motorcycle engine started");
    }
}


public class AbstractClassWithConstructor {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        Vehicle myMotorcycle = new Motorcycle("Harley-Davidson");

        myCar.startEngine();           // Outputs: Toyota car engine started
        myCar.displayBrand();          // Outputs: Vehicle brand: Toyota

        myMotorcycle.startEngine();    // Outputs: Harley-Davidson motorcycle engine started
        myMotorcycle.displayBrand();   // Outputs: Vehicle brand: Harley-Davidson
    }
}
