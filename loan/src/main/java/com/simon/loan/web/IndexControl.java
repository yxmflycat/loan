package com.simon.loan.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simon.loan.service.ILoanService;

@RestController  
@RequestMapping("/index")
public class IndexControl {

	
	@Resource
	private ILoanService service;
	
	
	@RequestMapping("/{id}")  
    public String list(@PathVariable("id") Long id) {  
		System.out.println("----:"+id);
		return "hel";
    }
	
	@RequestMapping("/ii")
    public String helloWorld(){
		service.getLoanList();
        return "hel";
    }
}
