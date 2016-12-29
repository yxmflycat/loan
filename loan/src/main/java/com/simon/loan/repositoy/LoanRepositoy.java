package com.simon.loan.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simon.loan.entity.User;

public interface LoanRepositoy extends JpaRepository<User,Long>{

	
}
