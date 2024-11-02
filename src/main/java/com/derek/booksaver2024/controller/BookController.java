package com.derek.booksaver2024.controller;


    
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.derek.booksaver2024.model.Book;
import com.derek.booksaver2024.model.SavedBooks;
import com.derek.booksaver2024.repository.BookRepository;
import com.derek.booksaver2024.repository.SavedRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/books")
public class BookController {
    
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private SavedRepository savedRepository;

    @GetMapping
    public List<Book> getAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookByID(@PathVariable Long id) {
        return bookRepository.findById(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }



    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        
        if (optionalBook.isPresent()) {
            Book currentBook = optionalBook.get();
            currentBook.setTitle(book.getTitle());
            currentBook.setSavedBooks(book.getSavedBooks());
            return bookRepository.save(currentBook);
        } else {
            book.setId(id);
            return bookRepository.save(book);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }

    // @GetMapping("/author/{name}")
    // public List<Book> getBooksByAuthorName(@PathVariable String name) {
    //     return bookRepository.findByAuthors_Name(name);
    // }

    @GetMapping("/saved")
    public List<SavedBooks> getAllSavedBooks() {
        return (List<SavedBooks>) savedRepository.findAll();
    }

    @PostMapping("/saved")
    public SavedBooks createSavedBook(@RequestBody SavedBooks saved) {
        return savedRepository.save(saved);
    }


}

