package com.qa.ims.persistence.domain;

public class Order_item {
	

	private Long order_id;
	private Long item_id;
	private Long orderQuantity;

	public Order_item( Long orderQuantity, Long order_id, Long item_id) {
		super();
		this.order_id = order_id;
		this.item_id = item_id;
		this.orderQuantity = orderQuantity;
	}

	public Order_item(Long item_id, Long orderQuantity) {

		super();
		this.item_id = item_id;
		this.orderQuantity = orderQuantity;

	}

	public Order_item(Long item_id) {
		super();
		this.item_id = item_id;
	}

	public Long getOrderId() {
		return order_id;
	}

	public void setOrderId(Long order_id) {
		this.order_id = order_id;
	}

	public Long getItemId() {
		return item_id;
	}

	public void setItemId(Long item_id) {
		this.item_id = item_id;
	}

	public Long getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Long orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	@Override
	public String toString() {
		return   " orderid: " + order_id + " itemid: " + item_id + " orderquantity: "
				+ orderQuantity ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item_id == null) ? 0 : item_id.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((orderQuantity == null) ? 0 : orderQuantity.hashCode());
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
		Order_item other = (Order_item) obj;
		if (item_id == null) {
			if (other.item_id != null)
				return false;
		} else if (!item_id.equals(other.item_id))
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (orderQuantity == null) {
			if (other.orderQuantity != null)
				return false;
		} else if (!orderQuantity.equals(other.orderQuantity))
			return false;
		return true;
	}


	}
	