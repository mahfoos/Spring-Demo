package com.example.springdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private long userId;
	private String userName;
	private String email;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String roomName) {
		this.userName = roomName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String roomNumber) {
		this.email = roomNumber;
	}


	@Override
	public String toString() {
		return "Room{" +
				"roomId=" + userId +
				", roomName='" + userName + '\'' +
				", roomNumber='" + email + '\'' +
				'}';
	}
}
