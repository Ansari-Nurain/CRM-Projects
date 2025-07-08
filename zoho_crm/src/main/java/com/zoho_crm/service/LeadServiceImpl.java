package com.zoho_crm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zoho_crm.entity.Lead;
import com.zoho_crm.repositery.LeadRepositery;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepositery leadRepo;

	@Override
	public void saveOneLead(Lead l) {

		leadRepo.save(l);

	}

	@Override
	public List<Lead> findAllData() {

		List<Lead> findAll = leadRepo.findAll();

		return findAll;
	}

	@Override
	public void deleteOneLead(long id) {

		leadRepo.deleteById(id);

	}

	@Override
	public Lead updateOneLead(long id) {

		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();

		return lead;
	}

}
