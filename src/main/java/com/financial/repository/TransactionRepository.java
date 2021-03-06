package com.financial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financial.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{
	Optional<Transaction> findByNsu(String nsu);

}
