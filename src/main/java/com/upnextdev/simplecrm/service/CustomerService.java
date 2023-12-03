package com.upnextdev.simplecrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upnextdev.simplecrm.entity.CustomerEntity;
import com.upnextdev.simplecrm.jpa.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<CustomerEntity> getAllCustomersFromDB(){
		return customerRepository.findAll();
	}
}
