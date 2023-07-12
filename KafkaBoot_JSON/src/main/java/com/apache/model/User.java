package com.apache.model;

public class User {

	private Integer userId;
	private String userName;
	private String address;
	private String email;
	
	public User() {
		super();
	}

	public User(Integer userId, String userName, String address, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", address=" + address + ", email=" + email + "]";
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
