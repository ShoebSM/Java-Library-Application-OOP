package test.java.com.javalibraryapp.book;

import main.java.com.javalibraryapp.book.models.PrintedBook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintedBookTest {
    private PrintedBook Book1;
    private PrintedBook Book2;
    private PrintedBook Book3;
    private PrintedBook Book4;

    @BeforeEach
    void setUp() {
        Book1 = new PrintedBook("1984", "George Orwell","1234567890",true,true);
        Book2 = new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", true, false);
        Book3 = new PrintedBook("Moby Dick", "Herman Melville", "1122334455",false, true);
        Book4 = new PrintedBook("War and Peace", "Leo Tolstoy", false, true);
    }

    @AfterEach
    void tearDown() {
        Book1 = null;
        Book2 = null;
        Book3 = null;
        Book4 = null;
    }

    @Test
    void getTitle() {
        assertEquals("1984", Book1.getTitle());
        assertEquals("The Great Gatsby", Book2.getTitle());
        assertEquals("Moby Dick", Book3.getTitle());
        assertEquals("War and Peace", Book4.getTitle());
    }

    @Test
    void getAuthor() {
        assertEquals("George Orwell", Book1.getAuthor());
        assertEquals("F. Scott Fitzgerald", Book2.getAuthor());
        assertEquals("Herman Melville", Book3.getAuthor());
        assertEquals("Leo Tolstoy", Book4.getAuthor());
    }

    @Test
    void getIsbn() {
        assertEquals("1234567890", Book1.getIsbn());
        assertNull(Book2.getIsbn());
        assertEquals("1122334455", Book3.getIsbn());
        assertNull(Book4.getIsbn());
    }

    /*@Test
    void testToString() {
        String expectedString1 = "EBook{title='1984', author='George Orwell', isbn='1234567890', fileFormat='PDF'}";
        String expectedString2 = "EBook{title='The Great Gatsby', author='F. Scott Fitzgerald', isbn='null', fileFormat='EPUB'}";
        String expectedString3 = "EBook{title='Moby Dick', author='Herman Melville', isbn='1122334455', fileFormat='MOBI'}";

        assertEquals(expectedString1, .toString());
        assertEquals(expectedString2, eBook2.toString());
        assertEquals(expectedString3, eBook3.toString());
    }*/

    @Test
    void getIsHardcover(){
        assertTrue(Book1.isHardcover());
        assertFalse(Book2.isHardcover());
        assertTrue(Book3.isHardcover());
        assertTrue(Book4.isHardcover());
    }

    @Test
    void setBooleans(){
        Book3.setCheckedOut(true);
        assertTrue(Book1.isCheckedOut());
    }

    @Test
    void testToString() {
        String expected1 = "Printedbook{title='1984', author='George Orwell', isbn='1234567890', isCheckedOut='true', isHardcover='true'}";
        String expected2 = "Printedbook{title='The Great Gatsby', author='F. Scott Fitzgerald', isbn='null', isCheckedOut='true', isHardcover='false'}";
        String expected3 = "Printedbook{title='Moby Dick', author='Herman Melville', isbn='1122334455', isCheckedOut='false', isHardcover='true'}";
        String expected4 = "Printedbook{title='War and Peace', author='Leo Tolstoy', isbn='null', isCheckedOut='false', isHardcover='true'}";

        assertEquals(expected1, Book1.toString());
        assertEquals(expected2, Book2.toString());
        assertEquals(expected3, Book3.toString());
        assertEquals(expected4, Book4.toString());
    }
}