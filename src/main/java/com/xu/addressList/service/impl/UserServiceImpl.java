package com.xu.addressList.service.impl;

import com.xu.addressList.dao.Dao;
import com.xu.addressList.model.User;
import com.xu.addressList.service.UserService;


public class UserServiceImpl implements UserService {

	private Dao dao;
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public void save(User user) {

		dao.save(user);
	}

}
