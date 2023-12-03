package com.upnextdev.simplecrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upnextdev.simplecrm.entity.CompanyEntity;
import com.upnextdev.simplecrm.service.CompanyService;

@RestController
@RequestMapping(path = "/api")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/company")
	public List<CompanyEntity> getAllCompanies(){
		return companyService.getAllCompanies();
	}
}
