/// Assignment: Create a Book Class

/// Objective:
/// Create a Book class that models a book with various attributes. The class should have multiple constructors
///  to allow for different ways of creating a Book object. Then, instantiate the Book class using each constructor.


/// Create a Book Class:
/// The class should have the following attributes:

/*
        String title
        String author
        double price
        int pages
*/

/// Implement Multiple Constructors:

/// Empty Constructor: Initializes the title to "Unknown", author to "Unknown", price to 0.0, and pages to 0.
/// Constructor with All Attributes: Initializes all attributes with the provided values.
/// Create Objects Using Each Constructor:
/// Instantiate the Book class using:
/// The empty constructor.
/// The constructor with all attributes.
/// Display Object Details:
/// Implement a displayDetails() method that prints the book's title, author, price, and number of pages.
///  Call this method for each instantiated object.


public class Book {
    String title;
    String author;
    double price;
    int pages;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.pages = 0;
    }

    public Book(String title, String author, double price, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Pages: " + pages);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Dune", "Frank Herbert", 10.99, 500);
        book1.displayDetails();
        book2.displayDetails();
    }
}
