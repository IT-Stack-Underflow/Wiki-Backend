package com.itstackunderflow.wiki.wiki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itstackunderflow.wiki.wiki.dto.WikiDto;
import com.itstackunderflow.wiki.wiki.service.WikiService;

@RestController
public class TestController {
		
	@Autowired
	private WikiService wikiService;
	
		@RequestMapping("/")
		public String hello() {
			return "Hello World!";
		}
		
		@RequestMapping(value = "/test", method=RequestMethod.GET)
		public List<WikiDto> test() throws Exception{
			return wikiService.selectAll();
		}
}
