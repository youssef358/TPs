package TP1.UniversityManagementSystem;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Student(int id , String fn , String ln) {
        this.studentId = id;
        this.firstName = fn;
        this.lastName = ln;
    }

    public int getStudentId() {
        return (this.studentId);
    }

    public String getFirstName() {
        return (this.firstName);
    }

    public String getLastName() {
        return (this.lastName);
    }

    public ArrayList<Course> getCourses() {
        return (this.courses);
    }

    public void enroll(Course x) {
        this.courses.add(x);
    }

    public void afficher(){
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.firstName + " " + this.lastName);
        System.out.println("Student courses: ");
        int i = 1;
        for(Course c : courses){
            System.out.println("Course " + i + ":");
            c.afficher();
            i++;
        }
    }
}
