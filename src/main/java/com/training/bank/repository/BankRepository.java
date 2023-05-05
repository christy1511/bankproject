package com.training.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.training.bank.entity.Bank;

public interface BankRepository extends JpaRepository<Bank,Integer> {
	@Query(value = "select ifsc from bank where branch like %?% ", nativeQuery = true)
	 public String getByIfsc(String branch);
	

}
