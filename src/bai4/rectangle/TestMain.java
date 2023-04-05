package bai4.rectangle;

public class TestMain {
    public static void main(String[] args) {
        //khởi tạo đối tượng Rectangle
        Rectangle rec = new Rectangle(10,5);
        //cách gọi phương thức của đối tượng
        System.out.println(rec.getWidth());

        //tính chu vi, diện tích
        int P1 = (rec.getWidth() + rec.getHeight()) * 2;
        System.out.println("Chu vi là: " + P1);

        //thay đổi giá trị của thuộc tính = setter
        rec.setWidth(20);
        System.out.println(rec.getWidth());
        int P2 = (rec.getWidth() + rec.getHeight()) * 2;
        System.out.println("Chu vi sau thay đổi là: " + P2);
    }

    public void m1() {
        System.out.println("HelloWorld");
    }
}
