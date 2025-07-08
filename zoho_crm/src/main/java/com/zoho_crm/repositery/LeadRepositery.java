package com.zoho_crm.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho_crm.entity.Lead;

public interface LeadRepositery extends JpaRepository<Lead, Long> {

}
