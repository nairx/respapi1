package com.example.respapi1.controller;

import com.example.respapi1.entity.Book;


import com.example.respapi1.service.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
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

       @GetMapping("/author/{author}")
    public List<Book> getBookByAuthor(@PathVariable String author){
        return bookService.findByAuthor(author);
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        System.out.println("Hello");
        System.out.println(book);

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
