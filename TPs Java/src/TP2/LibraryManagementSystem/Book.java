package TP2.LibraryManagementSystem;

public class Book {
    protected String title;
    protected String author;
    protected String YearOfPublication;

    public Book(String title, String author, String YearOfPublication) {
        this.title = title;
        this.author = author;
        this.YearOfPublication = YearOfPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYearOfPublication() {
        return this.YearOfPublication;
    }

    public void displayInformation(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year of publication: " + this.YearOfPublication);
    }
}
