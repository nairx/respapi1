package com.example.respapi1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.respapi1.entity.Student;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}


//Repository > Spring Data Rest > Rest API