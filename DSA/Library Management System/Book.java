import java.util.Arrays;
import java.util.Comparator;

public class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book[] books={
                new Book(1,"Spanish Love Deception","Elena Armas"),
                new Book(2,"It Ends With Us","Collen Hoover"),
                new Book(3,"Shatterme","Tahereh Mafi"),
                new Book(4,"Twistedlove","Harini")
        };

        Arrays.sort(books, Comparator.comparing(Book::getTitle));
        Book found1 = Linear.linear(books, "Shatterme");
        System.out.println("The book found is: " + found1);
        Book found2 = binary.binary(books, "Twistedlove");
        System.out.println("The found book is: " + found2);
    }
}
