package com.diet.api;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductImage{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int price;
	@Column(name="product_image",length=1000000)
	private byte[] image;
	public ProductImage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductImage(int id, String name, int price, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
	}
	
	public ProductImage(String name, int price, byte[] image) {
		super();
		this.name = name;
		this.price = price;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
	
	
	
	
	
	
}