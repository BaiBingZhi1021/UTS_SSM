package uts.service;

import java.util.List;
import java.util.Map;

import uts.ui.pojo.Currency;

public interface CurrencyService {
	List<Currency> listCurrency(String genInsttuCode);
	
	int deleteByPrimaryKey(Map<String, String> key);

    int insert(Currency record);

    int insertSelective(Currency record);

    Currency selectByPrimaryKey(Map<String, String> key);

    int updateByPrimaryKeySelective(Currency record);

    int updateByPrimaryKey(Currency record);
}
