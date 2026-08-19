package com.example.respapi1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.respapi1.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
    List<Book> findByAuthor(String author);

   //List<Book> findByTitle(String author);

   //List<Book> findByTitleAndAuthor(String author, String title);

   //List<Book> findByTitleAndAuthorOrderByAuthor(String author, String title);


}

//save()
//findById
//findAll()