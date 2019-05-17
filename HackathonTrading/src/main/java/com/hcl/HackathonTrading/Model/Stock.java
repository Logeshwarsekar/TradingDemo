package com.hcl.HackathonTrading.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="stock")
public class Stock implements Serializable{
	
	@Id
	@GeneratedValue(
		    strategy= GenerationType.AUTO, 
		    generator="native"
		)
		@GenericGenerator(
		    name = "native", 
		    strategy = "native")
	private int sId;
	
	private String name;
	private long availStock;
	private double price;
	
	public Stock() {
	}
	
	
	public Stock(int sId, String name, long availStock, double price) {
		super();
		this.sId = sId;
		this.name = name;
		this.availStock = availStock;
		this.price = price;
	}


	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAvailStock() {
		return availStock;
	}
	public void setAvailStock(long availStock) {
		this.availStock = availStock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


}
