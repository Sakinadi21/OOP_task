package JavaOop;

// IIT class
public class IIT {
    public static void main(String[] args) {
        // Static method
        System.out.println("Welcome to NSTU-18th & IIT-6th Batch");

        System.out.println("Year 1 Term 2");
        System.out.println("Our vision: To create competent and skilled intellectual IT professionals specifically for planning strategically," +
                " implementing and managing IT systems along with empowerment, " +
                "enhancement and engagement of the academic," +
                " support and research activities.");
        System.out.println("Web address: https://nstu.edu.bd/IIT.html");
        System.out.println("Our Respected Sirs' information is given below");

        // Create Teacher objects with the given details
        Teacher teacher1 = new Teacher(
                "Rafid Mustafiz",
                "Object Oriented Concept I",
                "SE1213",
                "Lecturer",
                "Deep Learning, Computer Vision, Medical Imaging, Artificial intelligence",
                "01684796722",
                "rafid.iit@nstu.edu.bd");

        Teacher teacher2 = new Teacher(
                "Md Hasan Imam",
                "Data Structure",
                "CSE1201",
                "Lecturer",
                "IoT, Cloud Computing, Cryptography",
                "+8801812357619",
                "hasan.imam@nstu.edu.bd");

        Teacher teacher3 = new Teacher(
                "Mohammed Nuruzamman Bhuiyan",
                "Introduction to Software Engineering",
                "SE1113",
                "Assistant Professor",
                "IoT, Cyber Security, E-Commerce",
                "+8801612032781",
                "nuruzzaman.iit@nstu.edu.bd");

        Teacher teacher4 = new Teacher(
                "Dr. Mohammad Salim Hossain",
                "Soft Skill Communication",
                "GE1109",
                "Professor",
                "Deep learning",
                "+8801711200410",
                "pharmasalim@nstu.edu.bd");

        Teacher teacher5 = new Teacher(
                "Md. Iftekhar Alam Efat",
                "Soft Skill Communication",
                "GE1109",
                "Assistant Professor",
                "Software Reusability & Architecture, Machine Learning, IoT, Big Data & Data Science",
                "+8801727208714",
                "iftekhar.iit@nstu.edu.bd");

        Teacher teacher6 = new Teacher(
                "Sudeb Babu Sen Omit",
                "Computer Organization",
                "CSE1203",
                "Lecturer",
                "Deep Learning",
                "+8801767135034",
                "omit.iit@nstu.edu.bd");

        // Display the teacher details
        teacher1.displayDetails();
        teacher2.displayDetails();
        teacher3.displayDetails();
        teacher4.displayDetails();
        teacher5.displayDetails();
        teacher6.displayDetails();

        // Create a Student object with the given details
        Student student = new Student(
                "Sakiba Belal",
                "Object Oriented Concept I",
                "SE1213",
                "01",
                "sakiba2518@student.nstu.edu.bd",
                "Assignment 1");

        // Display the student details
        student.displayDetails();
    }
}
