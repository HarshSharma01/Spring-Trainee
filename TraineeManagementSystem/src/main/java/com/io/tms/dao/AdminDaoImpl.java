package com.io.tms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.io.tms.model.Admin;

@Repository
@Component("adminDao")
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public String login(Admin admin) {
		String username = null;
		Admin ad = entityManager.find(Admin.class, admin.getUserName());
		if (ad.getPassword().equals(admin.getPassword())) {
			username = admin.getUserName();
		}
		return username;
	}
}
