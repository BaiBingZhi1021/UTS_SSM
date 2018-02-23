package uts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import uts.ui.pojo.Currency;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		Currency currency = (Currency)context.getBean("currency");
		System.out.print(currency.getGenCcyCode());
		
	}

}
