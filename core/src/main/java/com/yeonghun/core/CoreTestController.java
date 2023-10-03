package com.yeonghun.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoreTestController {
	
	@GetMapping("/core")
	public ResponseEntity<String> test() {
		
		System.out.println();
		System.out.println("##### Core 의 Controller #####");
		System.out.println();
		
		String result = "core 의 controoler";
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
	
}
