package com.skious.onlinestore.persistence.dao;

import java.util.List;

import com.skious.onlinestore.persistence.dto.ProductDto;


public interface ProductDao {
	
	List<ProductDto> getProducts();

	ProductDto getProductById(int productId);
	
}
