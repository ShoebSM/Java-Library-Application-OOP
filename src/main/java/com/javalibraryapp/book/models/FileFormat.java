package main.java.com.javalibraryapp.book.models;

public enum FileFormat {
        PDF(".pdf"),
        EPUB(".epub"),
        MOBI(".mobi"),
        AZW(".azw");

    private final String formatExtension;

    FileFormat(String formatExtension) {
        this.formatExtension = formatExtension;
    }
}
