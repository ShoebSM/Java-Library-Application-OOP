package com.javalibraryapp.book.models;

public class EBook extends Book{
    private String fileFormat;

    public EBook(String title, String author, String isbn, FileFormat fileFormat) {
        super(title, author, isbn);
        this.fileFormat = fileFormat.name();
    }

    public EBook(String title, String author, FileFormat fileFormat) {
        super(title, author);
        this.fileFormat = fileFormat.name();
    }

    public String getFileFormat() {
        return fileFormat;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", fileFormat='" + fileFormat + '\'' +
                '}';
    }
}
