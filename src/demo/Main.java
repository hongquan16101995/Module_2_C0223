package demo;

public class Main {

    private final int a = 10;
    private final Product product = new Product("Hello");

    public void m1() {
//        a = 100;
        product.setName("Abc");
    }

    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 1;

        Integer a1 = new Integer("1");
        Integer b1 = new Integer("1");

        Product p1 = new Product("A");
        Product p2 = new Product("A");

        System.out.println(a.equals(b));    // => T - T
        System.out.println(a1.equals(b1));    // => T - F
        System.out.println(p1.equals(p2));    // => T - F
    }
}

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
