package com.simon.loan.service.impl;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.simon.loan.entity.User;
import com.simon.loan.repositoy.LoanRepositoy;
import com.simon.loan.service.ILoanService;

@Service
public class LoanServiceImpl implements ILoanService{

	@Resource
	private LoanRepositoy loan;
	
	@Override
	public Page<User> getLoanList(Pageable pageable) {
		/*return loan.findAll((Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb)->{
			return cb.equal(query.from(User.class), null);
		});*/
		return loan.findAll(pageable);
	}

}
