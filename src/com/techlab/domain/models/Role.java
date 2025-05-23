package com.techlab.domain.models;

public class Role {
	private Integer id;
	private Integer name;

	public Role(Integer id, Integer name) {
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
