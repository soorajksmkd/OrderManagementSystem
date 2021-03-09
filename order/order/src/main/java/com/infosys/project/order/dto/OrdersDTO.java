package com.infosys.project.order.dto;

import java.sql.Date;

import com.infosys.project.order.entity.Orders;

public class OrdersDTO {

	Integer orderId;
	
	//Integer buyerId;
	
	BuyerDTO buyer;
	
	Double amount;
	
	Date date;
	
	String address;
	
	String status;

	public OrdersDTO(Integer orderId, BuyerDTO buyer, Double amount, Date date, String address, String status) {
		this.orderId = orderId;
		this.buyer = buyer;
		this.amount = amount;
		this.date = date;
		this.address = address;
		this.status = status;
	}

	public OrdersDTO() {
		
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public BuyerDTO getBuyer() {
		return buyer;
	}

	public void setBuyer(BuyerDTO buyer) {
		this.buyer = buyer;
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

	
	
	@Override
	public String toString() {
		return "OrdersDTO [orderId=" + orderId + ", buyer=" + buyer + ", amount=" + amount + ", date=" + date
				+ ", address=" + address + ", status=" + status + "]";
	}

	//converts Entity to DTO
	public static OrdersDTO valueOf(Orders orders) {
		OrdersDTO ordersDTO = new OrdersDTO();
		
		ordersDTO.setOrderId(orders.getOrderId());
		ordersDTO.setAddress(orders.getAddress());
		ordersDTO.setAmount(orders.getAmount());
		ordersDTO.setDate(orders.getDate());
		ordersDTO.setStatus(orders.getStatus());
		
		BuyerDTO buyerDTO = new BuyerDTO();
		buyerDTO.setBuyerId(orders.getBuyerId());
		ordersDTO.setBuyer(buyerDTO);
		return ordersDTO;
		
	}
	
	//converts DTO to Entity
	public Orders createEntity() {
		Orders orders = new Orders();
		
		orders.setAddress(this.getAddress());
		orders.setAmount(this.getAmount());
		orders.setDate(this.getDate());
		orders.setOrderId(this.getOrderId());
		orders.setStatus(this.getStatus());
		orders.setBuyerId(this.getBuyer().getBuyerId());
		
		return orders;
		
	}
	
}
