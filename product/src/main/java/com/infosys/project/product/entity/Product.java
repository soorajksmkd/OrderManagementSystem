package com.infosys.project.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "prodid", nullable = false, length = 11)
	Integer prodId;
	
	@Column(name = "brand", nullable = false, length = 255)
	String brand;
	
	@Column(name = "category", nullable = false, length = 255)
	String category;
	
	@Column(name = "description", nullable = false, length = 255)
	String description;
	
	@Column(name = "image", nullable = false, length = 255)
	String image;
	
	@Column(name = "price", nullable = false, precision = 10, scale = 2)
	Double price;
	
	@Column(name = "productname", nullable = false, length = 255)
	String productName;
	
	@Column(name = "rating", length = 11)
	Integer rating;
	
	@Column(name = "sellerid", nullable = false, length = 11)
	Integer sellerId;
	
	@Column(name = "stock", nullable = false, length = 11)
	Integer stock;
	
	@Column(name = "subcategory", length = 255)
	String subcategory;

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	
	
}
