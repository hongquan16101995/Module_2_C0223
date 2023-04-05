package bai3;

public class InitArray {
    public static void main(String[] args) {
        //khai báo 1 mảng số nguyên
        int [] arr = {1,2,3};
        //có được 1 mảng số nguyên có 3 phần tử
        //index: 0,1,2
        //giá trị ptu tương ứng: 1,2,3

        //khai báo với từ khóa new
        int [] arr1 = new int[5];
        int [] arr2 = new int[]{1,2,2,3};
//        System.out.println(arr2[1]);

        //khai báo mảng 2 chiều
        int [][] arr3  = new int[3][3];
//        System.out.println(arr3[2][2]);



        //sử dụng các phương thức được tạo
        m1();
        m2("CodeGym");
        System.out.println(m3());
        System.out.println(m4("Hà Tĩnh"));
    }

    // khai báo 1 phương thức trong lớp
    // cấu trúc của 1 phương thức:
    // access modifier + non-access + data_type_return + name + parameter
    // access: học bài 5, phạm vi truy cập của phương thức
    // non-access: các từ khóa quy định tính chất của pt
    // data_type_return: kiểu dữ liệu trả về của pt
    // - kdl: int, boolean, String,...
    // - không trả về dữ liệu, không có return: void
    // parameter: tham số; khai báo tham số phải cố kdl đi kèm

    //pt không trả về, không tham số
    public static void m1() {
        System.out.println("HelloWorld");
    }

    //pt không trả về, có tham số
    public static void m2(String value) {
        System.out.println(value);
    }

    //pt có trả về, không tham số
    public static String m3() {
        return "C0223I1";
    }

    //pt có trả về, có tham số
    public static String m4(String value) {
        return value + " Việt Nam";
    }
}
