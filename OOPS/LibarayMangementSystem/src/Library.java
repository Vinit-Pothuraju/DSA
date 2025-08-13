import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    // Add a new book
    public void addBook(Book b) {
        books.add(b);
    }

    // Register a new user
    public void registerUser(User u) {
        users.add(u);
    }

    // Issue a book to a user
    public void issueBook(int userId, int bookId) {
        User user = findUserById(userId);
        Book book = findBookById(bookId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        user.borrowBook(book); // borrowBook already checks if it's issued
    }

    // Return a book from a user
    public void returnBook(int userId, int bookId) {
        User user = findUserById(userId);
        Book book = findBookById(bookId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        user.returnBook(book); // returnBook already checks if user has it
    }

    // Show available books
    public void showAvailableBooks() {
        System.out.println(" Available Books:");
        boolean found = false;
        for (Book book : books) {
            if (!book.isIssued()) {
                book.getDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available books.");
        }
    }

    // Show books borrowed by a user
    public void showBorrowedBooks(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            user.getAllBorrowedBooks();
        } else {
            System.out.println("User not found.");
        }
    }

    // 🔍 Helper: Find user by ID
    private User findUserById(int id) {
        for (User u : users) {
            if (u.getUserId() == id) return u;
        }
        return null;
    }

    // 🔍 Helper: Find book by ID
    private Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }
}
