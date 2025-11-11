package com.javalibraryapp.book.controllers;

import com.javalibraryapp.book.models.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestClientException;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;


@SpringBootTest(classes = BookController.class)
class BookControllerTest {
    final BookController bookController = new BookController();
    final MockMvc mockMvc = standaloneSetup(bookController).build();
    private List<Book> myList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        Book b1 = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
        Book b2 = new Book("Brave New World", "Aldous Huxley");
        myList.add(b1);
        myList.add(b2);
        bookController.setBookList(myList);
    }

    @Test
    void testGetAllBooks() throws Exception {
        mockMvc.perform(get("/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2));

        assert(bookController.getBookList()).equals(myList);
        }

    @Test
    void testGetBookByTitle() throws Exception {
        mockMvc.perform(get("/books/title/The Catcher in the Rye"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.author").value("J.D. Salinger"));

        mockMvc.perform(get("/books/title/Nonexistent Book"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").doesNotExist());
    }


    @Test
    void testGetBookByIsbn() throws Exception {
        mockMvc.perform(get("/books/isbn/9780316769488"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("The Catcher in the Rye"));
        mockMvc.perform(get("/books/isbn/12345667"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").doesNotExist());
    }
}