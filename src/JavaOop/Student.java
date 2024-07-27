package JavaOop;

// Student class
public class Student {
    private String name;
    private String courseTitle;
    private String courseCode;
    private String ID;
    private String email;
    private String assignment;

    // Constructor
    public Student(String name, String courseTitle, String courseCode, String ID, String email, String assignment) {
        this.name = name;
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.ID = ID;
        this.email = email;
        this.assignment = assignment;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Course title: " + courseTitle);
        System.out.println("Course code: " + courseCode);
        System.out.println("ID: " + ID);
        System.out.println("Email: " + email);
        System.out.println("Assignment: " + assignment);
        System.out.println("-----------------------------------");
    }
}
