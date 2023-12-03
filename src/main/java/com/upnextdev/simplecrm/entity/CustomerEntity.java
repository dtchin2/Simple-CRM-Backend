package com.upnextdev.simplecrm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_table")
public class CustomerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Integer customerID;
	@Column(name = "customer_fname")
	private String customerFirstName;
	@Column(name = "customer_mi")
	private String customerMiddleInitial;
	@Column(name = "customer_lname")
	private String customerLastName;
	@Column(name = "customer_email")
	private String customerEmail;
	@Column(name = "customer_phone")
	private String customerPhone;
	@Column(name = "customer_contact_pref")
	private String customerContactPreference;
	@Column(name = "customer_street")
	private String customerStreetAddress;
	@Column(name = "customer_street2")
	private String customerStreetAddress2;
	@Column(name = "customer_city")
	private String customerCity;
	@Column(name = "customer_state")
	private String customerStateAbbreviation;
	@Column(name = "customer_zipcode")
	private String customerZipCode;
	@Column(name = "isCustomerActive")
	private String isCustomerActive;
	
	public CustomerEntity() {}

	public Integer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerMiddleInitial() {
		return customerMiddleInitial;
	}

	public void setCustomerMiddleInitial(String customerMiddleInitial) {
		this.customerMiddleInitial = customerMiddleInitial;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerContactPreference() {
		return customerContactPreference;
	}

	public void setCustomerContactPreference(String customerContactPreference) {
		this.customerContactPreference = customerContactPreference;
	}

	public String getCustomerStreetAddress() {
		return customerStreetAddress;
	}

	public void setCustomerStreetAddress(String customerStreetAddress) {
		this.customerStreetAddress = customerStreetAddress;
	}

	public String getCustomerStreetAddress2() {
		return customerStreetAddress2;
	}

	public void setCustomerStreetAddress2(String customerStreetAddress2) {
		this.customerStreetAddress2 = customerStreetAddress2;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerStateAbbreviation() {
		return customerStateAbbreviation;
	}

	public void setCustomerStateAbbreviation(String customerStateAbbreviation) {
		this.customerStateAbbreviation = customerStateAbbreviation;
	}

	public String getCustomerZipCode() {
		return customerZipCode;
	}

	public void setCustomerZipCode(String customerZipCode) {
		this.customerZipCode = customerZipCode;
	}

	public String getIsCustomerActive() {
		return isCustomerActive;
	}

	public void setIsCustomerActive(String isCustomerActive) {
		this.isCustomerActive = isCustomerActive;
	}

	@Override
	public String toString() {
		return "CustomerEntity [customerID=" + customerID + ", customerFirstName=" + customerFirstName
				+ ", customerMiddleInitial=" + customerMiddleInitial + ", customerLastName=" + customerLastName
				+ ", customerEmail=" + customerEmail + ", customerPhone=" + customerPhone
				+ ", customerContactPreference=" + customerContactPreference + ", customerStreetAddress="
				+ customerStreetAddress + ", customerStreetAddress2=" + customerStreetAddress2 + ", customerCity="
				+ customerCity + ", customerStateAbbreviation=" + customerStateAbbreviation + ", customerZipCode="
				+ customerZipCode + ", isCustomerActive=" + isCustomerActive + "]";
	}
	
	

}
