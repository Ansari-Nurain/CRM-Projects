package com.zoho_crm_app.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho_crm_app.entity.Billing;

public interface BillingRepositery extends JpaRepository<Billing, Long> {

}
