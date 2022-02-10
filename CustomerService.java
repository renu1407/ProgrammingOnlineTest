package com.sample.project;

import java.util.List;

public interface CustomerService {
	public Customer getCustomerDetailById(String id);
	public List<Customer> getCustomersTotalBill();

	
}
