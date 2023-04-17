package minitest.test_14_04;

public interface Manage<E> {
    void create();

    void update();

    E deleteById();

    E getById();
}
