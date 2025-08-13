import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

        System.out.println("📚 Welcome to the Library Management System 📚");

        do {
            System.out.println("\n-------- MENU --------");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show Available Books");
            System.out.println("6. Show Borrowed Books of User");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    Book newBook = new Book(bookId, title, author);
                    library.addBook(newBook);
                    System.out.println("✅ Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();
                    User newUser = new User(userId, name);
                    library.registerUser(newUser);
                    System.out.println("✅ User registered successfully!");
                    break;

                case 3:
                    System.out.print("Enter User ID: ");
                    int issueUserId = sc.nextInt();
                    System.out.print("Enter Book ID: ");
                    int issueBookId = sc.nextInt();
                    library.issueBook(issueUserId, issueBookId);
                    break;

                case 4:
                    System.out.print("Enter User ID: ");
                    int returnUserId = sc.nextInt();
                    System.out.print("Enter Book ID: ");
                    int returnBookId = sc.nextInt();
                    library.returnBook(returnUserId, returnBookId);
                    break;

                case 5:
                    library.showAvailableBooks();
                    break;

                case 6:
                    System.out.print("Enter User ID: ");
                    int showUserId = sc.nextInt();
                    library.showBorrowedBooks(showUserId);
                    break;

                case 0:
                    System.out.println("👋 Exiting... Thank you for using the Library Management System!");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
