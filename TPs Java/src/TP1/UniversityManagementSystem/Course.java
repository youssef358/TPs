package TP1.UniversityManagementSystem;

public class Course {
    private int courseId;
    private String courseName;
    private Instructor instructor;
    public Course(int id , String name , Instructor i){
        this.courseId = id;
        this.courseName = name;
        this.instructor = i;
    }
    public int getCourseId(){
        return this.courseId;
    }
    public String getCourseName(){
        return this.courseName;
    }
    public Instructor getInstructor(){
        return this.instructor;
    }
    public void afficher(){
        System.out.println("Course ID: " + this.courseId);
        System.out.println("Course Name: " + this.courseName);
        this.instructor.afficher();
    }
}
