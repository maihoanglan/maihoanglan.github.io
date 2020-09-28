package com.ebanking.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "balance")
	private String balance;
	@Column(name = "type")
	private String type;
	@Column(name = "status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "bankId")
	private Bank bank;

	@OneToMany(mappedBy = "accIdFrom", fetch = FetchType.LAZY)
	private List<Transaction> tranFrom;
	
	@OneToMany(mappedBy = "accIdTo", fetch = FetchType.LAZY)
	private List<Transaction> tranTo;

	public Account() {
		super();
	}

	public Account(int id, String username, String password, String balance, String type, String status,
			Customer customer, Bank bank, List<Transaction> tranFrom, List<Transaction> tranTo) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.balance = balance;
		this.type = type;
		this.status = status;
		this.customer = customer;
		this.bank = bank;
		this.tranFrom = tranFrom;
		this.tranTo = tranTo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public List<Transaction> getTranFrom() {
		return tranFrom;
	}

	public void setTranFrom(List<Transaction> tranFrom) {
		this.tranFrom = tranFrom;
	}

	public List<Transaction> getTranTo() {
		return tranTo;
	}

	public void setTranTo(List<Transaction> tranTo) {
		this.tranTo = tranTo;
	}
	
	
}
