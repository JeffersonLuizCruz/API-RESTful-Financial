package com.financial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financial.model.Statistic;

@Repository
public interface StatisticRepository extends JpaRepository<Statistic, Long>{

}
