package com.examples;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.examples.vo.ForecastResponse;
import com.examples.vo.Md5Response;

/**
 */
@ApplicationScoped
public class JsonService {

	private String apikey = "b6907d289e10d714a6e88b30761fae22";

	private Client client;
	private WebTarget target;

	protected void initForecastApi() {
		client = ClientBuilder.newClient();
		// example query params: ?q=Turku&cnt=10&mode=json&units=metric
		target = client.target("http://openweathermap.org/data/2.5/forecast/daily/")
				.queryParam("cnt", "10")
				.queryParam("mode", "json")
				.queryParam("units", "metric")
				.queryParam("appid", apikey);
	}

	public ForecastResponse getForecast(String place) {
		initForecastApi();
		System.out.println(target
				.queryParam("q", place).getUri().toString());
		return target
				.queryParam("q", place)
				.request(MediaType.APPLICATION_JSON)
				.get(ForecastResponse.class);
	}

	protected void initMd5Api() {
		client = ClientBuilder.newClient();
		target = client.target("http://md5.jsontest.com/");
	}

	public Md5Response getMd5(String text) {
		initMd5Api();
		return target
				.queryParam("text", text)
				.request(MediaType.APPLICATION_JSON)
				.get(Md5Response.class);
	}

}
