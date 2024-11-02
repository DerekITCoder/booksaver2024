package com.derek.booksaver2024;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.derek.booksaver2024.model.SavedBooks;
import com.derek.booksaver2024.model.Book;
import com.derek.booksaver2024.repository.SavedRepository;
import com.derek.booksaver2024.repository.BookRepository;

@SpringBootApplication
public class Booksaver2024Application {

	public static void main(String[] args) {
		SpringApplication.run(Booksaver2024Application.class, args);
	}

	
	@Bean
	public CommandLineRunner jpaTest(BookRepository bookRepository, SavedRepository savedRepository) {
		return args -> {
			// Create Authors
			// Author author1 = new Author();
			// author1.setName("Author1");
			// authorRepository.save(author1);

			// Author author2 = new Author();
			// author2.setName("Author2");
			// authorRepository.save(author2);

			// // Log authors

			// System.out.println("\nAll Authors:");
			// authorRepository.findAll().forEach(x -> System.out.println(x.getName()));

			// for (var author : authorRepository.findAll()) {
			// System.out.println(author.getName());
			// }

			// // Make some books
			Book book1 = new Book(); // create a new book
			book1.setTitle("Action: The Academy"); // set the title of the book
			book1.setAuthorName("Patrick Bet-David");
			bookRepository.save(book1); // give the book to the repository and save it.

			Book book2 = new Book();
			book2.setTitle("Romance: Highest Bidder");
			book2.setAuthorName("Willow Winters");
			bookRepository.save(book2);

			Book book3 = new Book();
			book3.setTitle("Children's Book: The Cursed Moon");
			book3.setAuthorName("Angela Cervantes");
			bookRepository.save(book3);

			System.out.println("\nAll Books");
			// bookRepository.findAll().forEach(System.out::println);
			bookRepository.findAll().forEach(x -> System.out.println(x.getTitle()));


			// SavedBooks savedBooks1 = new SavedBooks(); // create a new book
			// savedBooks1.setName("Book 10"); // set the title of the book
			// savedRepository.save(savedBooks1);


			// SavedBooks savedBooks2 = new SavedBooks(); // create a new book
			// savedBooks2.setName("Book 12"); // set the title of the book
			// savedRepository.save(savedBooks2);
			
			System.out.println("\nAll Saved Books");
		
			savedRepository.findAll().forEach(x -> System.out.println(x.getName()));
			

			// books.forEach(book => console.log(book.title))

		};
	}








}
