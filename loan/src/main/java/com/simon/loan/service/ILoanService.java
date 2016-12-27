package com.simon.loan.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.simon.loan.entity.User;


public interface ILoanService {

	Page<User> getLoanList(Pageable pageable);
}
