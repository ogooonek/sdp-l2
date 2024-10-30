package view;

import model.Student;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class StudentView {
    private JFrame frame;
    private JTextField nameField;
    private JTextField ageField;
    private JTextField courseField;
    private JButton addButton;
    private JTextArea studentListArea;

    public StudentView() {
        frame = new JFrame("Student Management");
        nameField = new JTextField(20);
        ageField = new JTextField(5);
        courseField = new JTextField(20);
        addButton = new JButton("Add Student");
        studentListArea = new JTextArea(10, 30);
        studentListArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Age:"));
        panel.add(ageField);
        panel.add(new JLabel("Course:"));
        panel.add(courseField);
        panel.add(addButton);
        panel.add(new JScrollPane(studentListArea));

        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public String getName() {
        return nameField.getText();
    }

    public String getAge() {
        return ageField.getText();
    }

    public String getCourse() {
        return courseField.getText();
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getAgeField() {
        return ageField;
    }

    public JTextField getCourseField() {
        return courseField;
    }

    public void addAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void updateStudentList(List<Student> students) {
        studentListArea.setText("");
        for (Student student : students) {
            studentListArea.append(student.getName() + " - " + student.getAge() + " - " + student.getCourse() + "\n");
        }
    }
}
