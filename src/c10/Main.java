package c10;

import c10_1.Parent;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Parent parent = new Parent();
////        System.out.println(parent.a);
//        Child child = new Child(200);
//        child.m2();

        //casting
        Parent p1 = new Parent();
        Parent p2 = new Child(); //ép kiểu ngầm định - upcasting
//        Child c1 = new Parent();
        Child c2 = new Child();
        Child c3 = null;
        if (p2 instanceof Child) {
            c3 = (Child) p2; //ép kiểu tường minh - downcasting
        }
        if (c3 != null) {
            c3.m2();
        }
        System.out.println(p1.equals(p2)); //F
        System.out.println(p1 == p2); //F

        Integer i1 = 10;
        Integer i2 = new Integer(10);
        System.out.println(i1.equals(i2));
        System.out.println(i1 == i2);
        System.out.println(i1);
        System.out.println(i2);
    }
}
