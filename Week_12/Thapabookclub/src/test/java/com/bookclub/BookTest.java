package com.bookclub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bookclub.model.Book;

class BookTest {
	 @Test
	    public void testConstructorAndGetters() {
	        String isbn = "1234567890";
	        String title = "Test Book";
	        String description = "A test description";
	        String infoUrl = "http://test.com";
	        int numOfPages = 100;

	        Book book = new Book(isbn, title, description, infoUrl, numOfPages);

	        assertEquals(isbn, book.getIsbn());
	        assertEquals(title, book.getTitle());
	        assertEquals(description, book.getDescription());
	        assertEquals(infoUrl, book.getInfoUrl());
	        assertEquals(numOfPages, book.getNumOfPages());
	    }

	    @Test
	    public void testSetDescriptionAndSetNumOfPages() {
	        String isbn = "1234567890";
	        String title = "Test Book";
	        String infoUrl = "http://test.com";

	        Book book = new Book(isbn, title, infoUrl);

	        String newDescription = "A new test description";
	        int newNumOfPages = 200;

	        book.setDescription(newDescription);
	        book.setNumOfPages(newNumOfPages);

	        assertEquals(newDescription, book.getDescription());
	        assertEquals(newNumOfPages, book.getNumOfPages());
	    }
	}