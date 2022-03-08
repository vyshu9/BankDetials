package com.cf.cust.model;

public class Transactions {
	public int transactionId;
	public String transcationType;
	public String transactionAmount;
	public String transactionDate;
	public Transactions(){
		
	}
	public Transactions(int transactionId, String transcationType, String transactionAmount, String transactionDate) {
		super();
		this.transactionId = transactionId;
		this.transcationType = transcationType;
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
	}

	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTranscationType() {
		return transcationType;
	}
	public void setTranscationType(String transcationType) {
		this.transcationType = transcationType;
	}
	public String getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}


}




