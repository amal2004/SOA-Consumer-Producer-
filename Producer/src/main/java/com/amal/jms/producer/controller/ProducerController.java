package com.amal.jms.producer.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amal.jms.producer.model.Vendor;
import com.amal.jms.producer.service.MessageService;

@Controller
public class ProducerController {
	
	@Autowired
	private MessageService messageService;
	
	private static final Logger logger = LogManager.getLogger(ProducerController.class.getName());
			
	@RequestMapping("/")
	public String renderVendorPage(Vendor vendor, Model model){
		logger.info("Rendering index page");
		return "index";
	}

	@RequestMapping(value = "/vendor", method=RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("vendor") Vendor vendor, Model model){
		logger.info("Processing Vendor object");
		logger.info(vendor.toString());
		messageService.process(vendor);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("message", "Vendor added successfully");
		vendor = new Vendor();
		mv.addObject("vendor", vendor);
		return mv;
	}
	
}
