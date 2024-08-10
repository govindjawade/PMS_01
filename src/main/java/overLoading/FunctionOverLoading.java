package overLoading;
//In Java, function overloading (or method overloading) allows you to have multiple methods in
//the same class with the same name but different parameters (different type, number, or both).
//This helps increase the readability of the program.
public class FunctionOverLoading {// Overloaded method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }
    // Overloaded method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Overloaded method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }
    // Overloaded method with one integer and one double parameter
    public double add(int a, double b) {
        return a + b;
    }
    // Overloaded method with one double and one integer parameter
    public double add(double a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        FunctionOverLoading utils = new FunctionOverLoading();
        System.out.println(utils.add(1, 2));             // Calls method with two int parameters
        System.out.println(utils.add(1, 2, 3));          // Calls method with three int parameters
        System.out.println(utils.add(1.5, 2.5));         // Calls method with two double parameters
        System.out.println(utils.add(1, 2.5));           // Calls method with int and double parameters
        System.out.println(utils.add(1.5, 2));           // Calls method with double and int parameters
    }
}

