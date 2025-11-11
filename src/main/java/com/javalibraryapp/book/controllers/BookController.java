package com.javalibraryapp.book.controllers;

import com.javalibraryapp.book.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/books")
public class BookController {
    private List<Book> bookList = new ArrayList<>();

    public BookController(){
        bookList.add(new Book("1984", "George Orwell", "1234567890"));
        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "0987654321"));
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookList;
    }

    @GetMapping("/title/{title}")
    public Book getBookByTitle(@PathVariable String title){
        for(Book book : bookList){
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println(ResponseEntity.ok(book));
                return book;
            }
        }
        return null;
    }

    @GetMapping("/isbn/{isbn}")
    public Book getBookByIsbn(@PathVariable String isbn){
        for(Book book : bookList){
            if(isbn.equals(book.getIsbn())){
                System.out.println(ResponseEntity.ok(book));
                return book;
            }
        }
        return null;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
