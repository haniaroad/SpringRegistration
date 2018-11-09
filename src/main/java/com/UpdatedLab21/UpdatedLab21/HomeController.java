package com.UpdatedLab21.UpdatedLab21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired

	private Person p;

	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("index");

	}

	@RequestMapping("register")
	public ModelAndView register() {

		return new ModelAndView("register");
	}

	@RequestMapping("formresults")

	public ModelAndView formTest(@RequestParam("firstname") String fname, @RequestParam("lastname") String lname) {
		p.setFirstName(fname);
		p.setLastName(lname);
		String sayHello = "Hello, " + fname + " " + lname;
		return new ModelAndView("formresults", "userData", p);

	}
}