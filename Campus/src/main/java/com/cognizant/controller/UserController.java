package com.cognizant.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.exception.UserNotFoundException;
import com.cognizant.model.Users;
import com.cognizant.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Revathi
 *
 */

@RestController
@Slf4j
@RequestMapping("api/v1/coordinator")
	public class UserController {

	/**
	 * Service UserService autowired
	 */
	@Autowired
	private UserService userService;

	/**
	 * addCoordinator method is used to add a coordinator to the user table
	 * @param object of Users
	 * @return object of Users
	 */
	@PostMapping("/addCoordinator")
	public Users addCoordinator(@RequestBody @Valid Users user)
	{
		log.info("In Controller-addCoordinator");
		Users addUser = userService.addCoordinator(user);
		log.debug("Added user: {}",addUser);
		log.info("Ended Controller-addCoordinator");
	    return addUser;
	}

	/**
	 * getCoordinatorById method is used to retrieve a record by Id  
	 * @param id
	 * @throws UserNotFoundexception
	 * @return object of Users
	 */
	@GetMapping("/getCoordinatorById/{id}")   	
	public Users getCoordinatorById(@PathVariable("id") int id) throws UserNotFoundException
	{
		log.info("In Controller-getCoordinatorById");
		log.debug("User with "+id+"is {}",userService.getCoordinatorById(id));
		log.info("Ended Controller-getCoordinatorById");
	    return userService.getCoordinatorById(id);
	    
	}
	
	/**
	 * getAllCoordinators method is used to get all the coordinators from the user table
	 * @param 
	 * @return List of Users
	 */
	@GetMapping("/getAllCoordinators")   	
	public List<Users> getAllCoordinators()
	{
		log.info("In Controller-getAllCoordinators");
		log.debug("Users are:{}",userService.getAllCoordinators());
		log.info("Ended Controller-getAllCoordinators");
	    return userService.getAllCoordinators();
	}	

	/**
	 * deleteCoordinator method is used to delete a coordinator from the user table by Id
	 * @param id 
	 * @throws UserNotFoundException 
	 * @return Users object
	 */
	@DeleteMapping("/deleteCoordinator/{id}")   	
	public Users deleteCoordinator(@PathVariable("id") int id) throws UserNotFoundException
	{
		log.info("In Controller-deleteCoordinator");
		log.debug("Deleted user is:{}",userService.deleteCoordinator(id));
		log.info("Ended Controller-deleteCoordinator");
	    return userService.deleteCoordinator(id);
	}	

	/**
	 * updateCoordinator method is used to update a coordinator from the user table by Id
	 * @param id
	 * @param object of Users 
	 * @throws UserNotFoundException
	 * @return Users object
	 */
	@PutMapping("/updateCoordinator/{id}")   	
	public Users updateCoordinator(@PathVariable("id") int id, @RequestBody @Valid Users user) throws UserNotFoundException
	{
		log.info("In Controller-updateCoordinator");
		log.debug("Updated user is:{}",userService.updateCoordinator(id,user));
		log.info("Ended Controller-updateCoordinator");
	    return userService.updateCoordinator(id,user);
	}	


}

	
	