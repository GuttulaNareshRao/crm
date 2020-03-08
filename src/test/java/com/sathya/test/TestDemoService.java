package com.sathya.test;

import org.junit.Assert;
import org.junit.Test;

import com.sathya.bean.DemoService;
public class TestDemoService {


	@Test
	public void test()
	{
		DemoService service=new DemoService();
		Assert.assertEquals("hello",service.sayHello());
	}
}
