package com.zoho_crm_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho_crm_app.entity.Contact;
import com.zoho_crm_app.entity.Lead;
import com.zoho_crm_app.services.ContactService;
import com.zoho_crm_app.services.LeadServices;

@Controller
public class LeadController {
	
	
	@Autowired
	private LeadServices leadServices;
	
	@Autowired
	private ContactService contactService;
	
	
	@GetMapping("/viewLeadPage")
	public String viewLeadPage() {
		
		return"createLeadPage";
	}
	
	@PostMapping("/saveLeads")
	public String saveLeads(@ModelAttribute("lead") Lead lead, ModelMap modelMap) {
		
		leadServices.saveOneLead(lead);
		modelMap.addAttribute("lead", lead);
		
		return "showLeadPage";
	}
	
	@PostMapping("/convertLeads")
	public String convertLeads(@RequestParam("id") long id, Model model) {
		
		Lead lead = leadServices.findById(id);
		
		Contact contact = new Contact();
		
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.saveContact(contact);
		
		leadServices.deleteById(id);
		
		List<Contact> contacts = contactService.getAllContact();
		model.addAttribute("contacts", contacts);
		
		return "contact_list";
		
	}
	
	@RequestMapping("/listAll")
	public String listAllLeads(Model model) {
		
		List<Lead> leads = leadServices.getAllLeads();
		model.addAttribute("leads", leads);
		
		return "list_leads";
	}
	
	@RequestMapping("/showLeadPage")
	public String showLeadPage(@RequestParam("id") long id, Model mode) {
		
		Lead lead= leadServices.findById(id);
		return "showLeadPage";
	}

}
