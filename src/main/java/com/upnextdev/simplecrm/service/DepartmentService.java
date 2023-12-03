package com.upnextdev.simplecrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upnextdev.simplecrm.entity.DepartmentEntity;
import com.upnextdev.simplecrm.jpa.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<DepartmentEntity> getAllDepartmentsFromDB(){
		return departmentRepository.findAll();
	}
	
	public Optional<DepartmentEntity> findDepartmentById(Integer depID) {
		return departmentRepository.findById(depID);
	}
}
