package com.cognizant.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Users;
@Repository
public interface UsersDao extends JpaRepository<Users, Integer> {

	Users findUserByUsername(String username);
	
	@Query("select u from Users u where u.roles=?1")
	List<Users> findByRoles(String roles);
	
	//@Query("select u from Users where u.id=?1 and u.roles=?2")
	public Users findByIdAndRoles(int id,String roles);
}
