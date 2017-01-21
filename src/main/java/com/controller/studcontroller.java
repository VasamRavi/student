package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import controllerimpl.implementation;

@Controller
public class studcontroller {
	
	
	@Autowired
	implementation impl;
	
	@RequestMapping(value="/pass", method=RequestMethod.GET)
	public String save(@RequestParam String name,@RequestParam String rollnumber){
		System.out.println("entering into controller");
	impl.save(name,rollnumber);
	return "ready";
	}
	

}
