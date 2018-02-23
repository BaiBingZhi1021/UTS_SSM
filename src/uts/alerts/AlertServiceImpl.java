package uts.alerts;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.stereotype.Service;

import uts.ui.pojo.Customer;

@Service("alertService")
public class AlertServiceImpl implements AlertService {

	private JmsOperations jmsOperations;
	
	@Autowired
	public AlertServiceImpl(JmsOperations jmsOperations){
		this.jmsOperations = jmsOperations;
	}
	@Override
	public void sendCustomerAlert(final Customer customer) {
		/*jmsOperations.send("customer.alert.queue", new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage(customer);
			}
		});*/
		/*jmsOperations.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage(customer);
			}
		});*/
		jmsOperations.convertAndSend(customer);
	}

	public Customer retrieveSpittleAlert(){
		return (Customer)jmsOperations.receiveAndConvert();
	}
}
