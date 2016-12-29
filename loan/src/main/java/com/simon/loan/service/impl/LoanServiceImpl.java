package com.simon.loan.service.impl;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.simon.loan.entity.Tuser;
import com.simon.loan.entity.User;
import com.simon.loan.repositoy.LoanRepositoy;
import com.simon.loan.repositoy.UserRepositoy;
import com.simon.loan.service.ILoanService;

@Service
public class LoanServiceImpl implements ILoanService{

	@Resource
	private LoanRepositoy loan;
	@Resource
	private UserRepositoy user;
	
	@Override
	public Page<User> getLoanList(Pageable pageable) {
		/*return loan.findAll((Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb)->{
			return cb.equal(query.from(User.class), null);
		});*/
		Page<User> page = loan.findAll(pageable);
		return page;
	}

	@Override
	public Page<Tuser> getUsers(Pageable pageable) {
		// TODO Auto-generated method stub
		return user.findAll(pageable);
	}

}
