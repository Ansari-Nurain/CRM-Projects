package com.zoho_crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zoho_crm.entity.Lead;
import com.zoho_crm.repositery.LeadRepositery;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {

	@Autowired
	private LeadRepositery leadRepo;
	
	@GetMapping
	public List<Lead> getAllData() {
		
		List<Lead> leads = leadRepo.findAll();
		return leads;
		
	}
	
	@PostMapping
	public void saveLead(@RequestBody Lead lead) {
		
		leadRepo.save(lead);
		
	}
	
// http://localhost/api/leads/delete?id=3 --- this is called query parameter and we can delete this is 
//		using @RequestParam
	
// but http://localhost/api/leads/delete/3 --- this is called path variable and we can delete this is 
//	using @PathVariable
	
	
	@DeleteMapping("/delete/{id}")
	public void deleteLead(@PathVariable("id") long id) {
		
		leadRepo.deleteById(id);
		
	}
	
	@PutMapping(path= "/updateLead")
	public void updateLocation(@RequestBody Lead lead) {
		
		leadRepo.save(lead);
	}
	
}
