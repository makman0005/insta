package com.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Repository;

  @Repository

  @Entity

  @Table(name="loginData")

  public class Login {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id",unique=true,columnDefinition="VARCHAR(64)")
	private int id;
	
	private String userId;
	
	private String password;
	
	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getUserId() {
		return userId;
	}
	
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public Login(String userId, String password, int id) {
		super();
		this.id =id;
		this.userId = userId;
		this.password = password;
   }
	
	
	public Login() {
	     	super();
		
	}
	
	@Override
	public String toString() {
		return "Login [userId=" + userId + ", password=" + password + "]";
	}
	
	
	
	
	
}
