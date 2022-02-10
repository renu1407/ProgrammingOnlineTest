package com.sample.project;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.*;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	final Logger logger =LoggerFactory.getLogger(CustomerDAO.class);

	@Override
	public List<Customer> getCustomerList()
	{
		List<Customer> customerList=new ArrayList<Customer>();
		try {
			Customer customer=new Customer();
			customer.setCustomerId("1");
			customer.setCustomerName("abc");
			customer.setBillAmount(0d);
			List<Products> productList= getProductList();
			customer.setProductList(productList);
			customerList.add(customer);
			
		}
		catch(Exception e)
		{
			logger.error("The exception occuredin Customer List "+e.getMessage());
		}
		
		
		return customerList;
	}
	@Override
	public List<Products> getProductList()
	{
		List<Products> productsList=new ArrayList<Products>();
		
		try {
			Products product=new Products();
			product.setProductId("101");
			product.setProductName("Apple");
			product.setDiscountAmount(10d);
			product.setPrice(150d);
			product.setQuantity(1f);
			Products product2=new Products();
			product2.setProductId("102");
			product2.setProductName("orange");
			product2.setDiscountAmount(12d);
			product2.setPrice(100d);
			product2.setQuantity(1f);
			productsList.add(product2);
		}
		catch(Exception e)
		{
			logger.error("The exception occured in Product List"+e.getMessage());
		}
		return productsList;
		
	}
	
	
	
	
}
