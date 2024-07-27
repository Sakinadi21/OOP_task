package JavaOop;

// Teacher class
public class Teacher {
    private String name;
    private String courseTitle;
    private String courseCode;
    private String designation;
    private String researchAreas;
    private String contactNumber;
    private String email;

    // Constructor
    public Teacher(String name, String courseTitle, String courseCode, String designation, String researchAreas, String contactNumber, String email) {
        this.name = name;
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.designation = designation;
        this.researchAreas = researchAreas;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    // Method to display teacher details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Course title: " + courseTitle);
        System.out.println("Course code: " + courseCode);
        System.out.println("Designation: " + designation);
        System.out.println("Research Areas: " + researchAreas);
        System.out.println("Contact number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("-----------------------------------");
    }
}
