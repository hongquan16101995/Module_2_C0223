package demo;

public class Demo {
    private static int a = 1;
    private int b = 10;

    public void m1() {
        System.out.println(a);
        System.out.println(b);
        m2();
    }

    public static void m2() {
        System.out.println(a);
//        System.out.println(b);
//        m1();
    }
}

class Test extends Demo{

    public void m1() {
        System.out.println("Hello");
    }

    public void m1(int a, String b) {
        System.out.println("Bye bye");
    }

    public void m1(String b,int a) {
        System.out.println("Bye bye");
    }

    public void m1(int a, String b, int c) {
        System.out.println("Bye bye");
    }

    public void m1(int a, String b, double c) {
        System.out.println("Bye bye");
    }
}
