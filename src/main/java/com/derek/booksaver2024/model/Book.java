package com.derek.booksaver2024.model;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

private String authorName;

    public String getAuthorName() {
    return authorName;
}

public void setAuthorName(String authorName) {
    this.authorName = authorName;
}

    @ManyToMany
    @JsonIgnore
    //@JoinTable(name = book_author, joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id)"))
    private List<SavedBooks> savedBooks;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SavedBooks> getSavedBooks() {
        return savedBooks;
    }

    public void setSavedBooks(List<SavedBooks> savedBooks) {
        this.savedBooks = savedBooks;
    }

    public void setId(Long id2) {
    }  



}
