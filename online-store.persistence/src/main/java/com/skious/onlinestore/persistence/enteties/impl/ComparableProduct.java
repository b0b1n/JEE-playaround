package com.skious.onlinestore.persistence.enteties.impl;

import com.skious.onlinestore.persistence.enteties.Product;

public class ComparableProduct implements Product, Comparable<Product> {
	
	private int id;
	private String productName;
	private String categoryName;
	private double price;

	public ComparableProduct() {
	}
	
	public ComparableProduct(int id, String productName, String categoryName, double price) {
		this.id = id;
		this.productName = productName;
		this.categoryName = categoryName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product id=" + id + ", product name=" + productName
				+ ", category name=" + categoryName + ", price=" + price;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public String getProductName() {
		return this.productName;
	}
	
	@Override
	public String getCategoryName() {
		return this.categoryName;
	}

	@Override
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(Product otherProduct) {
		return this.id - otherProduct.getId();
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
