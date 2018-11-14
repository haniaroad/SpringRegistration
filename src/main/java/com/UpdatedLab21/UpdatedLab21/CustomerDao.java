package com.UpdatedLab21.UpdatedLab21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Repository // This annotation allows us to communicate with the DB
public class CustomerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	


	public int addCustomer(String firstName, String lastName, String email, String phone, String password) {

		String addQuery = "insert into Customer(FirstName, LastName, Email, Phone, UserPassword) values(?, ?, ?, ?, ?)";
		return jdbcTemplate.update(addQuery, firstName, lastName, email, phone, password);
	}
	
	public int addItem(String name, String description, int quantity, double price) {

		String addQuery = "insert into Items(Name, Description, Quantity, Price) values(?, ?, ?, ?)";
		return jdbcTemplate.update(addQuery, name, description, quantity, price);
	}
	
	

}