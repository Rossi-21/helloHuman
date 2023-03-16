package com.rossi21.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String searchQuery, @RequestParam(value="last_name", required=false)String last_name) {
		if(searchQuery == null && last_name == null) {
			return "Hello Human";
		}
		else if(last_name == null){
			return "Hello " + searchQuery;
		}
		else {
			return "Hello " + searchQuery +" " + last_name;
		}
		
        
    }
	
}
