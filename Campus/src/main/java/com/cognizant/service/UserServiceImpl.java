package com.cognizant.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.UsersDao;
import com.cognizant.exception.UserNotFoundException;
import com.cognizant.model.Users;

import lombok.extern.slf4j.Slf4j;
/**
 * 
 * @author Revathi
 *
 */

@Service
@Slf4j
public class UserServiceImpl implements UserService {
	/**
	 * Repository UsersDao autowired
	 */
	@Autowired
	private UsersDao usersDao;
	
	/**
	 * addCoordinator method is used to add a coordinator to the user table
	 * @param object of Users
	 * @return object of Users
	 */
	@Override
	public Users addCoordinator(Users user) {
		log.info("In Service-addCoordinator");
		Users users = usersDao.save(user);
		log.debug("Added: {}",users);
		log.info("Ended Service-addCoordinator");
		return users;
	}

	/**
	 * getCoordinatorById method is used to retrieve a record by Id  
	 * @param id
	 * @throws UserNotFoundexception
	 * @return object of Users
	 */
	@Override
	public Users getCoordinatorById(int id) throws UserNotFoundException {
		log.info("In Service-getCoordinatorById");
		Users searchedUser= usersDao.findByIdAndRoles(id, "Coordinator");
		if(searchedUser == null) {
			throw new UserNotFoundException("Coordinator with ID " + id + " not found");
		}
		log.info("Ended Service-getCoordinatorById");
		return searchedUser;
	}

	/**
	 * getAllCoordinators method is used to get all the coordinators from the user table
	 * @param 
	 * @return List of Users
	 */
	@Override
	public List<Users> getAllCoordinators() {
		log.info("In Service-getAllCoordinators");
		List<Users> userList= usersDao.findByRoles("Coordinator");
		log.debug("Users are:{}",userList);
		log.info("Ended Service-getAllCoordinators");
		return userList;
	}

	
	/**
	 * deleteCoordinator method is used to delete a coordinator from the user table by Id
	 * @param id 
	 * @throws UserNotFoundException 
	 * @return Users object
	 */
	@Override
	public Users deleteCoordinator(int id) throws UserNotFoundException  {
		log.info("In Service-deleteCoordinator");
		Users user=null;
		Optional<Users> searchedUser = usersDao.findById(id);
		if(searchedUser.isEmpty()) {
			throw new UserNotFoundException("Coordinator with ID " + id + " not found");
		}
		user=searchedUser.get();
		usersDao.delete(user);
		log.debug("Deleted: {}",user);
		log.info("Ended Service-deleteCoordinator");
		return user;
	}


	/**
	 * updateCoordinator method is used to update a coordinator from the user table by Id
	 * @param id
	 * @param object of Users 
	 * @throws UserNotFoundException
	 * @return Users object
	 */
	@Override
	public Users updateCoordinator(int id, Users user) throws UserNotFoundException {
		log.info("In Service-updateCoordinator");
		Users oldUserDetails = usersDao.findById(id).get();
		if(oldUserDetails == null) {
			throw new UserNotFoundException("Coordinator with ID " + id + " not found");
		}
		oldUserDetails.setUsername(user.getUsername());
		oldUserDetails.setPassword(user.getPassword());
		oldUserDetails.setRoles(user.getRoles());
		oldUserDetails.setEmail(user.getEmail());
		oldUserDetails.setDob(user.getDob());
		oldUserDetails.setGender(user.getGender());
		oldUserDetails.setAddress(user.getAddress());
		oldUserDetails.setMobilenumber(user.getMobilenumber());
		
		Users newUserDetails = usersDao.save(oldUserDetails);
		log.debug("Updated:{}",newUserDetails);
		log.info("Ended Service-updateCoordinator");
		return newUserDetails;
	}
}	