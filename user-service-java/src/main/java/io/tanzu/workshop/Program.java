package io.tanzu.workshop;

import io.tanzu.workshop.services.UserService;

public class Program {
	
	public static void main(String[] args) {
		// depends on UserService
		
		UserService instance = new UserService();
		
		instance.retreiveAlUsers().forEach(user -> System.out.println(user));
	}
}
