package c10;

public class MainTest {
    public static void main(String[] args) {
        Child.Son son = new Child.Son(100);
        System.out.println(son.number);

        Child child = new Child();
        Child.Daughter daughter = child.new Daughter(200);
        System.out.println(daughter.number1);
    }
}
