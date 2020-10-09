package com.financial.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financial.model.Statistic;
import com.financial.repository.StatisticRepository;
import com.financial.service.StatisticService;

@Service
public class StatisticServiceImpl implements StatisticService{
	
	@Autowired
	StatisticRepository repository;

	@Override
	public Statistic save(Statistic statistic) {
		return repository.save(statistic);
	}

}
