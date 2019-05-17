package com.hcl.HackathonTrading.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.HackathonTrading.Model.Stock;
import com.hcl.HackathonTrading.Service.StockServiceIntf;

@RestController
@RequestMapping("/TradeApp")
public class StockController {
	
	@Autowired
	StockServiceIntf stockServiceIntf;
	
	@GetMapping("/showstock")
	public List<Stock> showStock(){
		
		List<Stock> stockList = stockServiceIntf.findAll();
		
		return stockList;
		
	}
	
	@GetMapping("/selectstock/{id}")
	public Stock selectStock(@PathVariable("id") int sId) {
		
		
		return stockServiceIntf.findBySId(sId);
		
		
	}

}
