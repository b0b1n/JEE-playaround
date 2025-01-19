package com.skious.onlinestore.core.services.impl;

import java.util.List;

import com.skious.onlinestore.core.services.ProductManagementService;
import com.skious.onlinestore.persistence.dao.ProductDao;
import com.skious.onlinestore.persistence.dao.impl.MySqlJdbcProductDao;
import com.skious.onlinestore.persistence.dto.ProductDto;
import com.skious.onlinestore.persistence.dto.converters.ProductDtoToProductConverter;
import com.skious.onlinestore.persistence.enteties.Product;

public class MySqlProductManagementService implements ProductManagementService {

	private ProductDao productDao;
	private ProductDtoToProductConverter productConverter;
	
	{
		productDao = new MySqlJdbcProductDao();
		productConverter = new ProductDtoToProductConverter();
	}
	
	@Override
	public List<Product> getProducts() {
		List<ProductDto> productDtos = productDao.getProducts();
		return productConverter.convertProductDtosToProducts(productDtos);
	}

	@Override
	public Product getProductById(int id) {
		ProductDto productDto = productDao.getProductById(id);
		return productConverter.convertProductDtoToProduct(productDto);
	}

}
