package com.smoothstack.scrumptious_auth.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.scrumptious_auth.dto.CreateCustomerDto;
import com.smoothstack.scrumptious_auth.service.UserAccountService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class UserAccountController {

	
	private final UserAccountService userAccountService;

	@PostMapping("/register")
	public String createNewCustomer(@Valid @RequestBody CreateCustomerDto createCustomerDto) {
		
		return userAccountService.createNewCustomer(createCustomerDto);
	}
	
	@PostMapping("/register/1")
	public ResponseEntity<Integer> createNewAccountCustomer(@Valid @RequestBody CreateCustomerDto createCustomerDto) {
		userAccountService.createNewAccountCustomer(createCustomerDto);
		
		return ResponseEntity.created(URI.create("/accounts/register/" + 1)).body(1);
	}
}
