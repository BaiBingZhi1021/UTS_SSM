package uts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import uts.service.CustomerService;
import uts.ui.pojo.Customer;
import uts.ui.pojo.PageCustomer;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(method=RequestMethod.GET, value="listCustomer")
	public ModelAndView gotoCustomerList(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("basic/listCustomer");
		return mav;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="listCustomer")
	public ModelAndView getCustomerList(PageCustomer pageCustomer){
		ModelAndView mav = new ModelAndView();
		if(pageCustomer.getEnd() == 0){
			pageCustomer.setEnd(10);
		}
		List<Customer> listCustomer = customerService.findCustomer(pageCustomer);
		mav.addObject("customerList", listCustomer);
		mav.addObject("pageCustomer", pageCustomer);
		mav.setViewName("basic/listCustomer");
		return mav;
	}
}
