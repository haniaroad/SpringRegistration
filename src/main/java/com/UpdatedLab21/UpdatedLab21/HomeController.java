package com.UpdatedLab21.UpdatedLab21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired

	private CustomerDao dao;

	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("index");

	}

	@RequestMapping("register")
	public ModelAndView register() {

		return new ModelAndView("register");
	}

	@RequestMapping("formresults")

	public ModelAndView formTest(Customer c) {
//		p.setFirstName(fname);
//		p.setLastName(lname);
//		String sayHello = "Hello, " + fname + " " + lname;
		dao.addCustomer(c.getFirstName(), c.getLastName(), c.getEmail(), c.getPhone(), c.getPassword());
		
		return new ModelAndView("formresults", "userData", c.getFirstName());

	}
	
	@RequestMapping("order")
	public ModelAndView order() {

		return new ModelAndView("order");

	}
	
	@RequestMapping("thankyou")
	public ModelAndView thankYou() {

		return new ModelAndView("thankyou");

	}
	
	@RequestMapping("orderResults")

	public ModelAndView itemOrder(Items i) {

		dao.addItem(i.getName(), i.getDescription(), i.getQuantity(), i.getPrice());
		
		return new ModelAndView("thankyou");

	}
	
	@RequestMapping("signin")

	public ModelAndView signIn() {

		
		
		return new ModelAndView("signin");

	}
	
	@RequestMapping("buycoffee")

	public ModelAndView buyCoffee() {

		
		
		return new ModelAndView("buycoffee");

	}
	
	@RequestMapping("buylatte")

	public ModelAndView buyLatte() {

		
		
		return new ModelAndView("buylatte");

	}
	
	@RequestMapping("buyfrapp")

	public ModelAndView buyFrapp() {

		
		
		return new ModelAndView("buyfrapp");

	}
}