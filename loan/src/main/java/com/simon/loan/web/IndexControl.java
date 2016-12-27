package com.simon.loan.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping("/index")
public class IndexControl {

	@RequestMapping("/{id}")  
    public String list(@PathVariable("id") Long id) {  
		System.out.println("----:"+id);
		return "hel";
    }
	
	@RequestMapping("/ii")
    public String helloWorld(){
        return "hel";
    }
}
