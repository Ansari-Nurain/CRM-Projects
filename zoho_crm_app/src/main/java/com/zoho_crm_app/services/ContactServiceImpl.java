package com.zoho_crm_app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho_crm_app.entity.Contact;
import com.zoho_crm_app.repositery.ContactRepositery;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepositery contactRepo;
	
	@Override
	public void saveContact(Contact contact) {

		contactRepo.save(contact);
	}

	@Override
	public List<Contact> getAllContact() {

		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact getContactById(long id) {

		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		
		return contact;
	}

}
