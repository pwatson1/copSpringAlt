package com.pawdirect.spring.controller;

import com.pawdirect.spring.dao.User;

public class UserBuilder {
	private String username = "name";
	private String password = "password";
	private String email = "email";
	private Boolean enabled = false;
	private String authority = "authority";
	
	//String username = new UserNameBuilder().build();
	//String password = new PasswordBuilder().build();
	//String email = new EmailBuilder().build();
	//Boolean enabled = new EnabledBuilder().build();
	//String authority = new AuthorityBuilder().build();
	
	public UserBuilder username(String username) {
		this.username = username;
		return this;
	}
	
	public UserBuilder password(String password) {
		this.password = password;
		return this;
	}
	
	public UserBuilder email(String email) {
		this.email = email;
		return this;
	}
	
	public UserBuilder enabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}
	
	public UserBuilder authority(String authority) {
		this.authority = authority;
		return this;
	}
	
	public User build() {
		return new User();
	}

}
