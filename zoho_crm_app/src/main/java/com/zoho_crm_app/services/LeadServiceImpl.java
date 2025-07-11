package com.zoho_crm_app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho_crm_app.entity.Lead;
import com.zoho_crm_app.repositery.LeadRepositery;

@Service
public class LeadServiceImpl implements LeadServices {
	
	@Autowired
	private LeadRepositery leadRepo;

	@Override
	public void saveOneLead(Lead lead) {

		leadRepo.save(lead);
	}

	@Override
	public Lead findById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;		
	}

	@Override
	public void deleteById(long id) {

		leadRepo.deleteById(id);
	}

	@Override
	public List<Lead> getAllLeads() {

		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

}
