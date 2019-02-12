package com.library.library.controllers;


import com.library.library.models.Book;
import com.library.library.repositories.BookRepository;
import com.library.library.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    LibraryRepository libraryRepository;

    @GetMapping("/api/book/")
    public List<Book> getAll()
    {
        return bookRepository.findAll();
    }

    @GetMapping("/api/book/{id}")
    public Book getById(@PathVariable Long id)
    {
        return bookRepository.findById(id).get();
    }

    @PostMapping("/api/book/{libraryNumber}/")
    public ResponseEntity<Book> createBook(@RequestBody Book book, @PathVariable Long libraryNumber)
    {
        Book newBook = new Book();
        newBook.setAuthor(book.getAuthor());
        newBook.setTitle(book.getTitle());
        newBook.setAvailable(book.isAvailable());
        newBook.setLibrary(libraryRepository.findByLibraryNumber(libraryNumber));
        bookRepository.save(newBook);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(newBook.getBookId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/api/book/{id}")
    public void deleteById(@PathVariable Long id)
    {
        bookRepository.deleteById(id);
    }

    @PutMapping("/api/book/{id}")
    public void updateById(@PathVariable Long id, @RequestBody Book newBook)
    {
        Book oldBook = bookRepository.findById(id).get();

        oldBook.setTitle(newBook.getTitle());
        oldBook.setAuthor(newBook.getAuthor());
        bookRepository.save(oldBook);
    }


}
