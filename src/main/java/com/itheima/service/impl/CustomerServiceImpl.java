package com.itheima.service.impl;

import com.itheima.dao.CustomerDao;
import com.itheima.entity.Customer;
import com.itheima.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Customer findById(Long id) {
		return customerDao.findById(id);
	}

}
