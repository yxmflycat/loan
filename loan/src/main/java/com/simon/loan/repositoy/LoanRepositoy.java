package com.simon.loan.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simon.loan.entity.User;

public interface LoanRepositoy extends JpaRepository<User,Long>{

	List<User> findByName(String name);
	
	List<User> findByEmail(String email);
	
}
