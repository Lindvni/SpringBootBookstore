package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name ="Library")
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int Id;
	
	@OneToOne(mappedBy =)
	private BorrowModel borrow;
	
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
