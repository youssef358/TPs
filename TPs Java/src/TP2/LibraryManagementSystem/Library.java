package TP2.LibraryManagementSystem;

import java.util.ArrayList;

public class Library {

    protected Book[] books;
    protected int numberOfBooks;
    protected int Capacity;

    public Library(int Capacity) {
        this.Capacity = Capacity;
        this.books = new Book[Capacity];
        this.numberOfBooks = 0;
    }

    public int getNumberOfBooks() {
        return this.numberOfBooks;
    }

    public int getCapacity() {
        return this.Capacity;
    }

    public void addBook(Book b) {
        if (this.numberOfBooks < this.Capacity) {
            this.books[this.numberOfBooks] = b;
            this.numberOfBooks++;
        }
    }

    public void showBooks() {
        for (int i = 0; i < this.numberOfBooks; i++) {
            this.books[i].displayInformation();
        }
    }

    public int searchBook(String title) {
        for (int i = 0; i < this.numberOfBooks; i++) {
            if (this.books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteBook(String title) {
        int index = this.searchBook(title);
        if (index != -1) {
            for (int i = index; i < this.numberOfBooks - 1; i++) {
                this.books[i] = this.books[i + 1];
            }
            this.numberOfBooks--;
        }
    }









}
