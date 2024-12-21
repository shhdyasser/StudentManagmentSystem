package StudentSystem;

import java.util.ArrayList;
public class School {
    private ArrayList<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void editStudent(String id, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.set(i, updatedStudent);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void deleteStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("School Students:\n");
        for (Student student : students) {
            result.append(student).append("\n");
        }
        return result.toString();
    }
}
