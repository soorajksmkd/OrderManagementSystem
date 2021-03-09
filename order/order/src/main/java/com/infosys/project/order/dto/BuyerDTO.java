package com.infosys.project.order.dto;

public class BuyerDTO {

	Integer buyerId;
	
	String name;
	
	String email;
	
	String phoneNumber;
	
	String password;
	
	Integer isPrivileged;
	
	Integer rewardPoints;
	
	Integer isActive;

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
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

	
	public Integer getIsPrivileged() {
		return isPrivileged;
	}

	public void setIsPrivileged(Integer isPrivileged) {
		this.isPrivileged = isPrivileged;
	}

	public Integer getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(Integer rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public BuyerDTO() {

	}

	public BuyerDTO(Integer buyerId, String name, String email, String phoneNumber, String password,
			Integer isPrivileged, Integer rewardPoints, Integer isActive) {
		this.buyerId = buyerId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.isPrivileged = isPrivileged;
		this.rewardPoints = rewardPoints;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "BuyerDTO [buyerId=" + buyerId + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + ", isPrivileged=" + isPrivileged + ", rewardPoints=" + rewardPoints
				+ ", isActive=" + isActive + "]";
	}
	
	
	
	
}
