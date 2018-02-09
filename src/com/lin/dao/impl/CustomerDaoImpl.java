package com.lin.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.lin.dao.CustomerDao;
import com.lin.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public void save(Customer customer) {
		System.out.println("DAO�㱻���ʡ�����");
		this.getHibernateTemplate().save(customer);

	}

}
