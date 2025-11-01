import models.Book;
import models.EBook;
import models.FileFormat;

public class Main{
    public static void main(String[] args){
        System.out.println("LIBRARY");

        Book myBook = new Book("1984", "George Orwell", "1234567890");
        Book anotherBook = new Book("To Kill a Mockingbird", "Harper Lee");
        Book thirdBook = new EBook("The Great Gatsby", "F. Scott Fitzgerald", "0987654321", FileFormat.EPUB);

        if(thirdBook instanceof EBook){
            EBook ebook = (EBook) thirdBook;
            System.out.println("File Format: " + ebook.getFileFormat());
        }
        System.out.println(myBook.toString());
        System.out.println(anotherBook.toString());
        System.out.println(thirdBook.toString());
    }
}




