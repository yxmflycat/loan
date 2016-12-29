package com.simon.loan.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simon.loan.entity.Tuser;

public interface UserRepositoy extends JpaRepository<Tuser,Long>{

	
}
