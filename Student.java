public class Student {

    // Student attributes
    private String studentId;
    private String name;
    private int age;
    private String email;
    private String course;

    // Constructor
    public Student(String studentId, String name, int age,
                   String email, String course) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    // Register student
    public void registerStudent() {
        System.out.println("Student registered successfully!");
    }

    // Display student details
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
    }

    // Update student details
    public void updateDetails(String name, int age,
                              String email, String course) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;

        System.out.println("Student details updated successfully!");
    }

    // Main method
    public static void main(String[] args) {

        // Create student object
        Student student = new Student(
            "STU001",
            "Ian",
            20,
            "ian@example.com",
            "Software Engineering"
        );

        // Register and display student
        student.registerStudent();
        student.displayDetails();

        // Update student information
        student.updateDetails(
            "Ian",
            20,
            "ian.new@example.com",
            "Computer Science"
        );

        // Display updated information
        student.displayDetails();
    }
}
