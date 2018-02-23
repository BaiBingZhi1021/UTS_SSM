package uts.alerts;

import uts.ui.pojo.Customer;

public class CustomerAlertHandler {
	
	public void handleCustomerAlert(Customer customer){
		System.out.println("Hello " + customer.getCustLastName() + "!");
	}
}
