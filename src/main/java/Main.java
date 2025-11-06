import com.javalibraryapp.book.controllers.BookController;
import com.javalibraryapp.book.models.Book;
import com.javalibraryapp.book.models.EBook;
import com.javalibraryapp.book.models.FileFormat;
import com.javalibraryapp.book.models.PrintedBook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = {"com.javalibraryapp.book.controllers", "com.javalibraryapp.book.models"})
public class Main{
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
}




