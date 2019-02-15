package com.itheima.web.action;

import com.itheima.entity.Customer;
import com.itheima.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9042633030911469587L;
	
	private Long cust_id;
	private Customer customer;
	private CustomerService customerService;
	
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getCust_id() {
		return cust_id;
	}

	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}

	public String findCutomerById() throws Exception {
		
		customer = customerService.findById(cust_id);
		
		System.out.println("前端页面传过来的id是："+cust_id);
		
		return SUCCESS;
	}
	
}
