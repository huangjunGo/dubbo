package com.dubbo.serviceImpl;

import com.dubbo.service.TestService;

public class TestServiceImpl implements TestService{

	public String hello(String name) {
		return "hello "+ name;
	}

}
