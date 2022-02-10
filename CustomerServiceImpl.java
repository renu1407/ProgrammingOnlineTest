package com.sample.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDAO customerDAO;
	
	@Override
	public Customer getCustomerDetailById(String id)
	{
		String customerId="";
		Customer customer = new Customer();
		List<Customer> customerList=customerDAO.getCustomerList();
		start:for(Customer cust:customerList)
		{
			customerId=cust.getCustomerId();
			if(id.equals(customerId))
			{
				customer=cust;
				break start;
			}
			
		}
		return customer;
	}
	
	@Override
	public List<Customer> getCustomersTotalBill(){
		List<Customer> customerList=new ArrayList<Customer>();
		List<Customer> customerListupdated=new ArrayList<Customer>();
		float quantity=0f;
		double billAmount=0d;
		double price=0d;
		
		start:for(Customer cust:customerList)
		{
			List<Products> productList=cust.getProductList();
			for(Products product:productList)
			{
				quantity=product.getQuantity();
				price=product.getPrice();
				billAmount=billAmount+(quantity*price);
				billAmount=billAmount-product.getDiscountAmount();
				
				
			}
			cust.setBillAmount(billAmount);
			customerListupdated.add(cust);
		}
		return customerListupdated;
		
	}

}
