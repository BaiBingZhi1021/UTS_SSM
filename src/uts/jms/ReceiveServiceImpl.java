package uts.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;

import uts.ui.pojo.Customer;

public class ReceiveServiceImpl implements ReceiveService {
	JmsOperations jmsOpereations;
	
	@Autowired
	public ReceiveServiceImpl(JmsOperations jmsOpereations){
		this.jmsOpereations = jmsOpereations;
	}
	@Override
	public Customer receiveCustomerAlert() {
		return (Customer)jmsOpereations.receiveAndConvert();
	}

}
