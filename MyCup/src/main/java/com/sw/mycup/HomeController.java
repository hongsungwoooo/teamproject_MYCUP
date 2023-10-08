package com.sw.mycup;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
//		try {
//			request.setCharacterEncoding("utf-8");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
		return "html/index";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "html/join";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "html/login";
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
		return "html/about";
	}
	
	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public String shop() {
		return "html/shop";
	}
	
	@RequestMapping(value = "/community/community_main", method = RequestMethod.GET)
	public String community_main() {
		return "html/community/community_main";
	}
	
	@RequestMapping(value = "/myInfo", method = RequestMethod.GET)
	public String myInfo() {
		return "html/myInfo";
	}
}
