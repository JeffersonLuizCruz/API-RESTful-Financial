package com.financial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financial.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
	Optional<Transaction> findByNsu(String nsu);

}
