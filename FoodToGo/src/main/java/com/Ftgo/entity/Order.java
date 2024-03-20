package com.Ftgo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
	private String customerName;
	private double orderAmount;
    private String transactionId;
	private String orderStatus;
	private String items;
	private LocalDateTime orderTime;
	
	//constructor
	public Order(String customerName,double orderAmount,String transactionId,String orderStatus,LocalDateTime orderTime, String items) {
		this.orderTime=orderTime;
		this.customerName=customerName;
		this.orderStatus=orderStatus;
		this.orderAmount=orderAmount;
		this.items=items;
		this.transactionId=transactionId;
		
		}
}
