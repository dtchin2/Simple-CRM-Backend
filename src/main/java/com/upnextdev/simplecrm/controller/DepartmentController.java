package com.upnextdev.simplecrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upnextdev.simplecrm.entity.DepartmentEntity;
import com.upnextdev.simplecrm.service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/department")
	public List<DepartmentEntity> getAllDepartments(){
		return departmentService.getAllDepartmentsFromDB();
	}
}
