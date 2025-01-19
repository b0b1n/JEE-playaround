package com.skious.onlinestore.persistence.dto.converters;

import com.skious.onlinestore.persistence.dto.CategoryDto;

public class CategoryDtoToCategoryConverter {

	public CategoryDto convertCategoryNameToCategoryDtoWithOnlyName(String categoryName) {
		CategoryDto categoryDto = new CategoryDto();
		categoryDto.setCategoryName(categoryName);
		return categoryDto;
	}

}
