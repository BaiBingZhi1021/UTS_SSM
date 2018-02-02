package uts.alerts;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.MessageCreator;

import uts.ui.pojo.Customer;

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

}
