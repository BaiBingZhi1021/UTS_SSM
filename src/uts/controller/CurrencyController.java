package uts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import uts.service.CurrencyService;
import uts.ui.pojo.Currency;

@Controller
public class CurrencyController {
	@Autowired
	CurrencyService currencyService;
	
	@RequestMapping("listCurrency")
	public ModelAndView listCurrency(){
		ModelAndView mav = new ModelAndView();
		List<Currency> currencyList = currencyService.listCurrency("HLBMY");
		mav.addObject("currencyList",currencyList);
		mav.setViewName("listCurrency");
		
		return mav;
	}
}
