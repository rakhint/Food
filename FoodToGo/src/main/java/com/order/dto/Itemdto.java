package com.order.dto;

public class Itemdto {

	private long itemId;
	private String itemName;
	private int ItemQuantity;
	private double PricePerItem;
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQuantity() {
		return ItemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		ItemQuantity = itemQuantity;
	}
	public double getPricePerItem() {
		return PricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		PricePerItem = pricePerItem;
	}
	@Override
	public String toString() {
		return "Itemdto [itemId=" + itemId + ", itemName=" + itemName + ", ItemQuantity=" + ItemQuantity
				+ ", PricePerItem=" + PricePerItem + "]";
	}
	
}

	
