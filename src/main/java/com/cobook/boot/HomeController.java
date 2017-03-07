package com.cobook.boot;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

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
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * boot
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home2(Locale locale, Model model) {
		logger.info("index");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
	
	@RequestMapping(value = "/index/banner", method = RequestMethod.GET)
	public String banner(Locale locale, Model model) {
		logger.info("index/banner");
		return "index/banner";
	}
	
	@RequestMapping(value = "/index/cobookList", method = RequestMethod.GET)
	public String cobookList(Locale locale, Model model) {
		logger.info("index/cobookList");
		return "index/cobookList";
	}
	
	
	@RequestMapping(value = "/index/monthlyList", method = RequestMethod.GET)
	public String monthlyList(Locale locale, Model model) {
		logger.info("index/monthlyList");
		return "index/monthlyList";
	}
	
	@RequestMapping(value = "/index/alladinList", method = RequestMethod.GET)
	public String alladinList(Locale locale, Model model) {
		logger.info("index/alladinList");
		return "index/alladinList";
	}
}
