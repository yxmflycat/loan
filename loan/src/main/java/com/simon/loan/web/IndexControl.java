package com.simon.loan.web;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simon.loan.entity.User;
import com.simon.loan.service.ILoanService;

@RestController
@RequestMapping("/index")
public class IndexControl {

	@Resource
	private ILoanService service;

	@RequestMapping("/{id}")
	public String list(@PathVariable("id") Long id) {
		System.out.println("----:" + id);
		return "hel";
	}

	@RequestMapping("/ii")
	public Page<User> helloWorld(
			@PageableDefault(value = 10, sort = { "id" }, direction = Sort.Direction.DESC) Pageable pageable) {
		return service.getLoanList(pageable);
	}
}
