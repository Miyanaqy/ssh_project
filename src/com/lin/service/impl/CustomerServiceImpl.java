package com.lin.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.lin.dao.CustomerDao;
import com.lin.domain.Customer;
import com.lin.service.CustomerService;

@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	

	public CustomerDao getCustomerDao() {
		return customerDao;
	}


	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}


	@Override
	public void save(Customer customer) {
		System.out.println("service≤„±ª∑√Œ °§°§°§");
		customerDao.save(customer);
		
	}

}
