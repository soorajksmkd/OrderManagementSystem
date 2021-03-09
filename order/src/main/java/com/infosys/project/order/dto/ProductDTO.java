package com.infosys.project.order.dto;

public class ProductDTO {

	Integer prodId;
	
	String brand;
	
	String category;
	
	String description;
	
	String image;
	
	Double price;
	
	String productName;
	
	Integer rating;
	
	SellerDTO seller;
	
	Integer stock;
	
	String subcategory;

	public ProductDTO(Integer prodId, String brand, String category, String description, String image, Double price,
			String productName, Integer rating, SellerDTO seller, Integer stock, String subcategory) {
		this.prodId = prodId;
		this.brand = brand;
		this.category = category;
		this.description = description;
		this.image = image;
		this.price = price;
		this.productName = productName;
		this.rating = rating;
		this.seller = seller;
		this.stock = stock;
		this.subcategory = subcategory;
	}

	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductDTO [prodId=" + prodId + ", brand=" + brand + ", category=" + category + ", description="
				+ description + ", image=" + image + ", price=" + price + ", productName=" + productName + ", rating="
				+ rating + ", seller=" + seller + ", stock=" + stock + ", subcategory=" + subcategory + "]";
	}

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

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
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
