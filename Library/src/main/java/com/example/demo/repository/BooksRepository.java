package com.example.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {

	static Optional<Books> findByISBN(long iSBN) {
		// TODO Auto-generated method stub
		return null;
	}

}
