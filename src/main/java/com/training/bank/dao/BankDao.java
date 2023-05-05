package com.training.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.bank.entity.Bank;
import com.training.bank.repository.BankRepository;


@Repository
public class BankDao {
	@Autowired
	BankRepository bRepo;
	public String addBank(Bank b) {
		bRepo.save(b);
		return "success";
		
	}
	public Bank getBankById(int id) {
		return bRepo.findById(id).get();
	}
	
    public List<Bank> allbank() {
	  return bRepo.findAll();
  }
    public String updateBank(Bank id) {
		bRepo.save(id);
		return "updated";
	}
	public String deleteBank(int Id) {
		bRepo.deleteById(Id);
		return "Successfully deleted";
	}
	 public String getByIfsc(String branch) {
		 return bRepo.getByIfsc(branch);
	 }

}
