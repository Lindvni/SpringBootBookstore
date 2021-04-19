package com.example.librarysystem;

import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ActiveProfiles;

import com.example.librarysystem.model.Book;

@ActiveProfiles("test")
@SpringBootTest
class LibrarySystemApplicationTests {

    @PersistenceContext
    EntityManager em;
    
    
    @Test
    @Transactional
    public void SaveBook() {
        Book book = new Book();
        em.persist(book);
    }
    @Test
    @Transactional
    public void When_SaveBook_BookIsSaved() {
        Book book = new Book();
        String title = "book's title";
        book.setTitle(title);
        em.persist(book);
        
        // add code to read book and check it is there

        fail();
    }
    
    

}
