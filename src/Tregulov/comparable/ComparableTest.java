package Tregulov.comparable;

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
        Arrays.sort(books);

        // assert that the books are sorted in alphabetical order by title
        assertEquals("1984", books[0].getTitle());
        assertEquals("Animal Farm", books[1].getTitle());
        assertEquals("The Great Gatsby", books[2].getTitle());
        assertEquals("To Kill a Mockingbird", books[3].getTitle());
    }
}

class Book {

}
