# Sangrahalay - Library Management System

## 📌 Project Overview

Sangrahalay is a **Maven-based Library Management System** built using **Java and Swing**. It provides a **Graphical User Interface (GUI)** to manage books, members, and book transactions efficiently. The system includes functionalities to **add books, add members, issue books, and return books** with a clean and professional UI.

## 📁 Folder Structure

```
Sangrahalay/
├── src/
│   ├── main/
│   │   ├── java/com/sangrahalay/
│   │   │   ├── gui/            # GUI components
│   │   │   │   ├── LibraryGUI.java
│   │   │   │   ├── AddBookDialog.java
│   │   │   │   ├── AddMemberDialog.java
│   │   │   │   ├── IssueBookDialog.java
│   │   │   │   ├── ReturnBookDialog.java
│   │   │   ├── managers/       # Business logic & database handling
│   │   │   │   ├── BookManager.java
│   │   │   │   ├── MemberManager.java
│   │   │   │   ├── IssueManager.java
│   │   │   │   ├── DatabaseManager.java
│   │   │   ├── models/         # Data models
│   │   │   │   ├── Book.java
│   │   │   │   ├── Member.java
│   │   │   │   ├── IssuedBook.java
│   │   │   ├── Main.java       # Entry point
│   │   ├── resources/
│   │   │   ├── database.properties
│   │   │   ├── books.sql
│   │   │   ├── members.sql
│   ├── test/                   # JUnit tests
│
├── pom.xml                      # Maven dependencies
├── README.md                    # Documentation
└── .gitignore                    # Ignore files
```

## 🎯 Features

✅ **Add Books**: Store book details (title, author, ISBN).\
✅ **Add Members**: Register new members with name & email.\
✅ **Issue Books**: Assign books to members.\
✅ **Return Books**: Handle book returns with validation.\
✅ **Graphical User Interface (GUI)**: User-friendly interface for seamless management.\
✅ **Database Management**: Uses a database manager for handling data efficiently.

## 🛠 Technologies Used

- **Java** (JDK 11+)
- **Swing (GUI)**
- **Maven** (Build Automation)
- **MySQL** (Database)
- **JUnit** (Testing)

## 🚀 Getting Started

### 1️⃣ Prerequisites

Ensure you have the following installed:

- **Java JDK 11+**
- **Maven**
- **SQLite/MySQL** (for database support)

### 2️⃣ Clone Repository

```sh
git clone https://github.com/omii1908/Sangrahalay.git
cd Sangrahalay
```

### 3️⃣ Build & Run

#### Using Maven

```sh
mvn clean install
java -cp target/Sangrahalay.jar com.sangrahalay.Main
```

#### Using IDE (IntelliJ/Eclipse)

1. Open the project.
2. Build the project using Maven (`mvn clean install`).
3. Run `Main.java`.

## 📷 Screenshots



## 🤝 Contributing

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -m "Added feature"`).
4. Push to the branch (`git push origin feature-name`).
5. Open a **Pull Request**.
