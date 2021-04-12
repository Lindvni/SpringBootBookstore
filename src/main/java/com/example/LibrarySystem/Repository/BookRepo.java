package com.example.LibrarySystem.Repository;

import com.example.LibrarySystem.Model.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<book,Long> {
}

