/*
Aim:  Implement a program using Encapsulation, Abstraction, and an Array of Objects. 

Problem Statement:
 A school is developing a library management system to maintain the records of the books. 
 Where it performs basic operations such as making an entry in the book, searching the book by book name 
 and author name. It also shows the availability of the books. 

 Tasks: 
Create a class to manage the books in "Library" with the following data members(Instance Variables) 
and functions(methods) . 
    - Name of the book
    - Author of the book
    - Price of the book
    - No. of copies 

Implement member functions(methods) to perform the following operations (using an array of objects): 
    1. Read the data of 5 books - include books in the library. 
    2. Display the data of books - print the list of all the books in the library. 
    3. Search the specified book in the Library by name, if it is available or not, if available then 
    display no of copies of the book. 
    4. Search the specified book in the Library by Author Name, display all the books of the same author. 
*/

import java.util.Scanner;

class Library {

    // Encapsulated data members
    private String bookName;
    private String author;
    private double price;
    private int copies;

    // Method to read book details
    void readBook() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();

        System.out.print("Enter Number of Copies: ");
        copies = sc.nextInt();
        sc.nextLine(); // clear buffer
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Book Name   : " + bookName);
        System.out.println("Author      : " + author);
        System.out.println("Price       : " + price);
        System.out.println("Copies      : " + copies);
        System.out.println("----------------------------");
    }

    // Getter methods (for searching)
    String getBookName() {
        return bookName;
    }

    String getAuthor() {
        return author;
    }

    int getCopies() {
        return copies;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library[] books = new Library[5];        

        // 1. Read data of 5 books
        System.out.println("Enter details of 5 books:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nBook " + (i + 1));
            books[i] = new Library();
            books[i].readBook();
        }

        // 2. Display all books
        System.out.println("\n----- Library Book List -----");
        for (Library b : books) {
            b.displayBook();
        }

        // 3. Search by Book Name
        System.out.print("\nEnter book name to search: ");
        String searchBook = sc.nextLine();
        boolean found = false;

        for (Library b : books) {
            if (b.getBookName().equalsIgnoreCase(searchBook)) {
                System.out.println("Book Available!");
                System.out.println("Number of Copies: " + b.getCopies());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not available.");
        }

        // 4. Search by Author Name
        System.out.print("\nEnter author name to search: ");
        String searchAuthor = sc.nextLine();
        boolean authorFound = false;

        for (Library b : books) {
            if (b.getAuthor().equalsIgnoreCase(searchAuthor)) {
                b.displayBook();
                authorFound = true;
            }
        }

        if (!authorFound) {
            System.out.println("No books found by this author.");
        }
    
    }
}
