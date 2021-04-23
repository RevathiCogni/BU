package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;
/**
 * 
 * @author Revathi
 *
 */

@SpringBootApplication
@Slf4j
public class CampusRecruitmentSystemApplication {

	public static void main(String[] args) {
		log.info("Started Main");
		SpringApplication.run(CampusRecruitmentSystemApplication.class, args);
		log.info("Ended Main");
	}

}
