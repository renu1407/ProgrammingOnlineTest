package com.sample.project;

import java.util.List;

import lombok.Data;

@Data
public class Customer {
	
	private String customerId;
	private String customerName;
	private Double BillAmount;
	private List<Products> ProductList;
	public List<Products> getProductList() {
		return ProductList;
	}
	public void setProductList(List<Products> productList) {
		ProductList = productList;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Double getBillAmount() {
		return BillAmount;
	}
	public void setBillAmount(Double billAmount) {
		BillAmount = billAmount;
	}

}
