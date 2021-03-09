package com.infosys.project.order.dto;

import com.infosys.project.order.entity.ProductsOrdered;

public class ProductsOrderedDTO {

	//Integer orderId;
	
	OrdersDTO orders;
	
	//Integer prodId;
	
	ProductDTO product;
	
	//Integer sellerId;
	
	SellerDTO seller;
	
	Integer quantity;
	
	String status;
	
	Double price;

	public ProductsOrderedDTO() {
		
	}

	
	public ProductsOrderedDTO(OrdersDTO orders, ProductDTO product, SellerDTO seller, Integer quantity, String status,
			Double price) {
		this.orders = orders;
		this.product = product;
		this.seller = seller;
		this.quantity = quantity;
		this.status = status;
		this.price = price;
	}

	

	public OrdersDTO getOrders() {
		return orders;
	}


	public void setOrders(OrdersDTO orders) {
		this.orders = orders;
	}


	public ProductDTO getProduct() {
		return product;
	}


	public void setProduct(ProductDTO product) {
		this.product = product;
	}


	public SellerDTO getSeller() {
		return seller;
	}


	public void setSeller(SellerDTO seller) {
		this.seller = seller;
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

	
	@Override
	public String toString() {
		return "ProductsOrderedDTO [orders=" + orders + ", product=" + product + ", seller=" + seller + ", quantity="
				+ quantity + ", status=" + status + ", price=" + price + "]";
	}


	//Converts Entity to DTO
	public static ProductsOrderedDTO valueOf (ProductsOrdered productsOrdered) {
		ProductsOrderedDTO productsOrderedDTO = new ProductsOrderedDTO();
		
		productsOrderedDTO.setPrice(productsOrdered.getPrice());
		productsOrderedDTO.setQuantity(productsOrdered.getQuantity());
		productsOrderedDTO.setStatus(productsOrdered.getStatus());
				
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProdId(productsOrdered.getProdId());
		productsOrderedDTO.setProduct(productDTO);
		
		OrdersDTO ordersDTO = new OrdersDTO();
		ordersDTO.setOrderId(productsOrdered.getOrderId());
		productsOrderedDTO.setOrders(ordersDTO);
		
		SellerDTO sellerDTO = new SellerDTO();
		sellerDTO.setSellerId(productsOrdered.getSellerId());
		productsOrderedDTO.setSeller(sellerDTO);
		return productsOrderedDTO;
	}
	
	//Converts DTO to Entity
	public ProductsOrdered createEntity() {
		ProductsOrdered productsOrdered = new ProductsOrdered();
		
		productsOrdered.setPrice(this.getPrice());
		productsOrdered.setQuantity(this.getQuantity());
		productsOrdered.setStatus(this.getStatus());
		productsOrdered.setOrderId(this.getOrders().getOrderId());
		productsOrdered.setProdId(this.getProduct().getProdId());
		productsOrdered.setSellerId(this.getSeller().getSellerId());
		
		return productsOrdered;
	}
	
}
