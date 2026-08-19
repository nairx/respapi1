package com.example.respapi1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.respapi1.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAuthor(String author);

    // List<Book> findByTitle(String author);

    // List<Book> findByTitleAndAuthor(String author, String title);

    // List<Book> findByTitleAndAuthorOrderByAuthor(String author, String title);

    // @Query("select b from Book b where b.author = :author")
    // List<Book> findAuthor(@Param("author") String author);

    

}

// save()
// findById
// findAll()