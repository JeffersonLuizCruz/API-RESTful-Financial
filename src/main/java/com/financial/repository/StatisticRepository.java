package com.financial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financial.model.Statistic;

public interface StatisticRepository extends JpaRepository<Statistic, Long>{

}
