package io.tanzu.workshop.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import io.tanzu.workshop.model.User;

public class UserRepository {
	
	private static List<User> users = new ArrayList<>();
	
	private static int counter = 3;
	
	static {
		users.add(new User(1, "vinodh", new Date()));
		users.add(new User(2, "kumar", new Date()));
		users.add(new User(3, "mahendra", new Date()));
	}

	
	public List<User> findAll() {
		return users;
	}
	
	public User save (User user) {
		if (user.getId() == null) {
			user.setId(++counter);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}