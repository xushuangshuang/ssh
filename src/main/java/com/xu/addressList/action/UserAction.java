package com.xu.addressList.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xu.addressList.model.User;
import com.xu.addressList.service.UserService;

public class UserAction extends ActionSupport {

	private String username;
	
	private String password;

	private UserService service;
	
	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	@Override
	public String execute() throws Exception {
		User user = new User();
		
		user.setPassword(password);
		
		user.setUsername(username);
		
		service.save(user);
		
		return SUCCESS;
	}
}
