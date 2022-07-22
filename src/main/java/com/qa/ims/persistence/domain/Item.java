package com.qa.ims.persistence.domain;

public class Item {

	private Long item_id;
	private String itemName;
	private Float itemPrice;
	
	public Item(String itemName,Float itemPrice) {
		this.setItemName(itemName);
		this.setItemPrice(itemPrice);
	}
	public Item(Long item_id,String itemName,Float itemPrice) {
		this.setId(item_id);
		this.setItemName(itemName);
		this.setItemPrice(itemPrice);
	}
	
	public Long getItem_Id() {
		return item_id;
	}
	public void setId(Long item_id) {
		this.item_id = item_id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Float itemPrice) {
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "id: " + item_id + "  Item: " + itemName + "  Price : " + itemPrice ;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((item_id == null) ? 0 : item_id.hashCode());
		result = prime * result + ((itemPrice == null) ? 0 : itemPrice.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (getItemName() == null) {
			if (other.getItemName() != null)
				return false;
		} else if (!getItemName().equals(other.getItemName()))
			return false;
		if (item_id == null) {
			if (other.item_id != null)
				return false;
		} else if (!item_id.equals(other.item_id))
			return false;
		if (itemPrice == null) {
			if (other.itemPrice != null)
				return false;
		} else if (!itemPrice.equals(other.itemPrice))
			return false;
		return true;
	}
}
