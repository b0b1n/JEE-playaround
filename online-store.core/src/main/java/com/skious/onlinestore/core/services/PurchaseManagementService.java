package com.skious.onlinestore.core.services;

import java.util.List;

import com.skious.onlinestore.persistence.enteties.Purchase;

public interface PurchaseManagementService {

	void addPurchase(Purchase purchase);

	List<Purchase> getPurchasesByUserId(int userId);
	
	List<Purchase> getPurchases();
}
