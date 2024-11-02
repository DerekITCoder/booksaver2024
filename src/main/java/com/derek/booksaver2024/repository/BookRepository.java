package com.derek.booksaver2024.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.derek.booksaver2024.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

    // List<Book> findByAuthors_Name(String name);
    
    // List<Book> findByTitle(String title);   

}
