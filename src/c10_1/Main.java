package c10_1;

import c10.Child;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parent1 = new Child();
        parent.m1();
        parent1.m1();

    }
}
