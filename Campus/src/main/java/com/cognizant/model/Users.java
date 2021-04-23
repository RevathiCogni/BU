package com.cognizant.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull(message="Username cannot be null")
	private String username;
	
	
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$", 
	message="Password should be greater than 8 and lesser than 20. "
			+ "It should contain one lowercase, uppercase, special character, number and no spaces.")
	private String password;
	
	
	@Pattern(regexp = "Coordinator|Student", message = "Invalid role. Should be Coordinator or Student")
	private String roles;
	
	@Email(message = "Email should be valid")
	private String email;
	
	@Past
	private Date dob;
	
	@Pattern(regexp = "male|female", message = "Invalid gender")
	private String gender;
	private String address;
	
	
	@Pattern(regexp="[0-9]{10}", message="Mobile number should have 10 digits")
	private String mobilenumber;
}
