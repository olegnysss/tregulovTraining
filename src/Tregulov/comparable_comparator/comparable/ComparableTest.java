package Tregulov.comparable_comparator.comparable;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparableTest {

    @Test
    public void testComparable() {
        // create an array of books
        Book[] books = new Book[4];
        books[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        books[1] = new Book("To Kill a Mockingbird", "Harper Lee");
        books[2] = new Book("1984", "George Orwell");
        books[3] = new Book("Animal Farm", "George Orwell");

        // sort the array using the Arrays.sort() method
        System.out.println(Arrays.toString(books));
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));

        // assert that the books are sorted in alphabetical order by title
        assertEquals("1984", books[0].getTitle());
        assertEquals("Animal Farm", books[1].getTitle());
        assertEquals("The Great Gatsby", books[2].getTitle());
        assertEquals("To Kill a Mockingbird", books[3].getTitle());
    }
}

class Book implements Comparable<Book> {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Book{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            '}';
    }
}
