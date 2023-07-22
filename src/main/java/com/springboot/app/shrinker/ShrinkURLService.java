package com.springboot.app.shrinker;

import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import com.google.common.hash.Hashing;

/**
 * @author sumanthug
 *
 */
@Service
public class ShrinkURLService {

	@Autowired
	StringRedisTemplate redisTemplate;

	public String getUrl(String id) {
		String url = redisTemplate.opsForValue().get(id);
		return url;
	}

	public String generateShrinkURl(String url) {
		LocalDateTime time = LocalDateTime.now();
		@SuppressWarnings("deprecation")
		String id = Hashing.murmur3_32().hashString(url.concat(time.toString()), StandardCharsets.UTF_8).toString();
		redisTemplate.opsForValue().set(id, url);
		System.out.println(url + " " + id);
		System.out.println(encodeUrl(url));
		return id;
	}

	private String encodeUrl(String url) {
		String encodedUrl = "";
		encodedUrl = Hashing.murmur3_128().hashString(url, StandardCharsets.UTF_8).toString();
		return encodedUrl;
	}

}
