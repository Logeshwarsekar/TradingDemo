package com.hcl.HackathonTrading.Service;

import java.util.List;

import com.hcl.HackathonTrading.Model.Stock;

public interface StockServiceIntf {

	List<Stock> findAll();

	Stock findBySId(int sId);
	
	
}
