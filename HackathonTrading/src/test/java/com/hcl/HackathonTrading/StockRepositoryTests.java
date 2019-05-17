package com.hcl.HackathonTrading;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.HackathonTrading.Model.Stock;
import com.hcl.HackathonTrading.Repository.StockRepository;
import com.hcl.HackathonTrading.Service.StockServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StockRepositoryTests {

	private static final Logger logger = LoggerFactory.getLogger(HackathonTradingApplication.class);
	
	/*
	 * @Autowired private TestEntityManager entityManager;
	 */
	@Mock
	private StockRepository stockRepository;
	
	@InjectMocks
	StockServiceImpl stockServiceImpl;

	private Stock stockList;

	/*
	 * @Test public void testFindBysId() { Stock stock = new Stock();
	 * entityManager.persist(stock);
	 * 
	 * int findBySId = stock.getsId();
	 * 
	 * assertEquals(findBySId, stockRepository.findBySId(3));
	 * 
	 * }
	 */
	@Test
public void whenValidId_thenStockShouldBeFound() {
		Stock abc =new Stock(1,"abc",2000,25);
		Mockito.when(stockRepository.findBySId(1)).thenReturn(abc);
		/*
		 * Stock stocks=stockServiceIntf.getStockBySId();
		 * assertThat(stock.getName()).isEqualTo(abc);
		 */
		
		Stock stocks=stockServiceImpl.findBySId(1);
		
		assertThat(stocks).isEqualTo(abc);
		logger.info("Logger sets Successfully");
		//System.out.println("Testcase");
}
}
