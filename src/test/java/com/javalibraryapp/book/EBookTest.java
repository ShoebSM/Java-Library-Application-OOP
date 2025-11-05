package test.java.com.javalibraryapp.book;

import main.java.com.javalibraryapp.book.models.EBook;
import main.java.com.javalibraryapp.book.models.FileFormat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EBookTest{
    private EBook eBook1;
    private EBook eBook2;
    private EBook eBook3;
    private EBook eBook4;

    @BeforeEach
    void setUp() {
        eBook1 = new EBook("1984", "George Orwell", "1234567890", FileFormat.PDF);
        eBook2 = new EBook("The Great Gatsby", "F. Scott Fitzgerald", FileFormat.EPUB);
        eBook3 = new EBook("Moby Dick", "Herman Melville", "1122334455", FileFormat.MOBI);
        eBook4 = new EBook("War and Peace", "Leo Tolstoy", FileFormat.AZW);
    }

    @AfterEach
    void tearDown() {
        eBook1 = null;
        eBook2 = null;
        eBook3 = null;
        eBook4 = null;
    }

    @Test
    void getTitle() {
        assertEquals(eBook1.getTitle(), "1984");
        assertEquals(eBook2.getTitle(), "The Great Gatsby");
        assertEquals(eBook3.getTitle(), "Moby Dick");
        assertEquals(eBook4.getTitle(), "War and Peace");
    }

    @Test
    void getAuthor() {
        assertEquals(eBook1.getAuthor(), "George Orwell");
        assertEquals(eBook2.getAuthor(), "F. Scott Fitzgerald");
        assertEquals(eBook3.getAuthor(), "Herman Melville");
        assertEquals(eBook4.getAuthor(), "Leo Tolstoy");
    }

    @Test
    void getIsbn() {
        assertEquals(eBook1.getIsbn(), "1234567890");
        assertNull(eBook2.getIsbn());
        assertEquals(eBook3.getIsbn(), "1122334455");
        assertNull(eBook4.getIsbn());
    }

    @Test
    void testToString() {
        String expectedString1 = "EBook{title='1984', author='George Orwell', isbn='1234567890', fileFormat='PDF'}";
        String expectedString2 = "EBook{title='The Great Gatsby', author='F. Scott Fitzgerald', isbn='null', fileFormat='EPUB'}";
        String expectedString3 = "EBook{title='Moby Dick', author='Herman Melville', isbn='1122334455', fileFormat='MOBI'}";

        assertEquals(expectedString1, eBook1.toString());
        assertEquals(expectedString2, eBook2.toString());
        assertEquals(expectedString3, eBook3.toString());
    }

    @Test
    void getFileFormat() {
        assertEquals("PDF", eBook1.getFileFormat());
        assertEquals("EPUB", eBook2.getFileFormat());
        assertEquals("MOBI", eBook3.getFileFormat());
        assertEquals("AZW", eBook4.getFileFormat());
    }
}