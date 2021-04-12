package com.example.LibrarySystem.Model;

import javax.persistence.*;

@Entity
@Table(name ="Library")
public class book {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id;


    @Column(name ="ISBN")
    private String ISBN ;

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    @Column(name ="Book_Title")
    private String title;

    @Column(name ="Author")
    private String author;

    @Column(name ="Publisher")
    private String publisher;

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getISBN()
    {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
