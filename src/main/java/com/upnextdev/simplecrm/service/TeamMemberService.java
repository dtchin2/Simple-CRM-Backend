package com.upnextdev.simplecrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upnextdev.simplecrm.entity.DepartmentEntity;
import com.upnextdev.simplecrm.entity.TeamMemberEntity;
import com.upnextdev.simplecrm.jpa.TeamMemberRepository;

@Service
public class TeamMemberService {

	@Autowired
	private TeamMemberRepository teamMemberRepository;
	@Autowired
	private DepartmentService departmentService;
	
	public List<TeamMemberEntity> getAllTeamMembersFromDB(){
		return teamMemberRepository.findAll();
	}
}
