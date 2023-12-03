package com.upnextdev.simplecrm.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "company_table")
public class CompanyEntity {

	@Id
	@Column(name = "company_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer companyId;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "company_phone")
	private String companyPhoneNumber;
	@Column(name = "company_street")
	private String companyStreetAddress;
	@Column(name = "company_street2")
	private String companyStreetAddress2;
	@Column(name = "company_city")
	private String companyCity;
	@Column(name = "company_state")
	private String companyStateAbbreviation;
	@Column(name = "company_zipcode")
	private String companyZipCode;
	@Column(name = "company_startdate")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date companyStartDate;
	@Column(name = "company_active")
	private Integer isCompanyActive;

	@OneToMany(mappedBy = "company")
	private Set<DepartmentEntity> departments = new HashSet<>();

	public CompanyEntity() {
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyPhoneNumber() {
		return companyPhoneNumber;
	}

	public void setCompanyPhoneNumber(String companyPhoneNumber) {
		this.companyPhoneNumber = companyPhoneNumber;
	}

	public String getCompanyStreetAddress() {
		return companyStreetAddress;
	}

	public void setCompanyStreetAddress(String companyStreetAddress) {
		this.companyStreetAddress = companyStreetAddress;
	}

	public String getCompanyStreetAddress2() {
		return companyStreetAddress2;
	}

	public void setCompanyStreetAddress2(String companyStreetAddress2) {
		this.companyStreetAddress2 = companyStreetAddress2;
	}

	public String getCompanyStateAbbreviation() {
		return companyStateAbbreviation;
	}

	public void setCompanyStateAbbreviation(String companyStateAbbreviation) {
		this.companyStateAbbreviation = companyStateAbbreviation;
	}

	public String getCompanyZipCode() {
		return companyZipCode;
	}

	public void setCompanyZipCode(String companyZipCode) {
		this.companyZipCode = companyZipCode;
	}

	public Date getCompanyStartDate() {
		return companyStartDate;
	}

	public void setCompanyStartDate(Date companyStartDate) {
		this.companyStartDate = companyStartDate;
	}

	public Integer getIsCompanyActive() {
		return isCompanyActive;
	}

	public void setIsCompanyActive(Integer isCompanyActive) {
		this.isCompanyActive = isCompanyActive;
	}

	public String getCompanyCity() {
		return companyCity;
	}

	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}

	@Override
	public String toString() {
		return "CompanyEntity [companyId=" + companyId + ", companyName=" + companyName + ", companyPhoneNumber="
				+ companyPhoneNumber + ", companyStreetAddress=" + companyStreetAddress + ", companyStreetAddress2="
				+ companyStreetAddress2 + ", companyCity=" + companyCity + ", companyStateAbbreviation="
				+ companyStateAbbreviation + ", companyZipCode=" + companyZipCode + ", companyStartDate="
				+ companyStartDate + ", isCompanyActive=" + isCompanyActive + "]";
	}

}
