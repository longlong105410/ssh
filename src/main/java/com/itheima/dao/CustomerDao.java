package com.itheima.dao;

import com.itheima.entity.Customer;

public interface CustomerDao {
	/**
	 * 根据id获得客户
	 */
	public Customer findById(Long id);

}
