package com.simon.loan.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.simon.loan.entity.Tuser;
import com.simon.loan.entity.User;
import com.simon.loan.service.ILoanService;

@Controller
@RequestMapping("/index")
public class IndexControl {

	@Resource
	private ILoanService service;

	@RequestMapping("/")
	public String list() {
		System.out.println("----:");
		return "hel";
	}

	@RequestMapping("/tes")
	public String ss() {
		return "hel";
	}

	@RequestMapping("/q")
	public String index(@RequestParam(value = "page") Integer page,
			@RequestParam(value = "size") Integer size, Model model) {
		
		Sort sort = new Sort(Direction.DESC, "id");
		Pageable pageable = new PageRequest(page, size, sort);
		model.addAttribute("result",service.getLoanList(pageable));
		return "index";
	}

	@RequestMapping("/ii")
	public @ResponseBody List<User> helloWorld(@RequestParam(value = "page") Integer page,
			@RequestParam(value = "size") Integer size) {
		Sort sort = new Sort(Direction.DESC, "id");
		Pageable pageable = new PageRequest(page, size, sort);
		return service.getLoanList(pageable).getContent();
	}
	
	@RequestMapping("/qq")
	public @ResponseBody Page<Tuser> helloa(@RequestParam(value = "page") Integer page,
			@RequestParam(value = "size") Integer size) {
		
		Sort sort = new Sort(Direction.DESC, "id");
		Pageable pageable = new PageRequest(page, size, sort);
		return service.getUsers(pageable);
	}
}
