package com.simon.loan.repositoy;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.simon.loan.entity.User;

public interface LoanRepositoy extends PagingAndSortingRepository<User,Long>{

	List<User> findByName(String name);
	
	List<User> findByEmail(String email);
	
}
