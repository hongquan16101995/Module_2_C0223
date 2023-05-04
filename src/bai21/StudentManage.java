package bai21;

import java.util.ArrayList;

public class StudentManage implements Manage<Student>{
    private final ArrayList<Student> students;
    private final ClassroomManage classroomManage;

    public StudentManage() {
        students = new ArrayList<>();
        this.classroomManage = ClassroomManage.getInstanceObject();
    }

    @Override
    public void create() {
        Classroom classroom = classroomManage.findById();
        students.add(new Student(1L, "Dương", classroom));
    }

    @Override
    public ArrayList<Student> findAll() {
        return null;
    }

    @Override
    public Student findById() {
        return null;
    }

    @Override
    public void display() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
