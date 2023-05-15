package c10;

import c10_1.Parent;

import java.util.ArrayList;

public class Child extends Parent {

    public Child() {
    }

    public Child(int a) {
        super(a);
        this.a = 100;
    }

    @Override
    public void m1() {
        System.out.println("Bye");
    }

    public void m2() {
        System.out.println(a);
        System.out.println(super.a);
    }

    static class Son {
        public int number;

        public Son(int number) {
            this.number = number;
        }
    }

    class Daughter {
        public int number1;

        public Daughter(int number1) {
            this.number1 = number1;
        }
    }
}
