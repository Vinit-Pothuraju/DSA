
import java.util.ArrayList;

public class User {
    private int userId;
    private String name;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book b) {
        if (!b.isIssued()) {
            b.markIssued();
            borrowedBooks.add(b);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("This book is already issued.");
        }
    }

    public void returnBook(Book b) {
        if (borrowedBooks.contains(b)) {
            b.markReturned();
            borrowedBooks.remove(b);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("This book was not borrowed by the user.");
        }
    }

    public void getAllBorrowedBooks() {
    if (borrowedBooks.isEmpty()) {
        System.out.println(name + " has not borrowed any books.");
    } else {
        System.out.println(name + "'s Borrowed Books:");
        for (int i = 0; i < borrowedBooks.size(); i++) {
            System.out.print((i + 1) + ") ");
            borrowedBooks.get(i).getDetails(); // This prints details directly
        }
    }
}
}
