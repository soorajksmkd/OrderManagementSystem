package com.infosys.project.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscribedproduct")
public class SubscribedProduct {

	@Id
	@Column(name = "subid", nullable = false, length = 11)
	Integer subId;
	
	@Column(name = "buyerid", nullable = false, length = 11)
	Integer buyerId;
	
	@Column(name = "prodid", nullable = false, length = 11)
	Integer prodId;
	
	@Column(name = "quantity", nullable = false, length = 11)
	Integer quantity;

	public Integer getSubId() {
		return subId;
	}

	public void setSubId(Integer subId) {
		this.subId = subId;
	}

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}
