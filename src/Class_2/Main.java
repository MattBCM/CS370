package Class_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        BankOfQC bankOfQC = new BankOfQC();
        if(bankOfQC.approved()) System.out.println("you're approved");

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        for(Shape shape : shapes)
            shape.draw();


        Account account = new Account();
        account.balance = -1999;


        A a; // only creates a reference
        A z = new A(); // Instance of A
        a = z;
        a.draw();


        A a1 = new A();
        A a2 = a1;
        A a3 = new A();

        /*
        //shows instances are not the same
        if(sameInstance(a1, a2)) System.out.println("Same instance");
        else System.out.println("not the same instance");
         */

        //INHERITANCE (B Extends A)

        // B b1 = new A(); //not valid because B has more methods than A
        A a4 = new B(); // valid because B contains methods of A
        B bb = new C(); // valid as C inherits methods of B and A

        //Draw draw = new Draw(); // cannot instantiate an inheritance without defining method

        Draw d1 = new A(); // valid because A implements the Draw Interface
        Draw d2 = new B(); // valid because B extends A, so it includes the Interface
        Draw d3 = new C(); // valid because C extends B and A, and A includes the Draw Interface
    }
        public static boolean sameInstance (Object a, Object b){
            return a == b;
        }
}
