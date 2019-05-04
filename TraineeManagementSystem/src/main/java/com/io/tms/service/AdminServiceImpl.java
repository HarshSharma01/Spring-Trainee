package com.io.tms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.io.tms.dao.AdminDao;
import com.io.tms.model.Admin;

@Component("adminService")
@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;
	@Override
	public String login(Admin admin) {
		return adminDao.login(admin);
	}

}
