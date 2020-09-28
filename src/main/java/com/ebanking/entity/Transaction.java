package com.ebanking.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "type")
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "accountIdFrom")
	private Account accIdFrom;
	
	@ManyToOne
	@JoinColumn(name = "accountIdTo")
	private Account accIdTo;
	
	@Column(name = "amount")
	private String amount;
	@Column(name = "transactionDate")
	private Date transactionDate;
	
	public Transaction() {
		super();
	}

	public Transaction(int id, String type, Account accIdFrom, Account accIdTo, String amount, Date transactionDate) {
		super();
		this.id = id;
		this.type = type;
		this.accIdFrom = accIdFrom;
		this.accIdTo = accIdTo;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Account getAccIdFrom() {
		return accIdFrom;
	}

	public void setAccIdFrom(Account accIdFrom) {
		this.accIdFrom = accIdFrom;
	}

	public Account getAccIdTo() {
		return accIdTo;
	}

	public void setAccIdTo(Account accIdTo) {
		this.accIdTo = accIdTo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
}
