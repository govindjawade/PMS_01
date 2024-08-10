package inheritance;
class Nokia11 {
    int x, y;
    void f1() {
        System.out.println("parrent 1 executed");
    }
    void f2() {
        System.out.println("parrent 2 executed");
    }
    Nokia11() {
        System.out.println("Parrent constructor ");
    }
}
class Nokia22 extends Nokia11 {
    int z;
    void f3() {
        System.out.println("child executed");
    }
    Nokia22() {
       // super();//to call parrent constructor
        System.out.println("child constructor");
    }
}
public class InheritanceUsingConstructor {
    public static void main(String[] args) {
        Nokia22 n22 = new Nokia22();//by defaoult it will execute parent agar humne child constr calling child first and executing parrent to child

    }
}