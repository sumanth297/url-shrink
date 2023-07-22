package com.springboot.app.shrinker;

import java.sql.Date;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.springboot.app.dto.UrlRequest;

/**
 * @author sumanthug
 *
 */
@RestController
public class ShrinkURLController implements ShrinkURLConstants{

	@Autowired
	private ShrinkURLService shrinkService;
	
	@RequestMapping(value="/hello")
	public String hello() {
		return "Hello User! I am Sumanth (Backend Engineer)";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/shrnink")
	public String shrinkURL(@RequestBody UrlRequest body) {
		
		String url = body.getUrl();
		Long expiry = body.getExpiryDate();
		System.out.println("expiry at" + expiry);
		return shrinkService.generateShrinkURl(url);
	}
	
	@RequestMapping(value="/{url}")
	public String getRedirectURL(@PathVariable String url) {
		return shrinkService.getUrl(url);
	}
	
}
