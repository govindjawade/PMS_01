package thisKeyWord;

//In summary, this is a versatile keyword that provides a way to refer to the current
//object, helping to manage context, avoid naming conflicts, and enable method
//chaining and constructor chaining.
class Example {
     int x, y;
    void f1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void display() {
        int x=10;
        System.out.println(this.x);
        System.out.println(this.y);
    }
}
class Example1 extends Example{
    int x,y;
    void f3(int x,int y){
        this.x=x;//it wil point to child
        //super.y=y; //it will point to parent
    }
    void f4(){
        System.out.println(this.x);
        System.out.println(super.y);
    }
}
public class ThisKey {
    public static void main(String[] args) {
        Example e1 = new Example();
        e1.f1(2, 3);
        //System.out.println(x);
        e1.display();
        Example1 e2=new Example1();
        e2.f4();
    }

}
