package com.ashish.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	private int productId;
	private String proName;
	private double price;

	public int getProductId() {
		return productId;
	}

	public String getProName() {
		return proName;
	}

	public double getPrice() {
		return price;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}