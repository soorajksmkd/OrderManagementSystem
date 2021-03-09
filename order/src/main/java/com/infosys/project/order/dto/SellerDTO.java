package com.infosys.project.order.dto;

public class SellerDTO {

	Integer sellerId;
	
	String name;
	
	String email;
	
	String phoneNumber;
	
	String password;
	
	Integer isActive;

	public SellerDTO() {
		// TODO Auto-generated constructor stub
	}

	public SellerDTO(Integer sellerId, String name, String email, String phoneNumber, String password,
			Integer isActive) {
		this.sellerId = sellerId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "SellerDTO [sellerId=" + sellerId + ", name=" + name + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", password=" + password + ", isActive=" + isActive + "]";
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
	
	
	
	
}
