package bai4;

import java.util.Scanner;

public class CalculatorRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài của hình chữ nhật: ");
        int width = scanner.nextInt();
        System.out.println("Nhập vào chiều rộng của hình chữ nhật: ");
        int height = scanner.nextInt();
        int P = (width + height) * 2;
        int S = width * height;
        System.out.println("Chu vi là: " + P);
        System.out.println("Diện tích là: " + S);
    }
}
