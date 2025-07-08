package com.zoho_crm_app.services;

import java.util.List;

import com.zoho_crm_app.entity.Lead;

public interface LeadServices {
	
	public void saveOneLead(Lead lead);

	public Lead findById(long id);

	public void deleteById(long id);

	public List<Lead> getAllLeads();

}
