package StudentSystem;

public class Main {
    public static void main(String[] args) {
        // Create the school system
        School school = new School();

        // Add National Student
        Student nationalStudent = new NationalStudent("Ali", "N001", 20);
        nationalStudent.addCourse(new Course("CS101", "Intro to Programming", 85, "Dr. Ahmed"));
        nationalStudent.addCourse(new Course("MA101", "Calculus I", 90, "Dr. Omar"));

        // Add IG Student
        Student igStudent = new IgStudent("Mona", "I001", 22);
        igStudent.addCourse(new Course("PH101", "Physics", 88, "Dr. Sara"));
        igStudent.addCourse(new Course("CH101", "Chemistry", 78, "Dr. Khaled"));

        // Add students to the school
        school.addStudent(nationalStudent);
        school.addStudent(igStudent);

        // Display all students
        System.out.println(school);

        // Edit a course for the National Student
        nationalStudent.editCourse("CS101", new Course("CS101", "Advanced Programming", 95, "Dr. Ahmed"));

        // Delete a course for the IG Student
        igStudent.deleteCourse("PH101");

        // Display all students after modifications
        System.out.println("After updates:");
        System.out.println(school);

        // Add a new student
        Student anotherNational = new NationalStudent("Hana", "N002", 19);
        anotherNational.addCourse(new Course("BI101", "Biology", 88, "Dr. Aisha"));
        school.addStudent(anotherNational);

        // Display all students after adding a new student
        System.out.println("After adding a new student:");
        System.out.println(school);

        // Delete a student
        school.deleteStudent("N001");

        // Display all students after deletion
        System.out.println("After deleting a student:");
        System.out.println(school);
    }
}
