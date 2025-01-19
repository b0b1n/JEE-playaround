package com.skious.onlinestore.core.services;

import java.util.List;

import com.skious.onlinestore.persistence.enteties.Product;

public interface ProductManagementService {

	List<Product> getProducts();

	Product getProductById(int id);
	
}
