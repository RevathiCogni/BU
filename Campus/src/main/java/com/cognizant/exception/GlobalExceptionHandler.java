package com.cognizant.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cognizant.model.CustomErrorResponse;


@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<CustomErrorResponse> handleEmployeeException(Exception ex){
		CustomErrorResponse response = new CustomErrorResponse();
		response.setTimestamp(LocalDateTime.now());
		response.setStatus(HttpStatus.NOT_FOUND);
		response.setReason("Invalid information");
		response.setMessage(ex.getMessage());
		return new ResponseEntity<CustomErrorResponse>(response,HttpStatus.NOT_FOUND);
		
	}
}
