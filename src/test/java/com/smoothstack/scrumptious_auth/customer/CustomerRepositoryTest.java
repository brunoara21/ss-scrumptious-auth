package com.smoothstack.scrumptious_auth.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.smoothstack.scrumptious_auth.entity.User;
import com.smoothstack.scrumptious_auth.repository.UserRepository;

@DataJpaTest
public class CustomerRepositoryTest {

	@Autowired
	private UserRepository userRepo;
	
	@AfterEach
	void tearDown() {
		userRepo.deleteAll();
	}
	
	
	@Test
	void itShouldFindByUsername() {
		String username = "customer";
		User user = User.builder()
				.username(username)
				.build();
		userRepo.save(user);
		
		User userFound = userRepo.findByUsername(username).get();
		
		assertEquals(user, userFound);
	}
}
