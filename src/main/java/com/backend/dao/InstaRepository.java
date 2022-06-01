package com.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.entity.Login;

public interface InstaRepository  extends JpaRepository<Login, Integer>{

	
	
}
