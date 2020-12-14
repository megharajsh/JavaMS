package io.tanzu.workshop.services;

import java.util.List;

import io.tanzu.workshop.model.User;
import io.tanzu.workshop.repository.UserRepository;

public class UserService {
	
	private UserRepository userRepository = new UserRepository();
	
	public List<User> retreiveAlUsers() {
		return userRepository.findAll();
	}

}
