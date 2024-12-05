package com.alinaonopina.book_manager.service;

import com.alinaonopina.book_manager.entity.Book;

import java.util.List;

public interface BookService {
    public void addBook(Book book);
    public void updateBook(Book book);
    public void removeBook(int id);
    public Book getBookById(int id);
    public List<Book> getAllBooks();
}
