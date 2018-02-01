package uts.dao;

import java.util.List;

import uts.ui.pojo.Customer;
import uts.ui.pojo.PageCustomer;

public interface PageCustomerMapper {
	public List<Customer> findCustomer(PageCustomer pageCustomer);
}
