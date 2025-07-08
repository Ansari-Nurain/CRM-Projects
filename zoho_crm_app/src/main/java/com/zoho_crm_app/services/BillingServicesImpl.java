package com.zoho_crm_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho_crm_app.entity.Billing;
import com.zoho_crm_app.repositery.BillingRepositery;

@Service
public class BillingServicesImpl implements BillingSevices {
	
	@Autowired
	private BillingRepositery billingRepo;

	@Override
	public void saveBill(Billing billing) {
		
		billingRepo.save(billing);

		
	}

	@Override
	public void saveOneBill(Billing billing) {


		billingRepo.save(billing);
	}

}
