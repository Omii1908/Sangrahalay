package com.sangrahalay.managers;

import com.sangrahalay.models.Book;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static final List<Book> books = new ArrayList<>();

    public static boolean addBook(Book book) {
        return books.add(book);
    }
}
