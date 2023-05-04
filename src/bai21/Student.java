package bai21;

public class Student {
    private Long id;
    private String name;
    private Classroom classroom;

    public Student(Long id, String name, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classroom=" + classroom +
                '}';
    }
}
