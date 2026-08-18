package com.example.respapi1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.respapi1.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}

//save()
//findById
//findAll()