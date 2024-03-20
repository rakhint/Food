package com.order.dto;

public class OrderResponse {
	
 private long accountNumber;
 private String transactionId;
 private String responseMsg;
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public String getResponseMsg() {
	return responseMsg;
}
public void setResponseMsg(String responseMsg) {
	this.responseMsg = responseMsg;
}
public String getTransactionId() {
	return transactionId;
}
public void setTransactionId(String transactionId) {
	this.transactionId = transactionId;
}
 
}
