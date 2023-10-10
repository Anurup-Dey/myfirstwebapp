package com.anurup.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepositery extends JpaRepository<Todo, Integer> {
	
	public List<Todo> findByUsername(String username);
}
