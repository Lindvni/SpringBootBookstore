package com.example.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity

public class BorrowModel 
{
	@Id
	@GeneratedValue
	private int id;
	private Date returnDate;
	private Date takenDate;
	private int renewCount;
	
	@OneToOne()
	@JoinColumn
	private Books book;
	
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Date getTakenDate() {
		return takenDate;
	}
	public void setTakenDate(Date takenDate) {
		this.takenDate = takenDate;
	}
	public int getRenewCount() {
		return renewCount;
	}
	public void setRenewCount(int renewCount) {
		this.renewCount = renewCount;
	}

}
