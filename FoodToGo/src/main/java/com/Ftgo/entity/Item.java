package com.Ftgo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "id")
private long id;
@Column(name = "item_name")
private String itemName;

@Column(name = "quantity")
private int quantity;

@Column(name = "itemPrice")
private double itemPrice;


public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getItemPrice() {
	return itemPrice;
}
public void setItemPrice(double itemPrice) {
	this.itemPrice = itemPrice;
}
}
