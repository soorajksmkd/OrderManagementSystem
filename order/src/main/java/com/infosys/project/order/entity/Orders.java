package com.infosys.project.order.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class Orders {

	@Id
	@Column(name = "orderid", unique = true, nullable = false)
	Integer orderId;
	
	@Column(name = "buyerid", nullable = false)
	Integer buyerId;
	
	@Column(name = "amount", nullable = false, precision = 10, scale = 2)
	Double amount;
	
	@Column(name = "date")
	Date date;
	
	@Column(name = "address", length = 100 , nullable = false)
	String address;
	
	@Column(name = "status", length = 60, nullable = false)
	String status;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
