package com.example.LibrarySystem.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="UserInfo")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id;

    @Column(name ="Username")
    private String username;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
