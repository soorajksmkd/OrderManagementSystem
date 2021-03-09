package com.infosys.project.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "productsordered")
@IdClass(ProductsOrderedId.class)
public class ProductsOrdered {

	@Id
	@Column(name = "orderid")
	Integer orderId;
	
	@Id
	@Column(name = "prodid")
	Integer prodId;
	
	@Column(name = "sellerid", nullable = false)
	Integer sellerId;
	
	@Column(name = "quantity", nullable = false)
	Integer quantity;
	
	@Column(name = "status", nullable = false, length = 60)
	String status;
	
	@Column(name = "price", precision = 10, scale = 2)
	Double price;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
