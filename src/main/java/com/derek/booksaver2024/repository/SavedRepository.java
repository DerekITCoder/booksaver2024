package com.derek.booksaver2024.repository;

import org.springframework.data.repository.CrudRepository;

import com.derek.booksaver2024.model.SavedBooks;

public interface SavedRepository extends CrudRepository<SavedBooks, Long>{
    
}
