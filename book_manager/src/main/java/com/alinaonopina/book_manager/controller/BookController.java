package com.alinaonopina.book_manager.controller;

import com.alinaonopina.book_manager.entity.Book;
import com.alinaonopina.book_manager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String showAllBooks(@ModelAttribute("book")Book book, Model model) {
        List<Book> allBooks = bookService.getAllBooks();
//        model.addAttribute(("book"), new Book());
        model.addAttribute("allBooks", allBooks);
        return "books";
    }

    @PostMapping("/add")
    public String addBook(@ModelAttribute("book") Book book){
        if (book.getId() == 0){
            bookService.addBook(book);
        } else {
            bookService.updateBook(book);
        }
        return "redirect:/";
    }

    @RequestMapping("/remove/{id}")
    public String removeBook(@PathVariable("id") int id){
        bookService.removeBook(id);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public String editBook(@PathVariable("id") int id, Model model){
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);

        List<Book> allBooks = bookService.getAllBooks();
        model.addAttribute("allBooks", allBooks);

        return "books";
    }

    @GetMapping ("/bookinfo/{id}")
    public String showBookInfo(@PathVariable("id") int id, Model model){
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);

        return "bookinfo";
    }



}
