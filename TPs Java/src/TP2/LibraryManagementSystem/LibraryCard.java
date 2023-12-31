package TP2.LibraryManagementSystem;

public class LibraryCard {
    protected String name;
    protected int limit;
    protected int cardNumber;
    protected int expirationDate;

    public LibraryCard(Person person, int expirationDate, int limit) {
        if (person instanceof Student) {
            this.cardNumber = ((Student) person).getStudentId();
        } else if (person instanceof Teacher) {
            this.cardNumber = ((Teacher) person).getTeacherId();
        }
        this.expirationDate = expirationDate;
        this.limit = limit;
        this.name = person.getName();
    }

    public int getCardNumber() {
        return this.cardNumber;
    }

    public int getExpirationDate() {
        return this.expirationDate;
    }

    public int getLimit() {
        return this.limit;
    }

    public String getName() {
        return this.name;
    }

    public void setLimit(int i) {
        this.limit = i;
    }
}
