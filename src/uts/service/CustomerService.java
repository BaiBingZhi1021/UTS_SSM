package uts.service;

import java.util.List;

import uts.ui.pojo.Customer;
import uts.ui.pojo.PageCustomer;

public interface CustomerService {
	public List<Customer> findCustomer(PageCustomer pageCustomer);
}
