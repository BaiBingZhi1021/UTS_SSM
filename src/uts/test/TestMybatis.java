package uts.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import uts.dao.CurrencyMapper;
import uts.ui.pojo.Currency;

public class TestMybatis {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		CurrencyMapper currencyMapper = sqlSession.getMapper(CurrencyMapper.class);
		Map<String, String> keyMap = new HashMap<String, String>();
		keyMap.put("genInsttuCode", "HLBMY");
		keyMap.put("genLangId", "1");
		keyMap.put("genCcyCode", "MYR");
		Currency currency = currencyMapper.selectByPrimaryKey(keyMap);
		System.out.println(currency.getGenCcyName());
	}

}
