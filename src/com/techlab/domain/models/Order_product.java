package com.techlab.domain.models;

public class Order_product {

	private Product product;
	private Integer quantity ;
	private Double totalPrice;
	
	public Order_product(Product product, Integer quantity, Double totalPrice) {
		this.product = product;
		this.quantity  = quantity ;
		this.totalPrice = product.getPrice() * quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	@Override
	public String toString() {
		return  product.getName() + " X" + quantity;
	}
}
