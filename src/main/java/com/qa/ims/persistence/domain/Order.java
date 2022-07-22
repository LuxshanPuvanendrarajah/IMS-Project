package com.qa.ims.persistence.domain;

public class Order {
	private Long order_id;
	private Long customer_id;

	

	public Order(Long customer_id) {
		this.setCustomer_Id(customer_id);
		}
		
	
	public Order(Long order_id,Long customer_id) {
		this.setId(order_id);
		this.setCustomer_Id(customer_id);
	
		}
	
	public Long getOrder_Id() {
		return order_id;
	}
	public void setId(Long order_id) {
		this.order_id = order_id;
	}
	public Long getCustomer_Id() {
		return customer_id;
	}
	public void setCustomer_Id(Long customer_id) {
		this.customer_id = customer_id;
	}
	@Override
	public String toString() {
		return "id: " + order_id + "  customer_id: " + customer_id  ;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((customer_id == null) ? 0 : customer_id.hashCode());
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
		Order other = (Order) obj;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (customer_id == null) {
			if (other.customer_id != null)
				return false;
		} else if (!customer_id.equals(other.customer_id))
			return false;
		return true;
	}

}
