package com.yeonghun.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.yeonghun.core.CoreService;

@Controller
public class ApiTestController {
	
	@Autowired
	CoreService cs ;
	
	@GetMapping("/api")
	public ResponseEntity<String> test(){
		System.out.println();
		System.out.println("####### api test ########");
		System.out.println();
		
		String result = cs.call(); // Core의 TestService 입니다.
		
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
	
}
