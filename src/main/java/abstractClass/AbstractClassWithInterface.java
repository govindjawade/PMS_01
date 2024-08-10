package abstractClass;
//Key Points:
//An abstract class cannot be instantiated.(with help of overriding in child we can acces the abstract class or methods
//An abstract class can have both abstract methods (without body) and concrete methods (with body).
//A subclass of an abstract class must implement all abstract methods, or it must be declared abstract itself.
//Abstract Methods:
//Abstract methods are methods that are declared without an implementation (without braces, and followed by a semicolon).
//abstract class mai (abstract class ka object nahi bana sakte but uske child ka
// to banahi sakte hai and abstract method ka logic nahi likha ja sakta)>>>>>
//Constructors: Abstract classes can have constructors, which are called when an instance of a subclass is created.


abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();
    // Regular method
    public void sleep() {
        System.out.println("This animal is sleeping");
    }
}
class Dog extends Animal {
    // The subclass provides implementation for the abstract method
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
class Cat extends Animal {
    // The subclass provides implementation for the abstract method
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
public class AbstractClassWithInterface {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound(); // Outputs: The dog barks
        myDog.sleep();     // Outputs: This animal is sleeping
        myCat.makeSound(); // Outputs: The cat meows
       myCat.sleep();     // Outputs: This animal is sleeping
    }
}
