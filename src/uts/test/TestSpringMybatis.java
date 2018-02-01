package uts.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uts.dao.CurrencyMapper;
import uts.dao.PageCustomerMapper;
import uts.ui.pojo.Currency;
import uts.ui.pojo.Customer;
import uts.ui.pojo.PageCustomer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpringMybatis {
	
	@Autowired
	private CurrencyMapper currencyMapper;
	
	@Autowired
	private PageCustomerMapper pageCustomerMapper;
	
	@Test
	public void testSelect(){
		Map<String, String> keyMap = new HashMap<String, String>();
		keyMap.put("genInsttuCode", "HLBMY");
		keyMap.put("genLangId", "1");
		keyMap.put("genCcyCode", "MYR");
		Currency currency = currencyMapper.selectByPrimaryKey(keyMap);
		System.out.println(currency.getGenCcyName());
	}
	
	@Test
	public void testFindCustomer(){
		PageCustomer pageCustomer = new PageCustomer();
		pageCustomer.setGenBrchCode("52345");
		pageCustomer.setStart(1);
		pageCustomer.setEnd(10);
		pageCustomer.setCount(0);
		pageCustomer.setCustomerList(new ArrayList<Customer>());
		pageCustomerMapper.findCustomer(pageCustomer);
		System.out.println(pageCustomer.getCount());
		for(Customer customer : pageCustomer.getCustomerList()){
			System.out.println("customer no:" + customer.getCustNo() + ";" + "customer name:" + customer.getCustLastName());
		}
	}

}
