package com.dubbo.serviceImpl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		context.start();
		System.out.println("��������˳�");
		System.in.read();
	}
}
