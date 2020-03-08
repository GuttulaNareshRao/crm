package com.sathya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.sathya.bean.DemoService;

public class DemoController {


	@Autowired
	DemoService service;

	@GetMapping("/hello")
	public String sayHello()
	{
		return service.sayHello();
	}
	@GetMapping("/byee")
	public String sayByee()
	{
		return service.sayByee();
	}
}
