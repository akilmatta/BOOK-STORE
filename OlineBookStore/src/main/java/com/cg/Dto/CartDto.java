package com.cg.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart_dto")

public class CartDto {
	
	private String userId;
	@Id
	private String book_Id;
	private int quantity;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(String book_Id) {
		this.book_Id = book_Id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public CartDto(String userId, String book_Id, int quantity) {
		super();
		this.userId = userId;
		this.book_Id = book_Id;
		this.quantity = quantity;
	}
	public CartDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
