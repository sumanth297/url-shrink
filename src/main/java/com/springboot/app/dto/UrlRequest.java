package com.springboot.app.dto;

import java.sql.Date;

public class UrlRequest {

	private String url;
	private Long expiryDate;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Long getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Long expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}

