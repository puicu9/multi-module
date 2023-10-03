package com.yeonghun.core;

import org.springframework.stereotype.Service;

@Service
public class CoreService {

	public String call(){
		
		String result = "Core의 TestService 입니다.";
		
		return result;
	}
	
}
