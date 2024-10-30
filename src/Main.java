import view.StudentView;
import viewmodel.StudentViewModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        StudentViewModel studentViewModel = new StudentViewModel();

        studentView.addAddButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = studentView.getName();
                String age = studentView.getAge();
                String course = studentView.getCourse();
                studentViewModel.addStudent(name, Integer.parseInt(age), course);
                studentView.updateStudentList(studentViewModel.getStudents());
                studentView.getNameField().setText("");
                studentView.getAgeField().setText("");
                studentView.getCourseField().setText("");
            }
        });
    }
}
