package models;

import java.util.StringJoiner;

public class PrintedBook extends Book{
    private boolean isCheckedOut;
    private boolean isHardcover;

    public PrintedBook(String title, String author, String isbn, boolean isCheckedOut, boolean isHardcover) {
        super(title, author, isbn);
        this.isCheckedOut = isCheckedOut;
        this.isHardcover = isHardcover;
    }

    public PrintedBook(String title, String author, boolean isCheckedOut, boolean isHardcover) {
        super(title, author);
        this.isCheckedOut = isCheckedOut;
        this.isHardcover = isHardcover;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public boolean isHardcover() {
        return isHardcover;
    }

    @Override
    public String toString() {
        return "Printedbook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", isCheckedOut='" + isCheckedOut() + '\'' +
                ", isHardcover='" + isHardcover() + '\'' +
                '}';
    }
}
