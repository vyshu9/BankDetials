package com.cf.cust.model;

import java.util.List;

import javax.transaction.Transaction;

import com.cf.cust.controller.Transactions;

public class customer {
	public int cid;
	public String cname;
	public String address;
	
	public customer() {
	} 
	public customer(int cid, String cname, String address) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.address = address;
	}
	public int getCid() {
	return cid;
	} 
	public void setCid(int cid) {
	this.cid = cid;
	}
	public String getCname() {
	return cname;
	} 
	public void setCname(String cname) {
	this.cname = cname;
	}
	public String getAddress() {
	return address;
	} 
	public void setAddress(String address) {
	this.address = address;
	}
	public List<Transaction> insertCustomer1() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Transactions> findByttype(String ttyp) {
		// TODO Auto-generated method stub
		return null;
	}
	}




