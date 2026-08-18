package com.example.respapi1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.respapi1.entity.Book;


import com.example.respapi1.service.BookService;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;
    public BookController(){
    }
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.findAll();
    }
    
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookService.findById(id);
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book){
        return bookService.updateBook(id, book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteById(id);
    }


}
