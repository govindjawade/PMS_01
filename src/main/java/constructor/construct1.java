package constructor;

//In a Selenium test class, constructors are used to initialize WebDriver and any other setup tasks.
//In the Page Object Model (POM), constructors are commonly used to initialize WebDriver and page elements.
// Constructor
// In this example, the LoginPage class constructor initializes the WebDriver and the page elements
// using PageFactory.
// This approach allows for clean and maintainable code.
class Demo {
    int x;
    int y;
    Demo() {
        System.out.println("consturctor DEMO executed");
        x = 5;
        y = 5;
    }

    Demo(int z) {
        System.out.println("constructor overloading" + z);
    }
}

public class construct1 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.x);
        System.out.println(d1.y);
        // Demo d2 = new Demo(5);//error no arguments
        Demo d3 = new Demo(5);
    }

}
