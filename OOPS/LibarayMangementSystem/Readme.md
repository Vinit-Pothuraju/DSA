# 📚 Library Management System

A console-based Library Management System developed in Java using core **Object-Oriented Programming (OOP)** principles. This project is ideal for beginners to practice **classes**, **objects**, **inheritance**, **polymorphism**, and more.

---

## 🧠 Features

- ➕ Add new books to the library  
- 👤 Register new users  
- 📖 Issue books to users  
- 🔄 Return books to the library  
- 📃 View available books  
- 📋 View books borrowed by a user  
- ❌ Handles invalid input using exceptions  

---

## 🛠 Tech Stack

- Language: **Java**
- Environment: **Console / Terminal**
- IDE: IntelliJ / Eclipse / VS Code (any)

---

## 🗂 Project Structure
LibraryManagementSystem/
│
├── src/                      
│   ├── Main.java              
│   ├── models/               
│   │   ├── Book.java          
│   │   └── User.java         
│   ├── services/          
│   │   └── Library.java       
│   ├── utils/               
│   │   └── InputHandler.java  
│
├── data/                    
│   ├── books.txt            
│   └── users.txt              
│
├── README.md                
└── .gitignore               
---
## 📚 Project Description:
Create a console-based application to manage a library where users can:

Add books

Issue books

Return books

View available books

Register new users

Show borrowed books by a user

## 🗂️ Suggested Class Structure:
1. Book class
Properties: bookId, title, author, isIssued
Methods: getDetails(), markIssued(), markReturned()

2. User class
Properties: userId, name, borrowedBooks
Methods: borrowBook(Book), returnBook(Book)

3. Library class
Properties: List<Book> books, List<User> users
Methods:

addBook(Book)

registerUser(User)

issueBook(userId, bookId)

returnBook(userId, bookId)

showAvailableBooks()

showBorrowedBooks(userId)

4. Main class (contains the menu and user interaction)
## 🔍 OOP Concepts Used

| Concept         | Description                                               |
|----------------|-----------------------------------------------------------|
| Class & Object  | `Book`, `User`, and `Library` classes                    |
| Encapsulation   | Private fields and public getters/setters                |
| Inheritance     | Extend user role for Admin (optional enhancement)        |
| Polymorphism    | Method overriding for different user types               |
| Abstraction     | Optional: Use interfaces for role-based access           |
| Exception Handling | Custom error messages for invalid input              |

---

## 🚀 How to Run

1. Clone or download this repo  
2. Open in your Java IDE  
3. Navigate to `Main.java`  
4. Run the program and interact via console  

---

## 📅 Suggested Timeline (7 Days)

| Day | Task |
|-----|------|
| Day 1 | Design classes and relationships |
| Day 2 | Build `Book` and `User` classes |
| Day 3 | Build core `Library` logic |
| Day 4 | Add menu & interaction via console |
| Day 5 | Implement exception handling |
| Day 6 | (Optional) Add Admin role or file I/O |
| Day 7 | Test, refactor, and document your code |

---

## 🧪 Sample Menu (Console)

Welcome to the Library System 📚

Add Book

Register User

Issue Book

Return Book

View Available Books

View Borrowed Books by User

Exit

yaml
Copy
Edit

---

## 🙌 Author

**Vinit Kumar Pothuraju**  
[LinkedIn](https://linkedin.com/in/your-profile) • [GitHub](https://github.com/your-profile)

---

## 📃 License

This project is open-source and free to use for learning purposes.