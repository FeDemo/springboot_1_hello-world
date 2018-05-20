package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping({ "/", "/index" ,""})
	public String index(){
		return "hello springboot";
	}

	@RequestMapping("json")
	public Map json(){
		Map m=new HashMap();
		m.put("index1","str1");
		m.put("index2","str2");
		m.put("index3","str3");
		return m;
	}
}
