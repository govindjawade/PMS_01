package inheritance;

class Nokia1 {
    int x, y;

    void f1() {
        System.out.println("parrent 1 executed");
    }

    void f2() {
        System.out.println("parrent 2 executed");
    }
}

class Nokia2 extends Nokia1 {
    int z;

    void f3() {
        System.out.println("child executed");
    }
}

class Nokia3 extends Nokia1 {
    int h;

    void f4() {
        System.out.println("child 2 executed");
    }
}

public class SignleInheritance {

    public static void main(String[] args) {

        Nokia22 n2 = new Nokia22();
        n2.f1();
        n2.f2();
        n2.f3();
        Nokia3 n3= new Nokia3();
        n3.f4();
     //   n3.f3();//not a member of Nokia3
    }
}
