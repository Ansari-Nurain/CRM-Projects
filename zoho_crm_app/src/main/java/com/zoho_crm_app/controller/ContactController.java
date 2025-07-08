package com.zoho_crm_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zoho_crm_app.entity.Contact;
import com.zoho_crm_app.services.ContactService;

@Controller
public class ContactController {
	
//	@Autowired
//	ContactService contactService;
//	
	
	
	
	private ContactService contactService;
	
	
	public ContactController(ContactService contactService) {
		super();
		this.contactService = contactService;
	}



	@RequestMapping("/getAllContact")
	public String getAllContact(Model model) {
		
		List<Contact> contacts = contactService.getAllContact();
		model.addAttribute("contacts", contacts);
		
		return "contact_list";
	}

}
