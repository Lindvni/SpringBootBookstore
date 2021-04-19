package com.example.librarysystem.service;

import org.springframework.stereotype.Repository;

import com.example.librarysystem.model.Book;

import java.util.List;

@Repository
public interface BookService {
    List<Book> getAllbook();
    Book getBookById(long id);
    void deleteBookById(long id);
    void saveBook(Book book);
}
