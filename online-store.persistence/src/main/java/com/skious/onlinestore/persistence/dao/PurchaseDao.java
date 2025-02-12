package com.skious.onlinestore.persistence.dao;

import java.util.List;

import com.skious.onlinestore.persistence.dto.PurchaseDto;


public interface PurchaseDao {
	
	void savePurchase(PurchaseDto order);

	List<PurchaseDto> getPurchasesByUserId(int userId);
	
	List<PurchaseDto> getPurchases();

}
