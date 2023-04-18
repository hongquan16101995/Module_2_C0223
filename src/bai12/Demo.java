package bai12;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("A"));
        products.add(new Product("B"));
        products.add(new Product("C"));
        products.add(new Product("D"));
        products.add(new Product("E"));

//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getName().equals("C")) {
//                products.remove(products.get(i));
//            }
//        }
//
//        for (Product integer : products) {
//            if (integer.getName().equals("C")) {
//                products.remove(integer);
//            }
//        }

        Iterator<Product> productIterator= products.iterator();

        while (productIterator.hasNext()) {
            if (productIterator.next().getName().equals("C")) {
                productIterator.remove();
            }
        }

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
