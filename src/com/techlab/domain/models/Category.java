package com.techlab.domain.models;

public class Category {

	private Integer id;
	private Integer name;

	public Category(Integer id, Integer name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public Integer getName() {
		return name;
	}

	public void setName(Integer name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ID: " + id +
                " | Name: " + name;
	}
}
