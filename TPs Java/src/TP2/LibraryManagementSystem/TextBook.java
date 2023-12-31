package TP2.LibraryManagementSystem;

public class TextBook extends Book{
    private String subject;

    public TextBook(String title, String author, String YearOfPublication, String subject) {
        super(title, author, YearOfPublication);
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void displayInformation() {
        super.displayInformation();
        System.out.println("Subject: " + this.subject);
    }
}
