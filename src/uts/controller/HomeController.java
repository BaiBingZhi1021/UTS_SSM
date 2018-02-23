package uts.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import uts.ui.pojo.Currency;

@Controller
@RequestMapping({"/", "/homePage"})
public class HomeController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
}
