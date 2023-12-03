package com.upnextdev.simplecrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upnextdev.simplecrm.entity.CompanyEntity;
import com.upnextdev.simplecrm.jpa.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public List<CompanyEntity> getAllCompanies(){
		return companyRepository.findAll();
	}
}
