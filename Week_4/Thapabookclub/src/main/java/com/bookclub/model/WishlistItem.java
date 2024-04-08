package com.bookclub.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class WishlistItem {
    @NotNull
    @NotEmpty(message = "ISBN is a required field.")
    private String isbn;

    @NotNull
    @NotEmpty(message = "Title is a required field.")
    private String title;

    public WishlistItem() {
        // default constructor
    }

    public WishlistItem(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    // Getter and setter methods for isbn and title
    @Override
    public String toString() {
        return String.format("WishlistItem{isbn=%s, title=%s}", isbn, title);
    }
}
