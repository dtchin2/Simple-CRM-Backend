package com.upnextdev.simplecrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upnextdev.simplecrm.entity.CustomerEntity;
import com.upnextdev.simplecrm.service.CustomerService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer")
	public List<CustomerEntity> getAllCustomers(){
		return customerService.getAllCustomersFromDB();
	}
	
	@GetMapping("/customer/{email}")
	public CustomerEntity getCustomerByEmail(@PathVariable("email") String email){
		return customerService.getCustomerByEmail(email);
	}

}
