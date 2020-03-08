package com.sathya.bean;

import org.springframework.stereotype.Service;

@Service
public class DemoService {


	public String sayHello()
	{
		return "hello";
	}
	public String sayByee()
	{
		return "Byee See You Soon";
	}
}
