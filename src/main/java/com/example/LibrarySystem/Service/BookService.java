package com.example.LibrarySystem.Service;

import com.example.LibrarySystem.Model.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface BookService {
    List<book> getAllbook();

    void save(Book book);
}
