package com.training.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bank.dao.BankDao;
import com.training.bank.entity.Bank;


@Service
public class BankService {
	@Autowired
	BankDao bdao;
	public String addBank(Bank b) {
     return bdao.addBank(b);
}
	public Bank getBankById(int id) {
		return bdao.getBankById(id);
	}
	public List<Bank>allbank() {
		return bdao.allbank();
	}
	 public String updateBank(Bank id) {
			return bdao.updateBank(id);
		}
	 public String deleteBank(int id) {
			return bdao.deleteBank(id);
		}
	 public String getByIfsc(String branch) {
		 return bdao.getByIfsc(branch);
}

}
