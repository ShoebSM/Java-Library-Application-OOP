import models.Book;
import models.EBook;
import models.FileFormat;
import models.PrintedBook;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        System.out.println("LIBRARY");

        Book myBook = new PrintedBook("1984", "George Orwell", "1234567890", true, false);
        Book anotherBook = new PrintedBook("To Kill a Mockingbird", "Harper Lee", true, true);
        Book thirdBook = new EBook("The Great Gatsby", "F. Scott Fitzgerald", "0987654321", FileFormat.EPUB);

        if(thirdBook instanceof EBook){
            EBook ebook = (EBook) thirdBook;
            System.out.println("File Format: " + ebook.getFileFormat());
        }
        System.out.println(myBook.toString());
        System.out.println(anotherBook.toString());
        System.out.println(thirdBook.toString());

        List<Book> bookList = new ArrayList<>();
        bookList.add(myBook);
        bookList.add(anotherBook);
        bookList.add(thirdBook);
        System.out.println("Books in the library:");
        for(Book book : bookList){
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}




