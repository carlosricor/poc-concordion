package com.examples.vo;

import java.util.HashMap;
import java.util.Map;

public class Md5Response {

	private String md5;
	private String original;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
