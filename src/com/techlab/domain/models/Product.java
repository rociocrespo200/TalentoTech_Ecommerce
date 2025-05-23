package com.techlab.domain.models;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {
	
	private Integer id;
	private String name;
	private Double price;
	private Category category;
	private Integer stock;

	public Product(Integer id, String name, Double price, Category category, Integer stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.stock = stock;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getId() {
		return id;
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		return "ID: " + id +
                " | Name: " + name +
                " | Price: $" + nf.format(price) +
                " | Stock: " + stock +
                " | Category: " + category.getName();
	}
}
