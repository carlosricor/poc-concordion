package com.examples.concordion;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import com.examples.JsonService;

@RunWith(ConcordionRunner.class)
public class SimpleAPI  {

	private final JsonService jsonService = new JsonService();
	
	public String getMd5(final String text){
		return jsonService.getMd5(text).getMd5();
	}

}
