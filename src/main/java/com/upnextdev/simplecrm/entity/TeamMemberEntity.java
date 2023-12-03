package com.upnextdev.simplecrm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "team_member_table")
public class TeamMemberEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="team_member_id")
	private Integer teamMemberId;
	@Column(name="team_member_fname")
	private String teamMemberFName;
	@Column(name="team_member_mi")
	private String teamMemberMi;
	@Column(name="team_member_lname")
	private String teamMemberLName;
	@Column(name="team_member_email")
	private String teamMemberEmail;
	@Column(name="team_member_phone")
	private String teamMemberPhone;
	@Column(name="team_member_active")
	private Integer isTeamMemberActive;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private DepartmentEntity department;

	public TeamMemberEntity() {}
	
	public Integer getTeamMemberId() {
		return teamMemberId;
	}

	public void setTeamMemberId(Integer teamMemberId) {
		this.teamMemberId = teamMemberId;
	}

	public String getTeamMemberFName() {
		return teamMemberFName;
	}

	public void setTeamMemberFName(String teamMemberFName) {
		this.teamMemberFName = teamMemberFName;
	}

	public String getTeamMemberMi() {
		return teamMemberMi;
	}

	public void setTeamMemberMi(String teamMemberMi) {
		this.teamMemberMi = teamMemberMi;
	}

	public String getTeamMemberLName() {
		return teamMemberLName;
	}

	public void setTeamMemberLName(String teamMemberLName) {
		this.teamMemberLName = teamMemberLName;
	}

	public String getTeamMemberEmail() {
		return teamMemberEmail;
	}

	public void setTeamMemberEmail(String teamMemberEmail) {
		this.teamMemberEmail = teamMemberEmail;
	}

	public String getTeamMemberPhone() {
		return teamMemberPhone;
	}

	public void setTeamMemberPhone(String teamMemberPhone) {
		this.teamMemberPhone = teamMemberPhone;
	}

	public Integer getIsTeamMemberActive() {
		return isTeamMemberActive;
	}

	public void setIsTeamMemberActive(Integer isTeamMemberActive) {
		this.isTeamMemberActive = isTeamMemberActive;
	}

	public DepartmentEntity getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentEntity department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "TeamMemberEntity [teamMemberId=" + teamMemberId + ", teamMemberFName=" + teamMemberFName
				+ ", teamMemberMi=" + teamMemberMi + ", teamMemberLName=" + teamMemberLName + ", teamMemberEmail="
				+ teamMemberEmail + ", teamMemberPhone=" + teamMemberPhone + ", isTeamMemberActive="
				+ isTeamMemberActive + ", department=" + department + "]";
	}
}
