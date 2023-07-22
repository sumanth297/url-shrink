package com.springboot.app.shrinker;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author sumanthug
 *
 */
/* Created this Entity  to persist data in Database*/
@Entity
public class ShrinkURL {

	@Id
	private String id; 
	private String longUrl;
	private String shortUrl;
	private Timestamp createAt;
	private Timestamp expiryAt;
	
	public ShrinkURL(String id, String longUrl, String shortUrl, Timestamp createAt, Timestamp expiryAt) {
		super();
		this.id = id;
		this.longUrl = longUrl;
		this.shortUrl = shortUrl;
		this.createAt = createAt;
		this.expiryAt = expiryAt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLongUrl() {
		return longUrl;
	}
	public void setLongUrl(String longUrl) {
		this.longUrl = longUrl;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public Timestamp getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}

	public Timestamp getExpiryAt() {
		return expiryAt;
	}

	public void setExpiryAt(Timestamp expiryAt) {
		this.expiryAt = expiryAt;
	}

	
	
}
