package TP1.UniversityManagementSystem;

public class Instructor {
    private int instructorId;
    private String firstName;
    private String lastName;
    public Instructor(int Id , String fn, String ln){
        this.instructorId = Id;
        this.firstName = fn;
        this.lastName = ln;
    }
    public int getInstructorId(){
        return(this.instructorId);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void afficher(){
        System.out.println("Instructor ID: " + this.instructorId );
        System.out.println("Instructor Name: " + this.firstName + " " +this.lastName);
    }
}
