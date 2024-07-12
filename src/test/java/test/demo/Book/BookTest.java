package test.demo.Book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void constructorSetsPropertiesCorrectly() {
        Book aBook = new Book("12345", "Test Title", "Test Author");

        assertEquals("12345", aBook.getIsbn());
        assertEquals("Test Title", aBook.getTitle());
        assertEquals("Test Author", aBook.getAuthor());
    }

}