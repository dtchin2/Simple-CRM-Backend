package com.upnextdev.simplecrm.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="department_table")
public class DepartmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "department_id")
	private Integer departmentId;
	@Column(name = "department_name")
	private String departmentName;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private CompanyEntity company;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	//@JoinColumn(name = "team_member_id")
	private Set<TeamMemberEntity> teamMember;
	
	public DepartmentEntity() {}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public CompanyEntity getCompany() {
		return company;
	}

	public void setCompany(CompanyEntity company) {
		this.company = company;
	}
// Do Not Include for collections, it REALLY BREAKS S**T
//	public Set<TeamMemberEntity> getTeamMember() {
//		return teamMember;
//	}
//
//	public void setTeamMember(Set<TeamMemberEntity> teamMember) {
//		this.teamMember = teamMember;
//	}

	@Override
	public String toString() {
		return "DepartmentEntity [departmentId=" + departmentId + ", departmentName=" + departmentName + ", company="
				+ company + "]";
	}
	
}
