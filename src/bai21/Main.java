package bai21;

public class Main {
    public static void main(String[] args) {
        Manage studentManage = ManageFactory.getInstance("STUDENT");
        Manage classroomManage = ManageFactory.getInstance("CLASSROOM");
        classroomManage.create();
        classroomManage.display();
        studentManage.create();
        studentManage.display();
    }
}
