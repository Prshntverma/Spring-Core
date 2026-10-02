package com.rays.ioc;

public class Inventry {

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	private int stock;

	public int sold(int book) {
		this.stock = this.stock - book;
		return this.stock;
	}
}
