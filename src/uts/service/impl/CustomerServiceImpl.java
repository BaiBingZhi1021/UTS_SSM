package uts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uts.dao.PageCustomerMapper;
import uts.service.CustomerService;
import uts.ui.pojo.Customer;
import uts.ui.pojo.PageCustomer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private PageCustomerMapper pageCustomerMapper;
	
	@Override
	public List<Customer> findCustomer(PageCustomer pageCustomer) {
		// TODO Auto-generated method stub
		pageCustomerMapper.findCustomer(pageCustomer);
		return pageCustomer.getCustomerList();
	}

}
