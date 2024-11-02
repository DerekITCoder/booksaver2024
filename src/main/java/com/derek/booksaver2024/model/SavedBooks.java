package com.derek.booksaver2024.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class SavedBooks {

    @Id
    @GeneratedValue
    private Long id;
    
    private String name;

    // @ManyToMany(mappedBy = "savedBooks")
    // private List<Book> books;

    public SavedBooks() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public List<Book> getBooks() {
    //     return books;
    // }

    // public void setBooks(List<Book> books) {
    //     this.books = books;
    // }



    
}
