package bai21;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomManage implements Manage<Classroom> {
    private final ArrayList<Classroom> classrooms;
    private final Scanner scanner = new Scanner(System.in);
    private static ClassroomManage classroomManage;

    private ClassroomManage() {
        classrooms = new ArrayList<>();
        classrooms.add(new Classroom(1L, "C02I1"));
    }

    public static ClassroomManage getInstanceObject() {
        if (classroomManage == null) {
            classroomManage = new ClassroomManage();
        }
        return classroomManage;
    }

    @Override
    public void create() {
        System.out.println("Nhập id");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        classrooms.add(new Classroom(id, name));
    }

    @Override
    public ArrayList<Classroom> findAll() {
        return null;
    }

    @Override
    public Classroom findById() {
        System.out.println("Nhập id muốn:");
        Long id = Long.parseLong(scanner.nextLine());
        for (Classroom classroom : classrooms) {
            if (classroom.getId().equals(id)) {
                return classroom;
            }
        }
        return null;
    }

    @Override
    public void display() {
        for (Classroom classroom : classrooms) {
            System.out.println(classroom);
        }
    }
}
