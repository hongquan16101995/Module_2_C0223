package bai21;

public class ManageFactory {
    public static Manage getInstance(String name) {
        if (name.equals("STUDENT")) {
            return new StudentManage();
        } else {
            return ClassroomManage.getInstanceObject();
        }
    }
}
