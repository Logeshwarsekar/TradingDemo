package com.hcl.HackathonTrading.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.HackathonTrading.Model.Stock;
import com.hcl.HackathonTrading.Repository.StockRepository;

@Service
public class StockServiceImpl implements StockServiceIntf{
	
	@Autowired
	StockRepository stockRepository;

	public List<Stock> findAll() {
		
		List<Stock> stockList = (List<Stock>) stockRepository.findAll();
		
		return stockList;
	}

	
	public Stock findBySId(int sId) {
		
		return stockRepository.findBySId(sId);
	}

}
