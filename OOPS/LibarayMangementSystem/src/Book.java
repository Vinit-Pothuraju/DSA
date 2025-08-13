

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false; // Default: not issued
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    // Setters
    public void markIssued() {
        isIssued = true;
    }

    public void markReturned() {
        isIssued = false;
    }

    // Display book details
    public void getDetails() {
        System.out.println("Book ID          : " + id);
        System.out.println("Title            : " + title);
        System.out.println("Author           : " + author);
        System.out.println("Availability     : " + (isIssued ? "Issued" : "Available"));
    }
}
