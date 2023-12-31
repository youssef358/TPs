package TP2.LibraryManagementSystem;

public class Novel extends Book{
    private String type;
    private String Summary;

    public Novel(String title, String author, String YearOfPublication, String type, String summary) {
        super(title, author, YearOfPublication);
        this.type = type;
        this.Summary = summary;
    }

    public String getType() {
        return this.type;
    }

    public String getSummary() {
        return this.Summary;
    }

    public void displayInformation() {
        super.displayInformation();
        System.out.println("Type: " + this.type);
        System.out.println("Summary: " + this.Summary);
    }
}
