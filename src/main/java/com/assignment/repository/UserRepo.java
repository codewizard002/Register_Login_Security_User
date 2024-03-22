package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByEmail(String emaill);

}
