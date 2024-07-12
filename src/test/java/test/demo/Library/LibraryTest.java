package test.demo.Library;

import org.junit.jupiter.api.Test;
import test.demo.Book.Book;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void addBookIncreasesTotalBooks() {
        // Implement test
        Library aLibrary = new Library();
        assertEquals(0, aLibrary.getTotalBooks());

        Book aBook = new Book("12345", "Test Title 1", "Test Author 1");
        aLibrary.addBook(aBook);

        assertEquals(1, aLibrary.getTotalBooks());


    }

    @Test
    void findBookByISBNReturnsCorrectBook() {
        // Implement test
        Library aLibrary = new Library();
        Book aBook = new Book("12345", "Test Title 1", "Test Author 1");
        Book aBook2 = new Book("6789", "Test Title 2", "Test Author 2");
        aLibrary.addBook(aBook);
        aLibrary.addBook(aBook2);

        assertEquals(aBook, aLibrary.findBookByISBN("12345"));
    }

    @Test
    void findBooksByAuthorReturnsCorrectBooks() {
        // Implement test
        // A bit of a wishy washy solution.
        Library aLibrary = new Library();

        Book aBook = new Book("12345", "Test Title 1", "Test Author 1");
        Book aBook2 = new Book("6789", "Test Title 2", "Test Author 1");
        aLibrary.addBook(aBook);
        aLibrary.addBook(aBook2);

        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(aBook);
        expectedResult.add(aBook2);

        assertEquals(expectedResult, aLibrary.findBooksByAuthor("Test Author 1"));
    }
}


class LibraryIntegrationTest {
    @Test
    void addMultipleBooksAndFindByAuthorReturnsCorrectBooks() {
        // Implement test
    }

    @Test
    void addBookAndFindByISBNReturnsCorrectBook() {
        // Implement test
    }
}


class LibrarySystemE2ETest {
    @Test
    void createLibraryAddBooksSearchAndRetrieveBooks() {
        // Implement test
    }

    @Test
    void createLibraryAddDuplicateBooksEnsureNoDuplicates() {
        // Implement test
    }
}