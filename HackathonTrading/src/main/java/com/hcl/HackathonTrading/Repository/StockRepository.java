package com.hcl.HackathonTrading.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.HackathonTrading.Model.Stock;


@Repository
public interface StockRepository extends CrudRepository<Stock,Integer>{

	Stock findBySId(int sId);
	
	

}
