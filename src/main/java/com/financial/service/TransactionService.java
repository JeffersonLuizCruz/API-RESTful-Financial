package com.financial.service;

import java.util.Optional;

import com.financial.model.Transaction;

public interface TransactionService {
	
	Transaction save(Transaction transaction);
	
	void deleteById(Long transactionId);
	
	Optional<Transaction> findById(Long id);
	
	Optional<Transaction> findByNsu(String nsu);

}
