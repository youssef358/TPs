package TP2.LibraryManagementSystem;

public class Teacher extends Person implements LibraryUser{
    private LibraryCard libraryCard;
    private int teacherId;
    private Library BorrowedBooks;

    public Teacher(String name, int age, int teacherId, int capacity, int date) {
        super(name, age);
        this.teacherId = teacherId;
        this.libraryCard = new LibraryCard(this, date, capacity);
    }

    public void borrowBook(Book book, Library library, int borrowDate) {
        if (borrowDate > this.libraryCard.getExpirationDate()) {
            System.out.println("Your card has expired");
        } else if (this.libraryCard.getLimit() == 0) {
            System.out.println("You have reached your limit");
        } else {
            this.libraryCard.setLimit(this.libraryCard.getLimit() - 1);
            this.BorrowedBooks = library;
            this.BorrowedBooks.addBook(book);
        }
    }

    public void returnBook(Book book, int returnDate) {
        if (returnDate > this.libraryCard.getExpirationDate()) {
            System.out.println("Your card has expired");
        } else {
            this.libraryCard.setLimit(this.libraryCard.getLimit() + 1);
            this.BorrowedBooks.deleteBook(book.getTitle());
        }
    }
    public int getTeacherId() {
        return this.teacherId;
    }

    public void showTeacher(){
        System.out.println("Teacher: " + this.getName() + " Age: " + this.getAge() + " Teacher ID: " + this.getTeacherId());
        System.out.println("Card Number: " + this.libraryCard.getCardNumber() + " Expiration Date: " + this.libraryCard.getExpirationDate() + " Limit: " + this.libraryCard.getLimit());
        System.out.println("Borrowed Books:");
        this.BorrowedBooks.showBooks();
    }

}
