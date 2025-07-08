package com.zoho_crm_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.zoho_crm_app.entity.Billing;
import com.zoho_crm_app.services.BillingSevices;

@Controller
public class BillingController {
	
	@Autowired
	private BillingSevices billingSevices;
	
	@GetMapping("/generateBill")
	public String generateBill() {
		
		return "generate_bill";
	}
	
	
	@PostMapping("/saveBill")
	public String generateBill(@ModelAttribute("billing") Billing billing , ModelMap modelMap) {
		

		billingSevices.saveOneBill(billing);
		
		modelMap.addAttribute("msg", "Bill is generated");
		
		return "generate_bill";
	}

}
