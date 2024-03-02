// File        : Student.java          02/03/24
// Penulis     : Aditya Haidar Faishal
// Deskripsi   : Membuat class Student
import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public void getDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Address    : " + address);
        System.out.println("Student ID : " + studentID);
    }

    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
        course.addStudent(this);
    }

    public void viewEnrolledCourses() {
        for (Course course : coursesEnrolled) {
            course.getDetails();
        }
    }
}