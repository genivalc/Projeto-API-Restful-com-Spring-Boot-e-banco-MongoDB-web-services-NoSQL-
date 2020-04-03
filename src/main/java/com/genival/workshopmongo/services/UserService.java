package com.genival.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genival.workshopmongo.domain.User;
import com.genival.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	//injeção de dependencia
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}