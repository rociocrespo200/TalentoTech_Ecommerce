package com.techlab.domain.models;
import java.util.ArrayList;
import java.util.Locale;
import java.text.NumberFormat;
import java.time.LocalDateTime;

public class Order {
	
	private Integer id;
    private LocalDateTime dateTime;
    private User user;
	private ArrayList<Order_product> products = new ArrayList<>();
	private Double totalPrice;
	private OrderStatus state;

	public Order(Integer id, LocalDateTime dateTime, User user, ArrayList<Order_product> products, Double totalPrice) {
		this.id = id;
		this.dateTime = LocalDateTime.now();
		this.user = user;
		this.products = products;
		this.totalPrice = calculateTotalPrice();
	}

	private Double calculateTotalPrice() {
		Double sum = 0.0;
		for (Order_product p : products) {
			sum += p.getTotalPrice();
		}
		return sum;
		
	}
	
	public ArrayList<Order_product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Order_product> products) {
		this.products = products;
	}

	public Integer getId() {
		return id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}
	
	@Override
	public String toString() {
	    NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
	    return "ID: " + id +
	           " | Date and time: " + dateTime +
	           " | Products: " + listProducts() +
	           " | Total price: $" + nf.format(totalPrice)+
	           " | State: " + state.getName();
	}

	private String listProducts() {
		String produductsText = products.get(0).toString();		
		for (int i = 1; i < products.size(); i++) {
			produductsText += ", " + products.get(i).toString();
		}
		return produductsText;
	}
}
