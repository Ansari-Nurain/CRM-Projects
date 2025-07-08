package com.zoho_crm_app.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho_crm_app.entity.Lead;

public interface LeadRepositery extends JpaRepository<Lead, Long> {

}
