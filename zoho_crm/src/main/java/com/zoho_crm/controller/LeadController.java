package com.zoho_crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho_crm.dto.LeadData;
import com.zoho_crm.entity.Lead;
import com.zoho_crm.repositery.LeadRepositery;
import com.zoho_crm.service.LeadService;
import com.zoho_crm.util.EmailService;
import com.zoho_crm.util.EmailServiceImpl;

import net.bytebuddy.asm.Advice.Return;

@Controller
public class LeadController {
	
	@Autowired
	EmailService emailService;
	
	@Autowired
	LeadService leadService;
	
	
	//Handler Method
	@RequestMapping("/viewLeadPage")
	public String viewLeadPage() {
		
		return "create_new_leads";
		
	}
	

	
//	-----First Approach----
	
//	@RequestMapping(value = "/saveLeads", method = RequestMethod.POST)
//	public String saveLeads(@ModelAttribute("lead") Lead l, ModelMap modelMap) {
//		
//		leadService.saveOneLead(l);
//		modelMap.addAttribute("msg","Data is save");
//		
//		return"create_new_leads";
//	}
	
	
	
//	-----Second Approach, if the lead name attribute and variable name in create_lead.jsp are different  ----
	
	
	
//	@RequestMapping("/saveLeads")
//	public String saveLeads(@RequestParam("name") String fname,@RequestParam("lastName") String lname,@RequestParam("email") String email,@RequestParam("city") String city,@RequestParam("mobile") Long mobile) {
//		
//		Lead lead = new Lead();
//		
//		lead.setFirstName(fname);
//		lead.setLastName(lname);
//		lead.setEmail(email);
//		lead.setMobile(mobile);
//		
//		leadService.saveOneLead(lead);
//		
//		return"create_new_leads";
//	}
	
	
	
	
//	-----Third Approach----
	
	
//	@RequestMapping(value = "/saveLeads", method = RequestMethod.POST)
//	public String saveLeads(LeadData data) {
//		
//		Lead lead = new Lead();
//		
//		lead.setId(data.getId());
//		lead.setFirstName(data.getFirstName());
//		lead.setLastName(data.getLastName());
//		lead.setEmail(data.getEmail());
//		lead.setMobile(data.getMobile());
//		
//		leadService.saveOneLead(lead);		
//		return"create_new_leads";
//	}
	
	
	
//	-----First Approach----
	
	@RequestMapping(value = "/saveLeads", method = RequestMethod.POST)
	public String saveLeads(@ModelAttribute("lead") Lead l, ModelMap modelMap) {
		
		leadService.saveOneLead(l);
		
//		EmailServiceImpl emailServiceImpl = new EmailServiceImpl();
		emailService.sendSimpleMail(l.getEmail(), "Test", "This is for testing perpuse");
		
		modelMap.addAttribute("msg","Data is save");
		
		return"create_new_leads";
	}
	
	

	@RequestMapping("/listall")
	public String findAllData(ModelMap modelMap) {
		
		List<Lead> findAllData = leadService.findAllData();
		modelMap.addAttribute("findAllData", findAllData);
		
		return "displayAll";
		
	}
	
	@RequestMapping("/delete")
	public String deleteLead(@RequestParam("id") long id, ModelMap modelMap) {
		
		leadService.deleteOneLead(id);
		
		List<Lead> findAllData = leadService.findAllData();
		modelMap.addAttribute("findAllData", findAllData);
		
		return "displayAll";
		
	}
	
	@RequestMapping("/update")
	public String updateLeads(@RequestParam("id") long id,ModelMap modelMap) {
		
		Lead leads = leadService.updateOneLead(id);
		modelMap.addAttribute("leads", leads);
		
		return"editLead";
	}

	@RequestMapping("/updateOneLead")
	public String updateOneLead(@ModelAttribute("lead") Lead l, ModelMap modelMap) {
		
		leadService.saveOneLead(l);
		List<Lead> lead = leadService.findAllData();
		modelMap.addAttribute("lead", lead);
		
		return "displayAll";
		
	}


}
