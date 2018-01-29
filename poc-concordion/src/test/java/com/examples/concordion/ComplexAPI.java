package com.examples.concordion;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import com.examples.JsonService;

@RunWith(ConcordionRunner.class)
public class ComplexAPI  {

	private final JsonService jsonService = new JsonService();

	public String getMd5(final String text){
		return jsonService.getMd5(text).getMd5();
	}
	
	
	public Double getMaxTempWhether(final String place){
		return jsonService.getForecast(place).getList().get(0).getTemp().getMax();
	}

	public boolean checkTemperature(final String place, final Double temp){
		System.out.println(place +" - " +  temp);
		return true;
	}

	
}
