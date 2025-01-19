package com.skious.onlinestore.core.services.impl;

import java.util.List;

import com.skious.onlinestore.core.services.PurchaseManagementService;
import com.skious.onlinestore.persistence.dao.PurchaseDao;
import com.skious.onlinestore.persistence.dao.impl.MySqlJdbcPurchaseDao;
import com.skious.onlinestore.persistence.dto.PurchaseDto;
import com.skious.onlinestore.persistence.dto.converters.PurchaseDtoToPurchaseConverter;
import com.skious.onlinestore.persistence.enteties.Purchase;

public class MySqlPurchaseManagementService implements PurchaseManagementService {
	
	private PurchaseDao purchaseDao;
	private PurchaseDtoToPurchaseConverter purchaseConverter;
	
	{
		purchaseDao = new MySqlJdbcPurchaseDao();
		purchaseConverter = new PurchaseDtoToPurchaseConverter();
	}

	@Override
	public void addPurchase(Purchase purchase) {
		purchaseDao.savePurchase(purchaseConverter.convertPurchaseToPurchaseDto(purchase));
	}

	@Override
	public List<Purchase> getPurchasesByUserId(int userId) {
		List<PurchaseDto> purchasesDtos = purchaseDao.getPurchasesByUserId(userId);
		return purchaseConverter.convertPurchaseDtosToPurchases(purchasesDtos);
	}

	@Override
	public List<Purchase> getPurchases() {
		List<PurchaseDto> purchasesDtos = purchaseDao.getPurchases();
		return purchaseConverter.convertPurchaseDtosToPurchases(purchasesDtos);
	}

}
