package com.financial.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financial.model.Transaction;
import com.financial.repository.TransactionRepository;
import com.financial.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	private TransactionRepository repository;

	@Override
	public Transaction save(Transaction transaction) {
		return repository.save(transaction);
	}

	@Override
	public Optional<Transaction> findByNsu(String nsu) {
		return repository.findByNsu(nsu);
	}

	@Override
	public void deleteById(Long transactionId) {
		repository.deleteById(transactionId);		
	}

	@Override
	public Optional<Transaction> findById(Long id) {
		return repository.findById(id);
	}

}
