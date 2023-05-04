package bai21;

import java.util.ArrayList;

public interface Manage<E> {
    ArrayList<E> findAll();

    E findById();

    void display();

    void create();
}
