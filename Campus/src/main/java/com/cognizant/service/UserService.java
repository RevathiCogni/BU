package com.cognizant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.exception.UserNotFoundException;
import com.cognizant.model.Users;

@Service
public interface UserService {

	public Users addCoordinator(Users user);
	public Users getCoordinatorById(int id) throws UserNotFoundException;
	public List<Users> getAllCoordinators();
	public Users deleteCoordinator(int id) throws UserNotFoundException;
	public Users updateCoordinator(int id, Users user) throws UserNotFoundException;
	
}
