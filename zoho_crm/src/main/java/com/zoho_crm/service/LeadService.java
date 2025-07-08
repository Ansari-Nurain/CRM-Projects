package com.zoho_crm.service;

import java.util.List;

import com.zoho_crm.entity.Lead;

public interface LeadService {

	public void saveOneLead(Lead l);

	public List<Lead> findAllData();

	public void deleteOneLead(long id);

	public Lead updateOneLead(long id);


}
