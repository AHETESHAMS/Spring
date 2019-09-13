package com.bridgelabz.DependencyInjectionAutowired;

import org.springframework.stereotype.Component;

@Component
public class Tyre 
{
	private String brand = "MRF";

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
