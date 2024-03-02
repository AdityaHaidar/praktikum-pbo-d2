// File        : Course.java          02/03/24
// Penulis     : Aditya Haidar Faishal
// Deskripsi   : Membuat class Course

import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.studentsEnrolled = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentsEnrolled.add(student);
    }

    public void removeStudent(Student student) {
        studentsEnrolled.remove(student);
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public void viewEnrolledStudents() {
        for (Student student : studentsEnrolled) {
            student.getDetails();
        }
    }

    public void getDetails() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        lecture.getDetails();
    }
}