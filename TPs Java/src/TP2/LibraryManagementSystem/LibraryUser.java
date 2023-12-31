package TP2.LibraryManagementSystem;

public interface LibraryUser {
    public void borrowBook(Book book, Library library, int borrowDate);
    public void returnBook(Book book, int returnDate);
}
