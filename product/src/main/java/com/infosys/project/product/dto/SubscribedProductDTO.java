package com.infosys.project.product.dto;

import com.infosys.project.product.entity.SubscribedProduct;

public class SubscribedProductDTO {

	Integer subId;
	
	BuyerDTO buyer;
	
	ProductDTO product;
	
	Integer quantity;

	public SubscribedProductDTO(Integer subId, BuyerDTO buyer, ProductDTO product, Integer quantity) {
		this.subId = subId;
		this.buyer = buyer;
		this.product = product;
		this.quantity = quantity;
	}

	public SubscribedProductDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SubscribedProductDTO [subId=" + subId + ", buyer=" + buyer + ", product=" + product + ", quantity="
				+ quantity + "]";
	}

	public Integer getSubId() {
		return subId;
	}

	public void setSubId(Integer subId) {
		this.subId = subId;
	}

	public BuyerDTO getBuyer() {
		return buyer;
	}

	public void setBuyer(BuyerDTO buyer) {
		this.buyer = buyer;
	}

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	//converts entity to DTO
	public static SubscribedProductDTO valueOf(SubscribedProduct subscribedProduct) {
		SubscribedProductDTO subscribedProductDTO = new SubscribedProductDTO();
		
		subscribedProductDTO.setSubId(subscribedProduct.getSubId());
	
		BuyerDTO buyerDTO = new BuyerDTO();
		buyerDTO.setBuyerId(subscribedProduct.getBuyerId());
		subscribedProductDTO.setBuyer(buyerDTO);
		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProdId(subscribedProduct.getProdId());
		subscribedProductDTO.setProduct(productDTO);
		
		subscribedProductDTO.setQuantity(subscribedProduct.getQuantity());
		
		return subscribedProductDTO;
	}
	
	//converts DTO to entity
	public SubscribedProduct createEntity() {
		SubscribedProduct subscribedProduct = new SubscribedProduct();
		
		subscribedProduct.setSubId(this.getSubId());
		subscribedProduct.setBuyerId(this.getBuyer().getBuyerId());
		subscribedProduct.setProdId(this.getProduct().getProdId());
		subscribedProduct.setQuantity(this.getQuantity());
		
		return subscribedProduct;
	}
	
	

}

