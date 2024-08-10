package overLoading;
//Key Points:
//The method in the subclass must have the same name, return type, and parameters as the method in the superclass.
//The method in the superclass must be accessible (public or protected).
//Method overriding is used to provide a specific implementation of a method that is already defined in its superclass.
class Animal {
    void makeSound() {
        System.out.println("animal make sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("dod bark");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("cat meows");
    }
}

public class FunctionOverRiding {
    public static void main(String[] args) {
    Animal myanimal=new Animal();
    myanimal.makeSound();
    Dog mydog=new Dog();
    mydog.makeSound();
    }
}
