package com.zoho_crm_app.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho_crm_app.entity.Contact;

public interface ContactRepositery extends JpaRepository<Contact, Long> {

}
