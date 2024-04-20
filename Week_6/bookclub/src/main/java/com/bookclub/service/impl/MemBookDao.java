package com.bookclub.service.impl;

import com.bookclub.model.Book;
import com.bookclub.service.dao.BookDao;

import java.util.ArrayList;
import java.util.List;

public class MemBookDao implements BookDao {
    private List<Book> books;

    // Constructor to initialize the list of books
    public MemBookDao() {
        // Initialize the list of books with five Book objects
        books = new ArrayList<>();
        books.add(new Book("ISBN001", "Title 1", "Description 1", 200, List.of("Author 1", "Author 2")));
        books.add(new Book("ISBN002", "Title 2", "Description 2", 250, List.of("Author 3")));
        books.add(new Book("ISBN003", "Title 3", "Description 3", 180, List.of("Author 4")));
        books.add(new Book("ISBN004", "Title 4", "Description 4", 300, List.of("Author 5")));
        books.add(new Book("ISBN005", "Title 5", "Description 5", 220, List.of("Author 1", "Author 6")));
    }

    @Override
    public List<Book> list() {
        return books;
    }

    @Override
    public Book find(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null; // Return null if book with specified ISBN is not found
    }
}