package com.example.LibrarySystem.repository;

import com.example.LibrarySystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
}

