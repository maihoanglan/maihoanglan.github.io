package com.ebanking.entity;

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
@Table(name = "bank")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "branch")
	private String branch;
	@Column(name = "district")
	private String district;
	@Column(name = "city")
	private String city;
	
	@OneToMany(mappedBy = "bank", fetch = FetchType.LAZY)
	private List<Account> account;

	public Bank() {
		super();
	}

	public Bank(int id, String branch, String district, String city, List<Account> account) {
		super();
		this.id = id;
		this.branch = branch;
		this.district = district;
		this.city = city;
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
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

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	
	
	
}
