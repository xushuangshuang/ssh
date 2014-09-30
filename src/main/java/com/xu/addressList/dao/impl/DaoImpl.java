package com.xu.addressList.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xu.addressList.dao.Dao;
import com.xu.addressList.model.User;

public class DaoImpl extends HibernateDaoSupport implements Dao {

	public void save(User user) {
		this.getHibernateTemplate().save(user);

	}
}
