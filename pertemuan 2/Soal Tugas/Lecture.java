// File        : Lecture.java          02/03/24
// Penulis     : Aditya Haidar Faishal
// Deskripsi   : Membuat class Lecture
import java.util.List;
import java.util.ArrayList;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public void getDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Address    : " + address);
        System.out.println("Employee ID: " + employeeID);
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
        course.setLecture(this);
    }

    public void viewTaughtCourses() {
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }
}
