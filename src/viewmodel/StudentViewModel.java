package viewmodel;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentViewModel {
    private List<Student> students;

    public StudentViewModel() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, int age, String course) {
        Student student = new Student(name, age, course);
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}
