package TP2.LibraryManagementSystem;

public class Student extends Person implements LibraryUser{
    private LibraryCard libraryCard;
    private int studentId;
    private Library borrowedBooks;
    public Student(String name, int age, int studentId, int capacity, int date) {
        super(name, age);
        this.studentId = studentId;
        this.libraryCard = new LibraryCard(this, date, capacity);
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void borrowBook(Book book, Library library, int borrowDate) {
        if (borrowDate > this.libraryCard.getExpirationDate()) {
            System.out.println("Your card has expired");
        } else if (this.libraryCard.getLimit() == 0) {
            System.out.println("You have reached your limit");
        } else {
            this.libraryCard.setLimit(this.libraryCard.getLimit() - 1);
            this.borrowedBooks = library;
            this.borrowedBooks.addBook(book);
        }
    }

    public void returnBook(Book book, int returnDate) {
        if (returnDate > this.libraryCard.getExpirationDate()) {
            System.out.println("Your card has expired");
        } else {
            this.libraryCard.setLimit(this.libraryCard.getLimit() + 1);
            this.borrowedBooks.deleteBook(book.getTitle());
        }
    }
}
