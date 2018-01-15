package uts.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uts.dao.CurrencyMapper;
import uts.ui.pojo.Currency;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpringMybatis {
	
	@Autowired
	private CurrencyMapper currencyMapper;
	
	@Test
	public void testSelect(){
		Map<String, String> keyMap = new HashMap<String, String>();
		keyMap.put("genInsttuCode", "HLBMY");
		keyMap.put("genLangId", "1");
		keyMap.put("genCcyCode", "MYR");
		Currency currency = currencyMapper.selectByPrimaryKey(keyMap);
		System.out.println(currency.getGenCcyName());
	}

}
