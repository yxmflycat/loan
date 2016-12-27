package com.simon.loan.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.simon.loan.entity.User;
import com.simon.loan.repositoy.LoanRepositoy;
import com.simon.loan.service.ILoanService;

public class LoanServiceImpl implements ILoanService{

	@Resource
	private LoanRepositoy loan;
	
	@Override
	public List<User> getLoanList() {
		
		return loan.findAll((Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb)->{
			return cb.equal(query.from(User.class).get("name"), query);
		});
	}

}
