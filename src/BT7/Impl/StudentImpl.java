package BT7.Impl;

import BT7.Student;
import BT7.services.IStudent;
import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements IStudent {
    public static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student("Vuong", "Nam", 30));
        studentList.add(new Student("Yen", "Nu", 31));
        studentList.add(new Student("Chuan", "Nam", 31));
        studentList.add(new Student("Huy", "Nam", 26));
        studentList.add(new Student("Son", "Nam", 33));
    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }
}
