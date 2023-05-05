package com.training.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.bank.entity.Bank;
import com.training.bank.service.BankService;



@RestController
public class BankController {
	@Autowired
	BankService bankSer;
	
	@PostMapping(value = "/addbank")
	public String addBank(@RequestBody Bank b) {
		return bankSer.addBank(b);
	}
	@GetMapping(value = "/getbank/{id}")
	public Bank getBankById(@PathVariable int id) {
		return bankSer.getBankById(id);
	}
	@GetMapping(value="/getbankList")
	public List<Bank> allbank() {
		return bankSer.allbank();
	}
	 @PutMapping(value = "/updatebank/{id}")
	   public String updateBank(@RequestBody Bank id) {
		  return bankSer.updateBank(id);
	   }
	 @DeleteMapping(value = "/delete/{id}")
	    public String deleteBank(@PathVariable int id) {
		  return bankSer.deleteBank(id);
	   }
	 @GetMapping(value="/getIfsc/{branch}")
		public String getByIfsc(@PathVariable String branch) {
			return bankSer.getByIfsc(branch);
		}

}
