package uts.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uts.dao.CurrencyMapper;
import uts.service.CurrencyService;
import uts.ui.pojo.Currency;

@Service
public class CurrencyServiceImpl implements CurrencyService {

	@Autowired
	private CurrencyMapper currencyMapper;
	
	@Override
	public int deleteByPrimaryKey(Map<String, String> key) {
		// TODO Auto-generated method stub
		return currencyMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(Currency record) {
		// TODO Auto-generated method stub
		return currencyMapper.insert(record);
	}

	@Override
	public int insertSelective(Currency record) {
		// TODO Auto-generated method stub
		return currencyMapper.insertSelective(record);
	}

	@Override
	public Currency selectByPrimaryKey(Map<String, String> key) {
		// TODO Auto-generated method stub
		return currencyMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByPrimaryKeySelective(Currency record) {
		// TODO Auto-generated method stub
		return currencyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Currency record) {
		// TODO Auto-generated method stub
		return currencyMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Currency> listCurrency(String genInsttuCode) {
		// TODO Auto-generated method stub
		return currencyMapper.listCurrency(genInsttuCode);
	}

}
