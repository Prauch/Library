package com.library.library.models;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Books")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long bookId;

    private String author;

    private String title;

    private boolean isAvailable;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isAvailable == book.isAvailable &&
                Objects.equals(bookId, book.bookId) &&
                Objects.equals(author, book.author) &&
                Objects.equals(title, book.title) &&
                Objects.equals(library, book.library);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, author, title, isAvailable, library);
    }
}
