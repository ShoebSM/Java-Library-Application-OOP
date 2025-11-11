package com.javalibraryapp.book.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class BookTest {
    private Book printedBook;
    private Book printedBook2;


    @BeforeEach
    void setUpPrintedBook() {
        printedBook = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
        printedBook2 = new Book("Brave New World", "Aldous Huxley");
    }

    @AfterEach
    void tearDown() {
        printedBook = null;
        printedBook2 = null;
    }

    @Test
    void getTitle() {
        assertEquals("The Catcher in the Rye", printedBook.getTitle());
        assertEquals("Brave New World", printedBook2.getTitle());
    }

    @Test
    void getAuthor() {
        assertEquals("J.D. Salinger", printedBook.getAuthor());
        assertEquals("Aldous Huxley", printedBook2.getAuthor());
    }

    @Test
    void getIsbn() {
        assertEquals("9780316769488", printedBook.getIsbn());
        assertNull(printedBook2.getIsbn());
    }

    @Test
    void testToString() {
        String expectedString1 = "Book{title='The Catcher in the Rye', author='J.D. Salinger', isbn='9780316769488'}";
        String expectedString2 = "Book{title='Brave New World', author='Aldous Huxley', isbn='null'}";
        assertEquals(expectedString1, printedBook.toString());
        assertEquals(expectedString2, printedBook2.toString());
    }
}