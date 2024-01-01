package com.upnextdev.simplecrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upnextdev.simplecrm.entity.TeamMemberEntity;
import com.upnextdev.simplecrm.service.TeamMemberService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path="/api")
public class TeamMemberController {

	@Autowired
	private TeamMemberService teamMemberService;
	
	@GetMapping("/member")
	public List<TeamMemberEntity> getAllTeamMembers(){
		return teamMemberService.getAllTeamMembersFromDB();
	}
}
