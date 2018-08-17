package com.capgemini.adminstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.adminstore.beans.Merchant;
import com.capgemini.adminstore.services.AdminServices;

@RestController
public class AdminActionController {
	

	@Autowired
	private AdminServices adminService;
	
	@RequestMapping(value="/addMerchant", method=RequestMethod.POST)
	public void addMerchant(@RequestBody Merchant merchant) {
		
		adminService.addMerchant(merchant);
	}
	
	@RequestMapping(value="/getAllMerchant")
	public List<Merchant> getAllMerchant() {
		
		return adminService.viewAllMerchants();
	}
}
