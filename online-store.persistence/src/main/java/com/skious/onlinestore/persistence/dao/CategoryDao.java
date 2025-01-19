package com.skious.onlinestore.persistence.dao;

import com.skious.onlinestore.persistence.dto.CategoryDto;

public interface CategoryDao {

	CategoryDto getCategoryByCategoryId(int id);

}
