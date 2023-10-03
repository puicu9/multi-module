package api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import core.TestService;

@Controller
public class ApiTestController {
	
	@GetMapping("/api")
	public ResponseEntity<String> test(){
		System.out.println();
		System.out.println("####### api test ########");
		System.out.println();
		
		TestService ts = new TestService();
		
		String result = ts.call(); // Core의 TestService 입니다.
		
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
	
}
