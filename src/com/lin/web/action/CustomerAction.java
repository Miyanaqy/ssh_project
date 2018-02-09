package com.lin.web.action;

import com.lin.domain.Customer;
import com.lin.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

	private Customer customer = new Customer();
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	/**
	 * 
	 */
	private CustomerService customerService;
	
	
	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	
	private static final long serialVersionUID = -23791118250071780L;

	public String add() {
		System.out.println("web≤„±ª∑√Œ °§°§°§");
		System.out.println(customer);
		customerService.save(customer);
		return NONE;
	}

	


}
