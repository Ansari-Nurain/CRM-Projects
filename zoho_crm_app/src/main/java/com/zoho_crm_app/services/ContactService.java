package com.zoho_crm_app.services;

import java.util.List;

import com.zoho_crm_app.entity.Billing;
import com.zoho_crm_app.entity.Contact;

public interface ContactService {

	public void saveContact(Contact contact);

	public List<Contact> getAllContact();

	public Contact getContactById(long id);


	
}
