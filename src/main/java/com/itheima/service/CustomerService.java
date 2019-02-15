package com.itheima.service;

import com.itheima.entity.Customer;

public interface CustomerService {
	/**
	 * 根据id获得客户
	 */
	public Customer findById(Long id);

}
