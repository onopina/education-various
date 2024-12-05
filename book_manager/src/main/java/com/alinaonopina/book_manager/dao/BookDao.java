package com.alinaonopina.book_manager.dao;

import com.alinaonopina.book_manager.entity.Book;

import java.util.List;

public interface BookDao {
    public void addBook(Book book);
    public void updateBook(Book book);
    public void removeBook(int id);
    public Book getBookById(int id);
    public List<Book> getAllBooks();
}
