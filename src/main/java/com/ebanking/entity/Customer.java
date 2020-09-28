package com.ebanking.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	@Column(name = "birthdate")
	private Date birthdate;
	@Column(name = "address")
	private String address;
	@Column(name = "district")
	private String district;
	@Column(name = "city")
	private String city;
	@Column(name = "gender")
	private String gender;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "cmnd")
	private String cmnd;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
	private List<Account> account;

	public Customer() {
		super();
	}

	public Customer(int id, String name, Date birthdate, String address, String district, String city, String gender,
			String nationality, String cmnd, String email, String phone, List<Account> account) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.address = address;
		this.district = district;
		this.city = city;
		this.gender = gender;
		this.nationality = nationality;
		this.cmnd = cmnd;
		this.email = email;
		this.phone = phone;
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}
	
	
}
