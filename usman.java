import java.util.ArrayList;
import java.util.List;
class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("You have borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, the book is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println("You have returned the book: " + book.getTitle());
    }
}

public class sainadh {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Creating a library
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        // Display available books
        library.displayAvailableBooks();
        // Borrow a book
        library.borrowBook(book1);
        library.displayAvailableBooks();
        // Return the book
        library.returnBook(book1);
        library.displayAvailableBooks();
    }
}
